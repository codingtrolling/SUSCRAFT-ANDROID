package com.launcher.core;

import org.json.JSONObject;

public class InstanceMeta {
    public String name;
    public String version;
    public long lastPlayed;

    public String toJson() {
        JSONObject obj = new JSONObject();
        try {
            obj.put("name", name);
            obj.put("version", version);
            obj.put("lastPlayed", lastPlayed);
        } catch (Exception e) {}
        return obj.toString();
    }
}
