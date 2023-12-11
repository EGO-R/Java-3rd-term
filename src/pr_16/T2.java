package pr_16;
import javax.swing.*;
import java.awt.*;
import java.util.Map;
public class T2 extends JFrame {
    private final JMenuBar menuBar = new JMenuBar();
    private final JTextArea textArea = new JTextArea();

    private final Map<String, Color> colorMap = Map.ofEntries(
            Map.entry("Blue", Color.BLUE),
            Map.entry("Red", Color.RED),
            Map.entry("Black", Color.BLACK)
    );
    private final Map<String, Font> fontMap = Map.ofEntries(
            Map.entry("Times New Roman", new Font("Times New Roman", Font.PLAIN, 24)),
            Map.entry("MS Sans Serif", new Font("MS Sans Serif", Font.PLAIN, 24)),
            Map.entry("Courier New", new Font("Courier New", Font.PLAIN, 24))
    );

    private JMenu CreateColorMenu(){
        JMenu menu = new JMenu("Color");
        JMenuItem menuItem;
        for (Map.Entry<String, Color> colorEntry : colorMap.entrySet()) {
            menuItem = new JMenuItem(colorEntry.getKey());
            menuItem.addActionListener(e -> textArea.setForeground(colorEntry.getValue()));
            menu.add(menuItem);
        }
        return menu;
    }

    private JMenu CreateFontMenu() {
        JMenu menu = new JMenu("Font");

        JMenuItem menuItem;
        for (Map.Entry<String, Font>  fontEntry : fontMap.entrySet()) {
            menuItem = new JMenuItem(fontEntry.getKey());
            menuItem.addActionListener(e -> textArea.setFont(fontEntry.getValue()));
            menu.add(menuItem);
        }

        return menu;
    }

    private T2(){
        super("T2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        menuBar.add(CreateFontMenu());
        menuBar.add(CreateColorMenu());
        setJMenuBar(menuBar);
        add(textArea);
        setVisible(true);
    }

    public static void main(String[] args) {
        new T2();
    }
}
