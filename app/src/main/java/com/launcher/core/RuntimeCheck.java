package com.launcher.core;

import android.os.StatFs;
import java.io.File;

public class RuntimeCheck {
    public static boolean hasEnoughSpace(File path, long minBytes) {
        StatFs stats = new StatFs(path.getPath());
        long available = stats.getAvailableBytes();
        return available >= minBytes;
    }
}
