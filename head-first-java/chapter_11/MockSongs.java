import java.util.ArrayList;
import java.util.List;

public class MockSongs{
    public static List<String> getSongStrings(){
        List<String> songs = new ArrayList<>();
        songs.add("somersalt");
        songs.add("cassidy");
        songs.add("Cassidy");
        songs.add("$10");
        songs.add("havana");
        songs.add("50 ways");

        return songs;
    }

    public static List<SongsV2> getSongsV2(){
        List<SongsV2> songs = new ArrayList<>();
        songs.add(new SongsV2("somersault","zero 7",147));
        songs.add(new SongsV2("cassidy","grateful dead",158));
        songs.add(new SongsV2("$10","hitchhiker",140));
        songs.add(new SongsV2("havana","cabello",105));
        songs.add(new SongsV2("Cassidy","grateful dead",158));
        songs.add(new SongsV2("50 ways","simon",102));

        return songs;
    }

    public static List<SongsV3> getSongsV3(){
        List<SongsV3> songs = new ArrayList<>();
        songs.add(new SongsV3("somersault","zero 7",147));
        songs.add(new SongsV3("cassidy","grateful dead",158));
        songs.add(new SongsV3("$10","hitchhiker",140));
        songs.add(new SongsV3("havana","cabello",105));
        songs.add(new SongsV3("Cassidy","grateful dead",158));
        songs.add(new SongsV3("50 ways","simon",102));

        return songs;
    }

    public static List<SongsV4> getSongsV4(){
        List<SongsV4> songs = new ArrayList<>();
        songs.add(new SongsV4("somersault","zero 7",147));
        songs.add(new SongsV4("cassidy","grateful dead",158));
        songs.add(new SongsV4("$10","hitchhiker",140));
        songs.add(new SongsV4("havana","cabello",105));
        songs.add(new SongsV4("cassidy","grateful dead",158));
        songs.add(new SongsV4("50 ways","simon",102));

        return songs;
    }
}
