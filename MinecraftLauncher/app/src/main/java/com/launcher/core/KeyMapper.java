package com.launcher.core;

import android.view.KeyEvent;

public class KeyMapper {
    // Standard GLFW Key Codes
    public static final int KEY_W = 87;
    public static final int KEY_A = 65;
    public static final int KEY_S = 83;
    public static final int KEY_D = 68;
    public static final int KEY_SPACE = 32;

    public static int getGlfwKey(int viewId) {
        // This is a simplified mapping
        if (viewId == R.id.btn_up) return KEY_W;
        if (viewId == R.id.btn_left) return KEY_A;
        if (viewId == R.id.btn_down) return KEY_S;
        if (viewId == R.id.btn_right) return KEY_D;
        if (viewId == R.id.btn_jump) return KEY_SPACE;
        return 0;
    }
}
