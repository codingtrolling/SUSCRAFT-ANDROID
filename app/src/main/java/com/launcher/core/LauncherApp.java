package com.launcher.core;

import android.app.Application;
import java.io.File;

public class LauncherApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        
        // Initialize Global State
        GlobalState.getInstance();
        
        // Setup Crash Reporting to a local file in the app's data folder
        File crashLog = new File(getExternalFilesDir(null), "crash_report.log");
        Thread.setDefaultUncaughtExceptionHandler(new CrashReporter(crashLog));
        
        // Pre-warm the game directory structure
        File gameDir = getExternalFilesDir(null);
        if (gameDir != null) {
            FileUtil.setupGameDirs(gameDir);
        }
    }
}
