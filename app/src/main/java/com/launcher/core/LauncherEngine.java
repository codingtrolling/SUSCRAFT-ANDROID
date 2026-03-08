package com.launcher.core;

import android.content.Context;
import java.io.File;
import java.util.List;

public class LauncherEngine {
    private Context context;
    private File gameDir;

    public LauncherEngine(Context context) {
        this.context = context;
        this.gameDir = context.getExternalFilesDir(null);
    }

    public void start(Session session, String version) {
        FileUtil.setupGameDirs(gameDir);
        
        // In a full app, you'd check if (needsDownload()) here
        
        LaunchArgs argBuilder = new LaunchArgs();
        List<String> command = argBuilder.buildArgs(session, version, gameDir.getAbsolutePath());
        
        try {
            ProcessBuilder pb = new ProcessBuilder(command);
            pb.directory(gameDir);
            pb.redirectErrorStream(true);
            Process process = pb.start();
            LogSystem.monitorProcess(process);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
