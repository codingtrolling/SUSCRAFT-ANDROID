package com.launcher.core;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NetworkManager {
    private final ExecutorService executor = Executors.newFixedThreadPool(4);

    public void downloadFile(String fileUrl, String destination, Runnable onComplete) {
        executor.execute(() -> {
            try (BufferedInputStream in = new BufferedInputStream(new URL(fileUrl).openStream());
                 FileOutputStream fileOutputStream = new FileOutputStream(destination)) {
                byte[] dataBuffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                    fileOutputStream.write(dataBuffer, 0, bytesRead);
                }
                onComplete.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
