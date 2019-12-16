package lucrare2.demo.Album;

public class Album {
    private String albumId;
    private String albumName;
    private int numberTrack;
    private float ratingAlbum;


    public Album(String albumId, String albumName, int numberTrack, float ratingAlbum) {
        this.albumId = albumId;
        this.albumName = albumName;
        this.numberTrack = numberTrack;
        this.ratingAlbum = ratingAlbum;
    }

    public String getAlbumId() {
        return albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getNumberTrack() {
        return numberTrack;
    }

    public float getRatingAlbum() {
        return ratingAlbum;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setNumberTrack(int numberTrack) {
        this.numberTrack = numberTrack;
    }

    public void setRatingAlbum(float ratingAlbum) {
        this.ratingAlbum = ratingAlbum;
    }

}