package lucrare2.demo.ArtistMusic;

public class ArtistMusic {
    private String artistId;
    private String artistLname;
    private String artistFname;
    private String theLanguageOfMusic;
    private int numberAlbums;

    public ArtistMusic(String artistId, String artistLname, String artistFname, String theLanguageOfMusic, int numberAlbums) {
        this.artistId = artistId;
        this.artistLname = artistLname;
        this.artistFname = artistFname;
        this.theLanguageOfMusic = theLanguageOfMusic;
        this.numberAlbums = numberAlbums;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistLname() {
        return artistLname;
    }

    public void setArtistLname(String artistLname) {
        this.artistLname = artistLname;
    }

    public String getArtistFname() {
        return artistFname;
    }

    public void setArtistFname(String artistFname) {
        this.artistFname = artistFname;
    }

    public String getTheLanguageOfMusic() {
        return theLanguageOfMusic;
    }

    public void setTheLanguageOfMusic(String theLanguageOfMusic) {
        this.theLanguageOfMusic = theLanguageOfMusic;
    }

    public int getNumberAlbums() {
        return numberAlbums;
    }

    public void setNumberAlbums(int numberAlbums) {
        this.numberAlbums = numberAlbums;
    }
}