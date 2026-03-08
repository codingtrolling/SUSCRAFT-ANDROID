package com.launcher.core;

import java.io.File;

public class LocalVersion {
    private String id;
    private File path;

    public LocalVersion(String id, File root) {
        this.id = id;
        this.path = new File(root, "versions/" + id + "/" + id + ".jar");
    }

    public boolean isDownloaded() {
        return path.exists();
    }

    public String getId() { return id; }
}
