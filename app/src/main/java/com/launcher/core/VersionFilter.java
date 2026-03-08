package com.launcher.core;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class VersionFilter {
    private static final String TAG = "VersionFilter";

    public List<VersionInfo> filterReleases(String manifestJson) {
        List<VersionInfo> releases = new ArrayList<>();
        try {
            JSONObject root = new JSONObject(manifestJson);
            JSONArray versions = root.getJSONArray("versions");

            for (int i = 0; i < versions.length(); i++) {
                JSONObject v = versions.getJSONObject(i);
                if ("release".equals(v.getString("type"))) {
                    releases.add(new VersionInfo(
                        v.getString("id"),
                        v.getString("type"),
                        v.getString("url")
                    ));
                }
            }
        } catch (JSONException e) {
            Log.e(TAG, "Error filtering versions from manifest", e);
        }
        return releases;
    }

    public static class VersionInfo {
        public String id, type, url;
        public VersionInfo(String id, String type, String url) {
            this.id = id;
            this.type = type;
            this.url = url;
        }
    }
}
