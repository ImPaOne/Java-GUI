import javax.swing.*;
import java.awt.*;

public class JFrameEx1 extends JFrame
{
    public JFrameEx1()
    {
        super("My First JFrame");
        setup();
    }

    private void setup()
    {
        getContentPane().add(new JLabel("Hello World"));
        setSize(500,500);

        JButton btn = new JButton("JButton");
        add(btn);
        btn.setSize(50,50);
        setVisible(true);

    }

    public static void main(String [] args)
    {
        new JFrameEx1();
    }
}
