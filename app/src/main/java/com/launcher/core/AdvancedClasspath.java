package com.launcher.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AdvancedClasspath {
    public static List<String> getAllJars(File folder) {
        List<String> jarList = new ArrayList<>();
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    jarList.addAll(getAllJars(f));
                } else if (f.getName().endsWith(".jar")) {
                    jarList.add(f.getAbsolutePath());
                }
            }
        }
        return jarList;
    }
}
