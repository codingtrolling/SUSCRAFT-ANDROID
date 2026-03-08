package com.launcher.core;

import java.io.File;

public class ForgeDetector {
    public static boolean isForge(File versionJson) {
        // Simple check for Forge strings in the filename or JSON content
        return versionJson.getName().toLowerCase().contains("forge");
    }
}
