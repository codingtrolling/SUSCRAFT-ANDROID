package com.launcher.core;

import android.os.Build;

public class DeviceUtils {
    public static String getArch() {
        return Build.SUPPORTED_ABIS[0];
    }

    public static boolean isArm() {
        return getArch().contains("arm");
    }
}
