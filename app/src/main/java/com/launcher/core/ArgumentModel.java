package com.launcher.core;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class ArgumentModel {
    public static List<String> parseGameArgs(String json) {
        List<String> list = new ArrayList<>();
        JSONObject obj = new JSONObject(json);
        if (obj.has("arguments")) {
            JSONArray gameArgs = obj.getJSONObject("arguments").getJSONArray("game");
            for (int i = 0; i < gameArgs.length(); i++) {
                Object arg = gameArgs.get(i);
                if (arg instanceof String) {
                    list.add((String) arg);
                }
            }
        }
        return list;
    }
}
