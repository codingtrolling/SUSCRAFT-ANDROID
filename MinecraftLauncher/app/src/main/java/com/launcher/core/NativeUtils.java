package com.launcher.core;

import java.io.*;
import java.util.zip.*;

public class NativeUtils {
    public static void extractNatives(File zipFile, File targetDir) throws IOException {
        if (!targetDir.exists()) targetDir.mkdirs();
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                if (entry.getName().endsWith(".so")) {
                    File outFile = new File(targetDir, entry.getName());
                    try (FileOutputStream fos = new FileOutputStream(outFile)) {
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = zis.read(buffer)) > 0) {
                            fos.write(buffer, 0, len);
                        }
                    }
                }
                zis.closeEntry();
            }
        }
    }
}
