package pr_5.T2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Panel extends JPanel {
    public void paintComponent(Graphics g){
        Graphics2D gr = (Graphics2D) g;
        BasicStroke pen = new BasicStroke(4);
        gr.setStroke(pen);
        Random rand = new Random();
        int l = 800, w = 400;
        for (int i = 0; i < 20; i++){
            Color color = new Color(rand.nextInt(255), rand.nextInt(255),rand.nextInt(255));
            gr.setColor(color);
            switch (rand.nextInt(3)){
                case 0:
                    Rectangle R = new Rectangle(rand.nextInt(l), rand.nextInt(w), rand.nextInt(l), rand.nextInt(w), color);
                    R.paintShape(gr);
                    break;
                default:
                    Ellipse O = new Ellipse(rand.nextInt(l), rand.nextInt(w), rand.nextInt(l), rand.nextInt(w), color);
                    O.paintShape(gr);
            }
        }
    }
}
