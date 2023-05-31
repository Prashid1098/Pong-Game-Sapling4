import java.awt.*;

public class Score extends Rectangle
{
    int width;
    int height;
    int player1;
    int player2;
    Score(int width,int height)
    {
        this.width=width;
        this.height=height;
    }


    public void draw(Graphics g)
    {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas",Font.ITALIC,35));
        g.drawString(String.valueOf(player1),width/2-50,80);
        g.drawString(String.valueOf(player2),width/2+30,80);

        g.setFont(new Font("Consolas",Font.ITALIC,20));
        g.drawString("Player 1",width/2-120,100);
        g.drawString("Player 2",width/2+25,100);
    }
}
