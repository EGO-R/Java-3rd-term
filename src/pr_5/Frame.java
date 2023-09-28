package pr_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    public int MilanScore = 0;
    public int MadridScore = 0;
    public JLabel score = new JLabel("Result: 0 X 0", JLabel.CENTER);
    public JLabel scorer = new JLabel("Last Scorer: N/A", JLabel.LEFT);
    public JLabel winner = new JLabel("Winner: DRAW", JLabel.RIGHT);

    public Frame(){
        super("Football");
        super.setBounds(0, 0, 300, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("AC Milan");
        button1.setBounds(5, 5, 100, 30);
        JButton button2 = new JButton("Real Madrid");
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

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(3, 3, 2, 2));

        container.add();
        container.add(score);
        container.add(scorer);
        container.add(winner);
        container.add(button1);
        container.add(button2);


    }



    public void score_update() {
        score.setText("Result: " + MilanScore + " X " + MadridScore);
        score.revalidate();
    }

    public void scorer_update(String s) {
        scorer.setText("Last Scorer: " + s);
        score.revalidate();
    }

    public void winner_update() {
        if (MilanScore > MadridScore)
            winner.setText("Winner: AC Milan");
        else if (MilanScore < MadridScore)
            winner.setText("Winner: Real Madrid");
        else
            winner.setText("Winner: DRAW");
        score.revalidate();
    }
}
