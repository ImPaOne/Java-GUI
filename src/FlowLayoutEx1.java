import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx1 extends JFrame {
    String[] labels = {"Yellow", "Green", "Orange", "Red", "Blue", "White", "Black"};
    public FlowLayoutEx1() {
        super("Flow layout example");
        setup();
        setSize(400,200);
    }
    private void setup() {
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        for (String label : labels) {
            getContentPane().add(new Button(label));
        }
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutEx1();
    }
}
