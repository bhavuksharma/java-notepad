public class SongsV4 implements Comparable<SongsV4>{
    private String title;
    private String artist;
    private int bpm;

    public SongsV4(String theTitle, String theArtist, int theBpm){
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
    public int compareTo(SongsV4 o) {
        // TODO Auto-generated method stub
        return this.title.compareTo(o.title);
    }

    public int hashCode(){
        return title.hashCode();
    }

    public boolean equals(Object o){
        SongsV4 other = (SongsV4)o;
        return title.equals(other.getTitle());
    }
}

