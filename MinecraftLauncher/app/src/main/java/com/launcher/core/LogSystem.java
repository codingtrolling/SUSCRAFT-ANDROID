package com.launcher.core;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LogSystem {
    public static void monitorProcess(Process process) {
        new Thread(() -> {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    Log.d("MinecraftProcess", line);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
