import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RocketShip extends JPanel implements ActionListener {
    Timer timer = new Timer(5, this);
    int x = 700;
    int y = 900;
    private int speed = 1;

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.DARK_GRAY);
        graphics.fillRect(x, y, 80, 160);
        graphics.drawLine(x,y,x + 40,y - 60);
        graphics.drawLine(x + 40,y - 60,x + 80,y);
        graphics.drawLine(x + 40,y + 160,x + 80,y + 200);
        graphics.drawLine(x + 40,y + 160,x,y + 200);
        graphics.drawLine(x + 80,y + 200,x,y + 200);
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(x,y + 200,80,40);
        graphics.fillOval(x + 20,y + 200,40,80);
        graphics.fillOval(x + 300, 200,60,60);
        graphics.setColor(Color.decode("#926646"));
        graphics.fillOval(x - 400, 400,120,120);
        graphics.setColor(Color.red);
        graphics.fillOval(x - 600, 100,70,70);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        y -= speed;
        repaint();
    }
}
