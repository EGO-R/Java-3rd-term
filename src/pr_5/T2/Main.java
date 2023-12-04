package pr_5.T2;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        frame.setSize(1200, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        frame.add(panel);

        frame.setVisible(true);
    }
}
