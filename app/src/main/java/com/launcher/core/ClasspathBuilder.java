package com.launcher.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ClasspathBuilder {
    private final List<String> paths = new ArrayList<>();

    public void addPath(String path) {
        if (path != null && !path.isEmpty()) {
            paths.add(path);
        }
    }

    public String build() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paths.size(); i++) {
            sb.append(paths.get(i));
            if (i < paths.size() - 1) {
                sb.append(File.pathSeparator);
            }
        }
        return sb.toString();
    }
}
