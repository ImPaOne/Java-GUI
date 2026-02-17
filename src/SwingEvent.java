import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEvent extends JFrame {
    private JTextField name;
    private JButton button;
    private JLabel label;

    public SwingEvent() throws HeadlessException {
        this("Event example");
    }

    public SwingEvent(String title) throws HeadlessException {
        super(title);
        setup();
    }

    private void setup() {
        this.name = new JTextField(8);
        this.button = new JButton("Capture");
        this.label = new JLabel("");
        this.button.addActionListener(new ActionEventImp1(this.label, this.name));

        this.button.setSize(50, 75);
        this.label.setSize(50, 75);

        Container panel = getContentPane();
        panel.setLayout(new FlowLayout());
        panel.add(this.name);
        panel.add(this.button);
        panel.add(this.label);
        setSize(300, 75);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingEvent();
    }
}