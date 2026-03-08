package com.launcher.core;

import java.io.File;

public class NativeLoader {
    public static void loadNatives(File nativeDir) {
        String path = nativeDir.getAbsolutePath();
        System.setProperty("org.lwjgl.librarypath", path);
        System.setProperty("java.library.path", path);
        
        // Force reload of the library path cache
        try {
            java.lang.reflect.Field field = ClassLoader.class.getDeclaredField("sys_paths");
            field.setAccessible(true);
            field.set(null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
