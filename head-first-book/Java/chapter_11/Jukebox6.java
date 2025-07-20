import java.util.List;


public class Jukebox6{

    public static void main(String[] args) {
        new Jukebox6().go();
    }

    public void go() {
        // TODO Auto-generated method stub
        List<SongsV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        songList.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        songList.sort((one,two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);
    }
        
}

