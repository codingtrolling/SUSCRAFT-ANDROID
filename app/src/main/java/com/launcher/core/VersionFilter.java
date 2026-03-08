package com.launcher.core;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class VersionFilter {
    public static List<VersionInfo> filterReleases(String manifestJson) {
        List<VersionInfo> releases = new ArrayList<>();
        JSONObject root = new JSONObject(manifestJson);
        JSONArray versions = root.getJSONArray("versions");

        for (int i = 0; i < versions.length(); i++) {
            JSONObject v = versions.getJSONObject(i);
            if (v.getString("type").equals("release")) {
                releases.add(new VersionInfo(
                    v.getString("id"),
                    v.getString("type"),
                    v.getString("url")
                ));
            }
        }
        return releases;
    }
}
