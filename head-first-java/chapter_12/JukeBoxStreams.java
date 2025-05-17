import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JukeBoxStreams {
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();

        // // filter by rock genre
        // List<Song> rockSongs = songs.stream()
        //                             .filter(song -> song.getGenre().contains("Rock"))
        //                             .collect(Collectors.toList());
        // System.out.println(rockSongs);

        // // filter songs by artist The Beatles
        // List<Song> songsByTheBeatles = songs.stream()
        //                                     .filter(song -> song.getArtist().contains("The Beatles"))
        //                                     .collect(Collectors.toList());
        // System.out.println(songsByTheBeatles);

        // // filter the songs start with "H"
        // List<Song> songsStartWithH = songs.stream()
        //                                     .filter(song -> song.getTitle().startsWith("H"))
        //                                     .collect(Collectors.toList());
        // System.out.println(songsStartWithH);

        // // filter songs recent than 1995
        // List<Song> songsRecentThan1995 = songs.stream()
        //                                         .filter(song -> song.getYear() > 1995)
        //                                         .collect(Collectors.toList());
        // System.out.println(songsRecentThan1995);


        // // List of the genre for the songs list
        // List<String> songsGenre = songs.stream()
        //                                 .map(song -> song.getGenre())
        //                                 .collect(Collectors.toList());
        // System.out.println(songsGenre);

        // // Remove duplicate for the songsGenre list
        // List<String> songsDistGenre = songs.stream()
        //                                     .map(song -> song.getGenre())
        //                                     .distinct()
        //                                     .collect(Collectors.toList());
        // System.out.println(songsDistGenre);


        // String songTitle = "With a Little Help form My Friends";
        // List<String> songsCoverArtist = songs.stream()
        //                                         .filter(song -> song.getTitle().contains(songTitle))
        //                                         .map(song -> song.getArtist())
        //                                         .filter(artist -> !artist.equals("The Beatles"))
        //                                         .distinct()
        //                                         .collect(Collectors.toList());
        // System.out.println(songsCoverArtist);

        List<String> strings = List.of("I","am","testing","stream","api");
        String joinedString = strings.stream()
                .collect(Collectors.joining(","));
        System.out.println(joinedString);
    }
}
