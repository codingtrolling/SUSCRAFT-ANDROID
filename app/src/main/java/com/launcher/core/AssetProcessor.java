package com.launcher.core;

import org.json.JSONObject;
import java.io.File;
import java.util.Iterator;

public class AssetProcessor {
    public void downloadAllAssets(String indexJson, File gameDir, NetworkManager nm) {
        JSONObject objects = new JSONObject(indexJson).getJSONObject("objects");
        Iterator<String> keys = objects.keys();

        while (keys.hasNext()) {
            String name = keys.next();
            JSONObject asset = objects.getJSONObject(name);
            String hash = asset.getString("hash");
            String path = "assets/objects/" + hash.substring(0, 2) + "/" + hash;
            
            String url = "https://resources.download.minecraft.net/" + hash.substring(0, 2) + "/" + hash;
            nm.downloadFile(url, new File(gameDir, path).getAbsolutePath(), () -> {
                // Asset downloaded
            });
        }
    }
}
