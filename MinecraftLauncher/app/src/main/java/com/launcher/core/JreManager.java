package com.launcher.core;

import android.content.Context;
import java.io.File;

public class JreManager {
    public static String getJavaExecutable(Context context) {
        // Path to the 'java' binary within the app's internal storage
        File jreBin = new File(context.getFilesDir(), "jre/bin/java");
        if (jreBin.exists()) {
            jreBin.setExecutable(true);
            return jreBin.getAbsolutePath();
        }
        return "java"; // Fallback to system path (unlikely to work on unrooted Android)
    }
}
