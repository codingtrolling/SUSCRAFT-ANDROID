package com.launcher.core;

import java.io.File;

public class ResourcePackManager {
    public static File getPackDir(File gameDir) {
        File packDir = new File(gameDir, "resourcepacks");
        if (!packDir.exists()) packDir.mkdirs();
        return packDir;
    }
}
