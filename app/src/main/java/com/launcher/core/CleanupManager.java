package com.launcher.core;

import java.io.File;

public class CleanupManager {
    public static void clearNatives(File gameDir) {
        File nativesDir = new File(gameDir, "natives");
        if (nativesDir.exists()) {
            File[] files = nativesDir.listFiles();
            if (files != null) {
                for (File f : files) f.delete();
            }
        }
    }
}
