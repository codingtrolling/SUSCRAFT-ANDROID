package com.launcher.core;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;

public class CrashReporter implements Thread.UncaughtExceptionHandler {
    private File logFile;

    public CrashReporter(File logFile) { this.logFile = logFile; }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        try (FileOutputStream fos = new FileOutputStream(logFile)) {
            fos.write(Log.getStackTraceString(e).getBytes());
        } catch (Exception ignored) {}
        System.exit(1);
    }
}
