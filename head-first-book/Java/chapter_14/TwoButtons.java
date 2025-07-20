import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class TwoButtons {
    private JFrame frame;
    private JLabel label;

    class LabelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("I am clicked");
        }        
    }

    class ColorListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }        
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("I am a label");
        DrawOvalPanel panel = new DrawOvalPanel();

        JButton colorButton = new JButton("change color");
        colorButton.addActionListener(new ColorListener());

        JButton labelButton = new JButton("change label");
        labelButton.addActionListener(new LabelListener());

        frame.getContentPane().add(BorderLayout.WEST,label);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);

        frame.setSize(500,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }
}
