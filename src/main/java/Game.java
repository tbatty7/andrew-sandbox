import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener {

    Timer timer = new Timer(5,this);
    private int x = 0;
    private int y = 0;
    private int speedX = 2;

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.setColor(Color.GREEN);
        graphics.fillOval(x,y,50,50);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x > 1100) {
            speedX = -speedX;
        }
        x += speedX;


        repaint();
    }
}

