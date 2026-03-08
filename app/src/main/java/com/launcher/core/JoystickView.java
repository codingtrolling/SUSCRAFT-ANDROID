package com.launcher.core;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class JoystickView extends View {
    private Paint paint = new Paint();
    private float centerX, centerY, stickX, stickY;

    public JoystickView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        centerX = getWidth() / 2;
        centerY = getHeight() / 2;
        paint.setColor(Color.GRAY);
        canvas.drawCircle(centerX, centerY, 100, paint);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(centerX + stickX, centerY + stickY, 40, paint);
    }
}
