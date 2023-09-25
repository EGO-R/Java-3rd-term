package pr_5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static int MilanScore = 0;
    public static int MadridScore = 0;
    public static JLabel score = new JLabel("Result: 0 X 0");
    public static JLabel scorer = new JLabel("Last Scorer: N/A");
    public static JLabel winner = new JLabel("Winner: DRAW");
    public static void main(String[] args) {
        JFrame frame = new JFrame("Football");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("“Real Madrid");



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MilanScore++;

            }
        });

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(200, 300));

        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void score_update() {
        score.setText("Result: " + MilanScore + " X " + MadridScore);
    }
}
