package com.launcher.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrencyManager {
    private final ExecutorService executor;

    public ConcurrencyManager(int threads) {
        this.executor = Executors.newFixedThreadPool(threads);
    }

    public void executeTask(Runnable task) {
        executor.execute(task);
    }

    public void shutdown() {
        try {
            executor.shutdown();
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}
