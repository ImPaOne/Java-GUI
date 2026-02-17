import javax.swing.*;
import java.awt.*;

public class GridLayoutEx1 extends JFrame {
    String[] labels = {"Yellow", "Green", "Orange", "Red", "Blue", "White", "Black", "Gold"};
    public GridLayoutEx1() {
        super("Grid layout example");
        setup();
        setSize(400,200);
    }
    private void setup() {
        getContentPane().setLayout(new GridLayout(4,2));
        for (String label : labels) {
            getContentPane().add(new Button(label));
        }
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutEx1();
    }
}
