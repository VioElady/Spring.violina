package lucrare2.demo.Music;

public class Music {
    private String musicId;
    private String nameTrack;
    private float timeTrack;
    private String kindMusic;

    public Music(String musicId, String nameTrack, float timeTrack, String kindMusic){
        this.musicId = musicId;
        this.nameTrack = nameTrack;
        this.kindMusic = kindMusic;
        this.timeTrack = timeTrack;
    }

    public float getTimeTrack() {
        return timeTrack;
    }

    public String getKindMusic() {
        return kindMusic;
    }

    public String getMusicId() {
        return musicId;
    }

    public String getNameTrack() {
        return nameTrack;
    }

    public void setKindMusic(String kindMusic) {
        this.kindMusic = kindMusic;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId;
    }

    public void setNameTrack(String nameTrack) {
        this.nameTrack = nameTrack;
    }

    public void setTimeTrack(float timeTrack) {
        this.timeTrack = timeTrack;
    }

}
