package com.launcher.core;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<String> classpathEntries = new ArrayList<>();

    public void addLibrary(String path) {
        classpathEntries.add(path);
    }

    public String getClassPathSeparator() {
        return System.getProperty("path.separator");
    }
}
