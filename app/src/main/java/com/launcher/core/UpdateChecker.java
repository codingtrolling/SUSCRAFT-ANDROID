package com.launcher.core;

import java.net.HttpURLConnection;
import java.net.URL;

public class UpdateChecker {
    public static void checkForUpdate(String currentVersion) {
        new Thread(() -> {
            try {
                URL url = new URL("https://api.github.com/repos/youruser/yourrepo/releases/latest");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                // If response version > currentVersion, notify user
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
