package com.launcher.core;

import java.io.File;

public class AssetManager {
    private File assetDir;

    public AssetManager(File root) {
        this.assetDir = new File(root, "assets/objects");
    }

    public String getAssetPath(String hash) {
        // Minecraft stores assets in subfolders named after the first two chars of the hash
        String subDir = hash.substring(0, 2);
        return assetDir.getAbsolutePath() + "/" + subDir + "/" + hash;
    }
}
