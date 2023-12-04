package pr_5.T3;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Photo frame = new Photo("Picture");
        ImageIcon img = new ImageIcon("src/pr_5/T3/rajan-gosling-mem-mne-poebat.jpg");
        JPanel panel = new JPanel();
        panel.add(new JLabel(img));
        frame.add(panel);
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
