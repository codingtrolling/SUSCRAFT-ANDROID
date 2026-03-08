package com.launcher.core;

import java.util.LinkedList;
import java.util.Queue;

public class DownloadQueue {
    private Queue<DownloadTask> tasks = new LinkedList<>();
    private boolean isRunning = false;

    public void addTask(String url, String path, Runnable onOneDone) {
        tasks.add(new DownloadTask(url, path, onOneDone));
    }

    public void start() {
        if (isRunning || tasks.isEmpty()) return;
        isRunning = true;
        processNext();
    }

    private void processNext() {
        DownloadTask task = tasks.poll();
        if (task == null) {
            isRunning = false;
            return;
        }
        new NetworkManager().downloadFile(task.url, task.path, () -> {
            task.callback.run();
            processNext();
        });
    }

    private static class DownloadTask {
        String url, path;
        Runnable callback;
        DownloadTask(String u, String p, Runnable c) { url = u; path = p; callback = c; }
    }
}
