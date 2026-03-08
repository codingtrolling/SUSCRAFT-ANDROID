package com.launcher.core;

public class VersionInfo {
    private String id;
    private String type;
    private String url;

    public VersionInfo(String id, String type, String url) {
        this.id = id;
        this.type = type;
        this.url = url;
    }

    public String getId() { return id; }
    public String getUrl() { return url; }
}
