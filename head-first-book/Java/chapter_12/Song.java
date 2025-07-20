public class Song {
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timesPlayed;

    public Song(String theTitle, String theArtist, String theGenre, int theYear, int theTimesPlayed){
        title = theTitle;
        artist = theArtist;
        genre = theGenre;
        year = theYear;
        timesPlayed = theTimesPlayed;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public String getGenre(){return genre;}
    public int getYear(){return year;}
    public int getTimesPlayed(){return timesPlayed;}

    public String toString(){
        return title+ " : "+ artist + " : "+ genre + " : " + year+ " : " + timesPlayed+ " | ";
    }
}
