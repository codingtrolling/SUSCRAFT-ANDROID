package com.launcher.core;

import org.json.JSONObject;
import org.json.JSONArray;
import java.io.InputStream;
import java.util.Scanner;

public class JsonParser {
    public static String getClientUrl(String jsonContent) {
        JSONObject obj = new JSONObject(jsonContent);
        return obj.getJSONObject("downloads").getJSONObject("client").getString("url");
    }

    public static JSONArray getLibraries(String jsonContent) {
        JSONObject obj = new JSONObject(jsonContent);
        return obj.getJSONArray("libraries");
    }
}
