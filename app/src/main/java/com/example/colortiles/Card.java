package com.example.colortiles;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import androidx.annotation.RequiresApi;

public class Card {

    Paint p = new Paint();

    public Card(double x, double y, double width, double height, int color) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    int color;
    double x, y, width, height;

    public boolean changeColor(float touchX, float touchY) {
        return touchX >= x && touchX <= x + width && touchY >= y && touchY <= y + height;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void draw(Canvas c) {
        p.setColor(color);
        c.drawRoundRect((float) x, (float) y, (float) (x + width), (float) (y + height), 25, 25, p);
    }
}
