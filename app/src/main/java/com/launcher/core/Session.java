package com.launcher.core;

public class Session {
    private String username;
    private String uuid;
    private String accessToken;

    public Session(String username, String uuid, String accessToken) {
        this.username = username;
        this.uuid = uuid;
        this.accessToken = accessToken;
    }

    public String getUsername() { return username; }
    public String getUuid() { return uuid; }
    public String getAccessToken() { return accessToken; }
}
