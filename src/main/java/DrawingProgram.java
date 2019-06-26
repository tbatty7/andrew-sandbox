import javax.swing.*;

public class DrawingProgram {
    public void renderAnimation(JPanel panel) {
        JFrame frame = new JFrame();
        frame.setTitle("Learning Math");
        frame.setSize(1500, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
    }

}
