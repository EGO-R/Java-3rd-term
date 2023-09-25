package pr_5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static int MilanScore = 0;
    public static int MadridScore = 0;
    public static JLabel score = new JLabel("Result: 0 X 0", JLabel.CENTER);
    public static JLabel scorer = new JLabel("Last Scorer: N/A", JLabel.LEFT);
    public static JLabel winner = new JLabel("Winner: DRAW", JLabel.RIGHT);
    public static void main(String[] args) {
        JFrame frame = new JFrame("Football");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("AC Milan");
        button1.setBounds(5, 5, 100, 30);
        JButton button2 = new JButton("“Real Madrid");
        button2.setBounds(5, 5, 100, 30);



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MilanScore++;
                score_update();
                scorer_update("AC Milan");
                winner_update();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MadridScore++;
                score_update();
                scorer_update("Real Madrid");
                winner_update();
            }
        });

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(500, 300));


        panel.add(button1);
        panel.add(button2);
        panel.add(score);
        panel.add(scorer);
        panel.add(winner);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void score_update() {
        score.setText("Result: " + MilanScore + " X " + MadridScore);
        score.revalidate();
    }

    public static void scorer_update(String s) {
        scorer.setText("Last Scorer: " + s);
        score.revalidate();
    }

    public static void winner_update() {
        if (MilanScore > MadridScore)
            winner.setText("Winner: AC Milan");
        else if (MilanScore < MadridScore)
            winner.setText("Winner: Real Madrid");
        else
            winner.setText("Winner: DRAW");
        score.revalidate();
    }
}
