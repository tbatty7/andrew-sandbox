import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animator extends JPanel implements ActionListener {

    Timer timer = new Timer(5, this);
    int x = 0;
    int velX = 2;
    int y = 0;
    int velY = 2;



    @Override
    public void actionPerformed(ActionEvent e) {
        if (x < 0 || x > 550)
            velX = -velX;
        if (y < 0 || y > 340)
            velY = -velY;
        x += velX;
        y += velY;
        repaint();
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.BLUE);
        graphics.fillRect(x, y, 30, 20);
        timer.start();
    }
}
