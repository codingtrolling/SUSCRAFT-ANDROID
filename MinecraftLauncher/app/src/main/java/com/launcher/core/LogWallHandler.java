package com.launcher.core;

import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

public class LogWallHandler {
    private final Handler uiHandler = new Handler(Looper.getMainLooper());
    private final TextView logView;

    public LogWallHandler(TextView logView) {
        this.logView = logView;
    }

    public void appendLine(String line) {
        uiHandler.post(() -> {
            logView.append(line + "\n");
            // Auto-scroll logic could be added here
        });
    }
}
