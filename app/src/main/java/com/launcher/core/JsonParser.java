package com.launcher.core;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;

public class JsonParser {
    private static final String TAG = "JsonParser";

    public String getClientDownloadUrl(String jsonContent) {
        try {
            JSONObject obj = new JSONObject(jsonContent);
            return obj.getJSONObject("downloads")
                      .getJSONObject("client")
                      .getString("url");
        } catch (JSONException e) {
            Log.e(TAG, "Failed to parse client download URL", e);
            return null;
        }
    }

    public JSONArray getLibraries(String jsonContent) {
        try {
            JSONObject obj = new JSONObject(jsonContent);
            return obj.getJSONArray("libraries");
        } catch (JSONException e) {
            Log.e(TAG, "Failed to parse libraries array", e);
            return new JSONArray();
        }
    }
}
