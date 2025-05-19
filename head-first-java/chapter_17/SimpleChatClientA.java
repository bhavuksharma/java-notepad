import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;

import static java.nio.charset.StandardCharsets.UTF_8;

public class SimpleChatClientA {
    private JTextField outgoing;
    private PrintWriter writer;

    public void go(){
        setUpNetworking();

        outgoing = new JTextField(20);
        
        JButton sendButton = new JButton("send");
        sendButton.addActionListener(e -> sendMessage());

        JPanel maiPanel = new JPanel();
        maiPanel.add(outgoing);
        maiPanel.add(sendButton);
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        frame.getContentPane().add(BorderLayout.CENTER,maiPanel);
        frame.setSize(400,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void setUpNetworking(){
        try {
            InetSocketAddress servAddress = new InetSocketAddress("127.0.0.1",5000);

            SocketChannel socketChannel = SocketChannel.open(servAddress);
            writer = new PrintWriter(Channels.newWriter(socketChannel, UTF_8));
            System.out.println("Networking established.");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }


    private void sendMessage(){
        writer.println(outgoing.getText());
        writer.flush();
        outgoing.setText("");
        outgoing.requestFocus();
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }
}
