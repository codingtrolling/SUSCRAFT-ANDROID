package com.launcher.core;

import java.io.File;
import java.util.Map;

public class NativePathResolver {
    public static void setEnv(ProcessBuilder pb, File nativesDir) {
        Map<String, String> env = pb.environment();
        String currentPath = env.get("LD_LIBRARY_PATH");
        String newPath = nativesDir.getAbsolutePath();
        
        if (currentPath != null) {
            newPath = newPath + ":" + currentPath;
        }
        
        env.put("LD_LIBRARY_PATH", newPath);
        // Also set the Java-specific property
        env.put("JAVA_LIBRARY_PATH", nativesDir.getAbsolutePath());
    }
}
