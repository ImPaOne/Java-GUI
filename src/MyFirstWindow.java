import java.awt.*;

public class MyFirstWindow extends Frame
{
    public MyFirstWindow (String title) throws HeadlessException
    {
        super(title);
        setup();
    }
    private void setup()
    {
        setBackground (Color.DARK_GRAY);
        setSize (200,200);
        add(new Label("hello World"));
        setVisible(true);
    }
    public static void main (String [] args)
    {
        MyFirstWindow w = new MyFirstWindow("My First Window");
    }
}
