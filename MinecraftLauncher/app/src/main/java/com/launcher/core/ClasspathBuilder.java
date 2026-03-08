package com.launcher.core;

import java.io.File;
import java.util.StringBuilder;

public class ClasspathBuilder {
    public static String build(File libDir, File clientJar) {
        StringBuilder sb = new StringBuilder();
        File[] files = libDir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.getName().endsWith(".jar")) {
                    sb.append(f.getAbsolutePath()).append(":");
                }
            }
        }
        sb.append(clientJar.getAbsolutePath());
        return sb.toString();
    }
}
