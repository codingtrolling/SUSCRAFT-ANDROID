package com.launcher.core;

import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_game);

        SurfaceView surfaceView = findViewById(R.id.game_surface);
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                // This is where the JNI would hook into the surface
            }
            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {}
            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {}
        });
    }
}
