package com.launcher.core;

import java.util.ArrayList;
import java.util.List;

public class Optimizations {
    public static List<String> getRecommendedFlags() {
        List<String> flags = new ArrayList<>();
        flags.add("-XX:+UseG1GC");
        flags.add("-XX:MaxGCPauseMillis=50");
        flags.add("-Dsun.java3d.opengl=true");
        flags.add("-XX:+UnlockExperimentalVMOptions");
        return flags;
    }
}
