package com.launcher.core;

public class FabricManager {
    public static String getFabricMainClass() {
        return "net.fabricmc.loader.impl.launch.knot.KnotClient";
    }

    public static String getFabricArgs(String gameVersion) {
        return "--loaderVersion 0.15.7 --gameVersion " + gameVersion;
    }
}
