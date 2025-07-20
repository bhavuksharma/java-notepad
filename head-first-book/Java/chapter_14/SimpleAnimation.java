import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
public class SimpleAnimation {
    private int xpos;
    private int ypos;

    class DrawPanel extends JPanel{
        public void paintComponent(Graphics g){

            g.setColor(Color.white);
            g.fillRect(0,0, this.getWidth(), this.getHeight());

            g.setColor(Color.orange);
            g.fillOval(xpos, ypos, 40, 40);
        }
    }

    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel panel = new DrawPanel();
        
        frame.getContentPane().add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);

        for(int i = 0 ; i< 130 ; i++){
            xpos++;
            ypos++;

            panel.repaint();

            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        SimpleAnimation sa = new SimpleAnimation();
        sa.go();
    }
}
