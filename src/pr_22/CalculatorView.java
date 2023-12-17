package pr_22;

import javax.swing.*;
import java.awt.*;


public class CalculatorView extends JFrame {
    private JPanel buttonsPanel = new JPanel(new GridLayout(4,4, 20, 20));
    public JTextArea textArea = new JTextArea(1, 20);
    public JButton Is;

    public CalculatorView(String name){
        super(name);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        textArea.setSize(100, 20);

        add(textArea);
        createButtons();
        setSize(250, 300);
        setVisible(true);
    }

    private void createButtons(){
        String[] symbols = {
                "789/",
                "456*",
                "123-",
                "0.+="
        };
        JButton[][] buttons = new JButton[4][4];
        for (int y = 0; y < 4; ++y)
            for (int x = 0; x < 4; ++x)
                buttonsPanel.add(buttons[y][x] = new JButton(String.valueOf(symbols[y].charAt(x))));
        for (int y = 0; y < 4; ++y)
            for (int x = 0; x < 4; ++x) {
                int finalY = y;
                int finalX = x;
                if (y!=3 || x!=3)
                    buttons[y][x].addActionListener(e -> textArea.append(String.valueOf(symbols[finalY].charAt(finalX))));
            }
        Is = buttons[3][3];
        add(buttonsPanel);
    }
    public void setTextArea(String s) {
        textArea.setText(s);
    }

}
