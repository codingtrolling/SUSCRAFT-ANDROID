package com.launcher.core;

import java.io.File;
import java.nio.file.Files;

public class LegacyHandler {
    public static void setupLegacyAssets(File objectsDir, File virtualDir, String name, String hash) {
        try {
            File source = new File(objectsDir, hash.substring(0, 2) + "/" + hash);
            File target = new File(virtualDir, name);
            if (!target.getParentFile().exists()) target.getParentFile().mkdirs();
            
            // Create a link so we don't double the storage usage
            if (!target.exists()) {
                Files.createSymbolicLink(target.toPath(), source.toPath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
