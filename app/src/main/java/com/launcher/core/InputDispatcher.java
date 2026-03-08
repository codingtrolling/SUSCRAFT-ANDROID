package com.launcher.core;

public class InputDispatcher {
    public void dispatchMovement(float x, float y) {
        // x and y are -1.0 to 1.0
        if (y > 0.5) sendKey(KeyMapper.KEY_W, true);
        else sendKey(KeyMapper.KEY_W, false);
        
        if (y < -0.5) sendKey(KeyMapper.KEY_S, true);
        else sendKey(KeyMapper.KEY_S, false);
    }

    private void sendKey(int keyCode, boolean pressed) {
        // Native call to the GLFW shim
    }
}
