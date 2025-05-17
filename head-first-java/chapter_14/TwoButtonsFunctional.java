import java.awt.BorderLayout;

import javax.swing.*;

public class TwoButtonsFunctional {
    private JFrame frame;
    private JLabel label;

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("I am label");
        DrawOvalPanel panel = new DrawOvalPanel();

        JButton colorButton = new JButton("change color");
        colorButton.addActionListener(event -> frame.repaint());

        JButton labelButton = new JButton("change label text");
        labelButton.addActionListener(event -> label.setText("i am clicked"));
        
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);

        frame.setSize(500,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        TwoButtonsFunctional tbf = new TwoButtonsFunctional();
        tbf.go();
    }
}
