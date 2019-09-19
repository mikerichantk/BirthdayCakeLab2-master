package cs301.birthdaycake;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Balloon {

    protected int cx;
    protected int cy;
    protected Paint color=new Paint();
    protected int r;

    public Balloon(int x, int y)
    {
        cx=x;
        cy=y;
        r=20;
        color.setColor(Color.BLUE);
    }

    public void draw(Canvas canvas)
    {
        canvas.drawOval(20, 20, 20,20, color);
    }
}
