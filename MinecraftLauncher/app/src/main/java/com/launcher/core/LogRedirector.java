package com.launcher.core;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LogRedirector implements Runnable {
    private InputStream input;
    public LogRedirector(InputStream input) { this.input = input; }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
            String line;
            while ((line = br.readLine()) != null) {
                Log.i("MinecraftRuntime", line);
            }
        } catch (Exception e) {
            Log.e("LauncherError", "Log pipe broken", e);
        }
    }
}
