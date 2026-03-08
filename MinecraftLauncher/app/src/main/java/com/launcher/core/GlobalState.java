package com.launcher.core;

public class GlobalState {
    private static GlobalState instance;
    public Session activeSession;
    public VersionInfo selectedVersion;
    public boolean isDownloading = false;

    private GlobalState() {}

    public static synchronized GlobalState getInstance() {
        if (instance == null) instance = new GlobalState();
        return instance;
    }
}
