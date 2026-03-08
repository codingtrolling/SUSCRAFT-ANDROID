package com.launcher.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.io.File;

public class FastAssetExtractor {
    public static void copyFile(File source, File dest) throws Exception {
        try (FileChannel src = new FileInputStream(source).getChannel();
             FileChannel dst = new FileOutputStream(dest).getChannel()) {
            dst.transferFrom(src, 0, src.size());
        }
    }
}
