import javax.swing.*;

public class JFrameEx2 {
    public static void main(String[]args)
    {
        JFrame f = new JFrame("My second JFrame");
        f.getContentPane().add(new JLabel("Hello World"));
        f.setSize(500,500);
        f.setVisible(true);
    }
}
