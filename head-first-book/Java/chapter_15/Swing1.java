import javax.swing.*;
import java.awt.*;

public class Swing1{
    public void go(){
        JFrame frame = new JFrame();
        JButton button = new JButton("There is no spoon...");
        Font bigFont = new Font("serif", Font.BOLD, 28);
        button.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Swing1 s = new Swing1();
        s.go();
    }
}