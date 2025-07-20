import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.sound.midi.ShortMessage.*;

import java.awt.Graphics;

public class MiniMusicPlayer3 {

    private MyDrawPanel panel;
    private Random random = new Random();

    // inner class for the JPanel
    class MyDrawPanel extends JPanel implements ControllerEventListener{

        boolean msg = false;

        @Override
        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics g){
            if (msg) {
                int r = random.nextInt(250);
                int gr = random.nextInt(250);
                int b = random.nextInt(250);

                g.setColor(new Color(r,gr,b));

                int height = random.nextInt(120) + 10;
                int width = random. nextInt(120) + 10;

                int xpos = random.nextInt(40) + 10;
                int ypos = random.nextInt(40) + 10;

                g.fillRect(xpos, ypos, width, height);
                msg = false;
            }
        }    
    }

    public void setUpGui(){
        JFrame frame = new JFrame("My First Music Video");
        panel = new MyDrawPanel();
        frame.setContentPane(panel);
        frame.setBounds(30,30,300,300);
        frame.setVisible(true);
    }

    public static MidiEvent makeEvent(int cmd, int chnl, int one, int two, int tick){
        MidiEvent event = null;
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(cmd, chnl,one,two);
            event = new MidiEvent(message, tick);
        } catch (Exception e) {
            // TODO: handle exception
            e.getStackTrace();
        }
        return event;
    }

    public void go(){
        setUpGui();
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(panel,new int[]{127});

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();


            int note;
            for(int i = 0; i< 60 ; i += 4){
                note = random.nextInt(50) + 1;
                track.add(makeEvent(NOTE_ON, 1, note, 100, i));
                track.add(makeEvent(CONTROL_CHANGE, 1, 127, 0, i));
                track.add(makeEvent(NOTE_OFF, 1, note, 100, i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.start();
            sequencer.setTempoInBPM(220);
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();
        mini.go();
    }
}


