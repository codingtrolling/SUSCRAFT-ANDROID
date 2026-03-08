package com.launcher.core;

import java.io.File;

public class FileUtil {
    public static void setupGameDirs(File root) {
        String[] dirs = {"assets", "libraries", "versions", "runtime"};
        for (String dir : dirs) {
            File f = new File(root, dir);
            if (!f.exists()) f.mkdirs();
        }
    }
}
