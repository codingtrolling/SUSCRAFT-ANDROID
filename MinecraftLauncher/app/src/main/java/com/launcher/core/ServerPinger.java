package com.launcher.core;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerPinger {
    public static long getPing(String host, int port) {
        long start = System.currentTimeMillis();
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host, port), 3000);
            return System.currentTimeMillis() - start;
        } catch (Exception e) {
            return -1; // Offline
        }
    }
}
