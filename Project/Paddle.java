import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle
{
    int id;
    int yVelocity;
    int speed=10;

    Paddle(int x,int y,int Paddle_Width,int Paddle_Height,int id)
    {
        super(x,y,Paddle_Width,Paddle_Height);//super in Rectangle class as well
        this.id=id;
    }
    public void keyPressed(KeyEvent e)//When a key is pressed
    {
        switch(id)
        {
            case 1: //Paddle 1
                if(e.getKeyCode()==KeyEvent.VK_W) //If W is pressed
                {
                    setYDirection(-speed); //Paddle 1 will move upwards
                }
                if(e.getKeyCode()==KeyEvent.VK_S) //If S is pressed
                {
                    setYDirection(speed); //Paddle 1 will move downwards
                }
                break;
            case 2: //Paddle 2
                if(e.getKeyCode()==KeyEvent.VK_UP)
                {
                    setYDirection(-speed);
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN)
                {
                    setYDirection(speed);
                }
                break;
        }

    }

    private void setYDirection(int Direction)
    {
        yVelocity=Direction;
    }

    public void keyReleased(KeyEvent e)//When a key is released
    {
        switch(id)
        {
            case 1: //Paddle 1
                if(e.getKeyCode()==KeyEvent.VK_W) //If W is pressed
                {
                    setYDirection(0); //Paddle 1 will stop
                }
                if(e.getKeyCode()==KeyEvent.VK_S) //If S is pressed
                {
                    setYDirection(0); //Paddle 1 will stop
                }
            case 2: //Paddle 2
                if(e.getKeyCode()==KeyEvent.VK_UP)
                {
                    setYDirection(0);
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN)
                {
                    setYDirection(0);
                }
                break;
        }
    }
    public void move()
    {
        y=y+yVelocity;
    }
    public void draw(Graphics g)
    {
        if (id == 1)
        {
            g.setColor(Color.red);
        }
        else
        {
            g.setColor(Color.blue);
        }
        g.fillRect(x,y,width,height);
    }
}
