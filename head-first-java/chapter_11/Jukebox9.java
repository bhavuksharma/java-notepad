import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jukebox9{

    public static void main(String[] args) {
        new Jukebox9().go();
    }

    public void go() {
        // TODO Auto-generated method stub
        List<SongsV4> songList = MockSongs.getSongsV4();
        System.out.println(songList);

        songList.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        Set<SongsV4> songSet = new HashSet<>(songList);
        System.out.println(songSet);

        
    }
        
}