package com.launcher.core;

import java.io.File;
import java.util.List;

public class FinalBridge {
    public static void execute(Session session, String version, File gameDir) {
        LaunchArgs builder = new LaunchArgs();
        List<String> cmd = builder.buildArgs(session, version, gameDir.getAbsolutePath());
        
        ProcessBuilder pb = new ProcessBuilder(cmd);
        pb.directory(gameDir);
        
        // Apply the Native Path Resolver from Part 88.5
        File nativesDir = new File(gameDir, "natives");
        NativePathResolver.setEnv(pb, nativesDir);
        
        try {
            Process process = pb.start();
            LogSystem.monitorProcess(process);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
