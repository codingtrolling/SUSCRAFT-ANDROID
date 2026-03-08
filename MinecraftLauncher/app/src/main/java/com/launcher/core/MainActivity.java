package com.launcher.core;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private LauncherEngine engine;
    private ProgressBar progressBar;
    private TextView statusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        engine = new LauncherEngine(this);
        progressBar = findViewById(R.id.download_progress);
        statusText = findViewById(R.id.status_text);
        Button launchButton = findViewById(R.id.btn_launch);

        launchButton.setOnClickListener(v -> {
            statusText.setText("Launching 1.20.1...");
            progressBar.setVisibility(View.VISIBLE);
            
            // Dummy session for testing
            Session testSession = new Session("Player", "0000", "null");
            engine.start(testSession, "1.20.1");
        });
    }
}
