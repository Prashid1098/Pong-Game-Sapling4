import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame //JFrame having all the necessary functions
{
    GameFrame()
    {
        this.setTitle("Ping Pong");
        //setLayout(null);
        //setSize(1000,555);
        getContentPane().setBackground(Color.black);
        GamePanel panel=new GamePanel();
        this.add(panel);//Add panel inside a frame
        this.pack(); //Shapes the size accordingly with the size of panel
        //setFocusable(true);
        this.setResizable(false);
        this.setVisible(true);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Operation closed in the JFrame when the exit button of the same is clicked
    }

    public static void main(String[] args)
    {
        GameFrame g=new GameFrame();
    }
}
