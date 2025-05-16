
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SimpleGui3 implements ActionListener{

    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3 sg3 = new SimpleGui3();
        sg3.paint();
    }

    public void paint(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawOvalPanel ovalPanel = new DrawOvalPanel();
        
        JButton button = new JButton("Click me to change color");
        button.addActionListener(this);
       

        frame.getContentPane().add(BorderLayout.CENTER,ovalPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
