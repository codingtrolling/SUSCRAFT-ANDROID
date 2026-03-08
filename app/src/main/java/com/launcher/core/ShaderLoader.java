package com.launcher.core;

import java.io.File;

public class ShaderLoader {
    public static void prepareShaders(File gameDir) {
        File shaderFolder = new File(gameDir, "shaderpacks");
        if (!shaderFolder.exists()) shaderFolder.mkdirs();
        
        // Log detected shaders for the UI selection menu
        File[] packs = shaderFolder.listFiles();
        if (packs != null) {
            for (File p : packs) {
                System.out.println("Detected shader: " + p.getName());
            }
        }
    }
}
