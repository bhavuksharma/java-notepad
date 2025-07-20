import java.util.Comparator;
import java.util.List;

class ArtistCompare implements Comparator<SongsV3>{
    @Override
    public int compare(SongsV3 o1, SongsV3 o2) {
        // TODO Auto-generated method stub
        return o1.getArtist().compareTo(o2.getArtist());
    }   
}

class TitleCompare implements Comparator<SongsV3>{
    @Override
    public int compare(SongsV3 o1, SongsV3 o2) {
        // TODO Auto-generated method stub
        return o1.getTitle().compareTo(o2.getTitle());
    }  
}


public class Jukebox5{

    public static void main(String[] args) {
        new Jukebox5().go();
    }

    public void go() {
        // TODO Auto-generated method stub
        List<SongsV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        TitleCompare titleCompare = new TitleCompare();
        songList.sort(titleCompare);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        System.out.println(songList);
    }
        
}
