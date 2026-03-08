package com.launcher.core;

import android.view.MotionEvent;

public class TouchMouseHandler {
    private float lastX, lastY;

    public void handleTouch(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX = event.getX();
                lastY = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                float dx = event.getX() - lastX;
                float dy = event.getY() - lastY;
                // These deltas would be sent to the game's mouse input buffer
                sendToGame(dx, dy);
                lastX = event.getX();
                lastY = event.getY();
                break;
        }
    }

    private void sendToGame(float dx, float dy) {
        // Native JNI call or Pipe to game process
    }
}
