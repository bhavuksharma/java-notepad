import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestArea1 {
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton button = new JButton("Just click me");

        JTextArea text = new JTextArea(10,20);
        text.setLineWrap(true);
        button.addActionListener(event -> text.append("button clicked! \n"));

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setSize(350,300);
        frame.setVisible(true);
    }  
    
    public static void main(String[] args) {
        TestArea1 gui = new TestArea1();
        gui.go();
    }
}
