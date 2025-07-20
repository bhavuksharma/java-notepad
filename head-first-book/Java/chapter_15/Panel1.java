import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("sencond button");
        JButton buttonThree = new JButton("thrid");
        panel.add(button);
        panel.add(buttonTwo);
        panel.add(buttonThree);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Panel1 p = new Panel1();
        p.go();
    }
}
