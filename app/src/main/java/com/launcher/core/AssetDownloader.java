package com.launcher.core;

import org.json.JSONObject;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AssetDownloader {
    public void downloadIndex(String indexUrl, File destination) {
        NetworkManager nm = new NetworkManager();
        nm.downloadFile(indexUrl, destination.getAbsolutePath(), () -> {
            // Logic to parse the index and start downloading individual hashes
            System.out.println("Asset index downloaded.");
        });
    }
}
