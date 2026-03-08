package com.launcher.core;

import java.io.File;

public class SandboxUtil {
    public static File getVersionFolder(File root, String version) {
        File folder = new File(root, "instances/" + version);
        if (!folder.exists()) folder.mkdirs();
        return folder;
    }
}
