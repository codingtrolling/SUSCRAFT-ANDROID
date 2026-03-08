package com.launcher.core;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class CommandPipe {
    private BufferedWriter writer;

    public CommandPipe(Process process) {
        this.writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
    }

    public void sendCommand(String cmd) {
        try {
            writer.write(cmd + "\n");
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
