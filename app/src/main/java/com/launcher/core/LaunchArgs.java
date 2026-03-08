package com.launcher.core;

import java.util.ArrayList;
import java.util.List;

public class LaunchArgs {
    public List<String> buildArgs(Session session, String version, String gameDir) {
        List<String> args = new ArrayList<>();
        
        args.add("java");
        args.add("-Xmx2G"); // Allocated RAM
        args.add("-Djava.library.path=" + gameDir + "/natives");
        args.add("-cp");
        args.add(gameDir + "/libraries/*:" + gameDir + "/client.jar");
        args.add("net.minecraft.client.main.Main"); // Main class
        
        // Game Arguments
        args.add("--username"); args.add(session.getUsername());
        args.add("--version"); args.add(version);
        args.add("--gameDir"); args.add(gameDir);
        args.add("--assetsDir"); args.add(gameDir + "/assets");
        args.add("--assetIndex"); args.add(version);
        args.add("--uuid"); args.add(session.getUuid());
        args.add("--accessToken"); args.add(session.getAccessToken());
        args.add("--userType"); args.add("msa");

        return args;
    }
}
