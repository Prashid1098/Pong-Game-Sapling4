import javax.swing.*;
import java.awt.*;
public class Over extends Rectangle
{
    int w;
    int h;
    int x;
    Over(int w,int h)
    {
        this.w=w;
        this.h=h;
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Consolas",Font.PLAIN,100));
        g.drawString("GAME OVER",h/2+20,w/2-50);
    }
}
