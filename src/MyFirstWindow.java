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
        setSize (500,500);
        setTitle("Hello");
        add(new Label("hello World", Label.CENTER));

        Button btn = new Button("Hello Button");
        btn.setBounds(100, 100, 120, 40);
        add(btn);

        setVisible(true);

    }
    public static void main (String [] args)
    {
        MyFirstWindow w = new MyFirstWindow("My First Window");
    }
}
