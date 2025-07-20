public class SongsV2 {
    private String title;
    private String artist;
    private int bpm;

    public SongsV2(String theTitle, String theArtist, int theBpm){
        this.title = theTitle;
        this.artist = theArtist;
        this.bpm = theBpm;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int bpm(){
        return bpm;
    }

    public String toString(){
        return title;
    }
}
