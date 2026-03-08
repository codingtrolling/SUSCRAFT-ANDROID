package com.launcher.core;

import android.view.Window;
import android.view.WindowManager;

public class BrightnessUtil {
    public static void setBrightness(Window window, float level) {
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.screenBrightness = level; // 0.0 to 1.0
        window.setAttributes(lp);
    }
}
