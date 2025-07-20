public class SongsV3 implements Comparable<SongsV3>{
    private String title;
    private String artist;
    private int bpm;

    public SongsV3(String theTitle, String theArtist, int theBpm){
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

    @Override
    public int compareTo(SongsV3 o) {
        // TODO Auto-generated method stub
        return this.title.compareTo(o.getTitle());
    }
}
