package com.launcher.core;

import android.content.Context;
import android.util.DisplayMetrics;

public class ResolutionScaler {
    public static int[] getScaledResolution(Context context, float scale) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        int width = (int) (dm.widthPixels * scale);
        int height = (int) (dm.heightPixels * scale);
        return new int[]{width, height};
    }
}
