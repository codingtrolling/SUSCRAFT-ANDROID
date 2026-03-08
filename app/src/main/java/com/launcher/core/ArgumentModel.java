package com.launcher.core;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class ArgumentModel {
    private static final String TAG = "ArgumentModel";
    public final List<String> gameArguments = new ArrayList<>();

    public void parseArgs(String json) {
        try {
            JSONObject obj = new JSONObject(json);
            if (obj.has("arguments") && obj.getJSONObject("arguments").has("game")) {
                JSONArray gameArgs = obj.getJSONObject("arguments").getJSONArray("game");
                for (int i = 0; i < gameArgs.length(); i++) {
                    Object arg = gameArgs.get(i);
                    if (arg instanceof String) {
                        gameArguments.add((String) arg);
                    }
                }
            }
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing game arguments", e);
        }
    }
}
