package com.launcher.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ProtocolHandler {
    public static void requestStatus(String host, int port) throws IOException {
        try (Socket socket = new Socket(host, port);
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             DataInputStream in = new DataInputStream(socket.getInputStream())) {

            // Handshake Packet
            out.writeByte(0x00); // Packet ID
            writeVarInt(out, 763); // Protocol version (1.20.1)
            writeString(out, host);
            out.writeShort(port);
            writeVarInt(out, 1); // Next state: Status

            // Request Packet
            out.writeByte(0x00); 
            
            // Response would be read here...
        }
    }

    private static void writeVarInt(DataOutputStream out, int value) throws IOException {
        while ((value & 0xFFFFFF80) != 0L) {
            out.writeByte((value & 0x7F) | 0x80);
            value >>>= 7;
        }
        out.writeByte(value & 0x7F);
    }

    private static void writeString(DataOutputStream out, String s) throws IOException {
        byte[] bytes = s.getBytes("UTF-8");
        writeVarInt(out, bytes.length);
        out.write(bytes);
    }
}
