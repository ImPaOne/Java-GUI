import javax.swing.*;
import java.awt.*;

public class MyDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1, 10, 10));

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");

        JLabel l1 = new JLabel(" ");
        JLabel l2 = new JLabel(" ");
        JLabel l3 = new JLabel(" ");
        JLabel l4 = new JLabel(" ");

        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l3.setHorizontalAlignment(SwingConstants.CENTER);
        l4.setHorizontalAlignment(SwingConstants.CENTER);

        b1.addActionListener(e -> l1.setText("Button pressed"));

        b2.addActionListener(e -> {
            l2.setText("Text Red");
            l2.setForeground(Color.RED);
        });

        b3.addActionListener(e -> l3.setText("Hello World"));

        b4.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(frame, "Enter value");
            if (input != null) l4.setText(input);
        });

        frame.add(createRow(b1, l1));
        frame.add(createRow(b2, l2));
        frame.add(createRow(b3, l3));
        frame.add(createRow(b4, l4));

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static JPanel createRow(JButton button, JLabel label) {
        JPanel panel = new JPanel(new GridLayout(1, 2, 10, 10));
        panel.add(button);
        panel.add(label);
        return panel;
    }
}