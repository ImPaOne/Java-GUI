import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventImp1 implements ActionListener {
    private JLabel label;
    private JTextField name;

    public ActionEventImp1(JLabel label, JTextField name) {
        this.label = label;
        this.name = name;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.label.setText(this.name.getText());
    }
}