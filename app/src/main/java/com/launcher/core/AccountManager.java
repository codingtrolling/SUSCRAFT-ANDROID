package com.launcher.core;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private File accountsFile;

    public AccountManager(Context context) {
        this.accountsFile = new File(context.getFilesDir(), "accounts.json");
    }

    public void saveAccounts(List<Session> sessions) throws Exception {
        JSONArray array = new JSONArray();
        for (Session s : sessions) {
            JSONObject obj = new JSONObject();
            obj.put("username", s.getUsername());
            obj.put("uuid", s.getUuid());
            obj.put("token", s.getAccessToken());
            array.put(obj);
        }
        Files.write(accountsFile.toPath(), array.toString().getBytes(StandardCharsets.UTF_8));
    }
}
