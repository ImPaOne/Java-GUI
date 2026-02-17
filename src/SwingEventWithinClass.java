import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEventWithinClass extends JFrame implements ActionListener {
    private JTextField name;
    private JButton button;
    private JLabel label;
    public SwingEventWithinClass() throws HeadlessException {
        this("Event example");
    }
    public SwingEventWithinClass(String title) throws HeadlessException {
        super(title);
        setup();
    }
    private void setup() {
        this.name = new JTextField(8);
        this.button = new JButton("Capture");
        this.label = new JLabel("");
        this.button.addActionListener(this);
        this.button.setSize(50,75);
        this.label.setSize(50,75);
        Container panel = getContentPane();
        panel.setLayout(new FlowLayout());
        panel.add(this.name);
        panel.add(this.button);
        panel.add(this.label);
        setSize(300, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.label.setText(this.name.getText());
    }
    public static void main(String[] args) {
        new SwingEventWithinClass();
    }
}
