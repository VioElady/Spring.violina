package lucrare2.demo.Music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MusicRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Music> findAll() {
        return jdbcTemplate.query("SELECT*FROM MUSIC",
                (response, rowNumber) ->
                        new Music(response.getString("music_id"),
                                response.getString("name_track"),
                                response.getInt("time_track"),
                                response.getString("kind_music")));
    }

    public void save (Music music){
        jdbcTemplate.update(
                "INSERT INTO MUSIC(music_id, name_track, time_track, kind_music) VALUES (?,?,?,?)",
                music.getKindMusic(),music.getMusicId(),music.getNameTrack(),music.getTimeTrack());
    }

    public void delete(String nameTrack){
        jdbcTemplate.update("DELETE FROM MUSIC WHERE name_track=?",nameTrack);
    }

    public void update(Music music,String nameTrack){
        jdbcTemplate.update(
                "UPDATE MUSIC \n"+
                        "SET name_track =?, time_track=?,kind_music?\n"+
                        "WHERE name_track=?",
                music.getKindMusic(),music.getTimeTrack(),music.getNameTrack(),nameTrack);
    }

    public Music findById(String musicId) {
        String sql = "SELECT *FROM Music WHERE music_id = ?;";
        Object[] inputs = new Object[] {musicId};

        return jdbcTemplate.queryForObject(
                sql,
                inputs,
                (reponse, rownumber) ->new Music (reponse.getString("music_id"),
                        reponse.getString("name_track"),
                        reponse.getInt("time_track"),
                        reponse.getString("kind_music")));
    }
}