package pr_5.T2;
import javax.swing.*;
import java.awt.*;
public abstract class Shape extends JComponent{
    protected Color color;
    protected int X1;
    protected int X2;
    protected int Y1;
    protected int Y2;

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        paintShape(g);
    }
    abstract protected void paintShape(Graphics g);
}
