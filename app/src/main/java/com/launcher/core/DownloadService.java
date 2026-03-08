package com.launcher.core;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class DownloadService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Trigger the DownloadQueue here
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) { return null; }
}
