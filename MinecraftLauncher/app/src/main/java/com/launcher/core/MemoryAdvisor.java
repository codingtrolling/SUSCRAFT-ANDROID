package com.launcher.core;

import android.app.ActivityManager;
import android.content.Context;

public class MemoryAdvisor {
    public static String getOptimalMemory(Context context) {
        ActivityManager.MemoryInfo mi = new ActivityManager.MemoryInfo();
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        am.getMemoryInfo(mi);

        long availableMegs = mi.totalMem / 1048576L;
        long target = Math.min(4096, availableMegs / 2); // Cap at 4GB for 32-bit/stability
        return "-Xmx" + target + "M";
    }
}
