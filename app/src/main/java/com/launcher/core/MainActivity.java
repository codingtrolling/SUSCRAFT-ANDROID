package com.launcher.core;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button launchButton = findViewById(R.id.btn_launch);
        launchButton.setOnClickListener(v -> {
            Toast.makeText(this, "Initializing Game Files...", Toast.LENGTH_SHORT).show();
            // Core launch logic will be implemented here
        });
    }
}
