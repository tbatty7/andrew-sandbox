import javax.swing.*;
import java.awt.*;

public class StaticShapeDrawer extends JPanel {

    private int x = 700;
    private int y = 100;

public void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);

    graphics.setColor(Color.decode("#008542"));
    graphics.fillOval(1100,0,40,40);
}
}
