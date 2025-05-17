import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jukebox10{

    public static void main(String[] args) {
        new Jukebox10().go();
    }

    public void go() {
        // TODO Auto-generated method stub
        List<SongsV4> songList = MockSongs.getSongsV4();
        System.out.println(songList);

        songList.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        // Set<SongsV4> songSet = new TreeSet<>(songList);
        // System.out.println(songSet);

        Set<SongsV4> songSet = new TreeSet<>((o1,o2) -> o1.bpm() - o2.bpm());
        songSet.addAll(songList);
        System.out.println(songSet);

        
    }
        
}