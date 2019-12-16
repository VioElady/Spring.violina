package lucrare2.demo.ArtistMusic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArtistMusicRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ArtistMusic> findAll() {
        return jdbcTemplate.query(
                "SELECT *FROM ARTIST_MUSIC",
                (response, rowNumber) ->
                        new ArtistMusic(response.getString("artist_id"),
                                response.getString("artist_lname"),
                                response.getString("artist_fname"),
                                response.getString("the_language_of_music"),
                                response.getInt("number_albums")));
    }


    public void save(ArtistMusic artistMusic) {
        jdbcTemplate.update(
                "INSERT INTO ARTIST_MUSIC(artist_id, artist_lname, artist_fname, the_language_of_music, number_albums)" +
                        "VALUES (?,?,?,?,?)",
                artistMusic.getArtistId(), artistMusic.getArtistLname(), artistMusic.getArtistFname(),
                artistMusic.getTheLanguageOfMusic(), artistMusic.getNumberAlbums());
    }

    public void delete(String artistLname) {
        jdbcTemplate.update("DELETE FROM ARTIST_MUSIC WHERE artist_lname=?", artistLname);
    }

    public void update(ArtistMusic artistMusic, String artistLname) {
        jdbcTemplate.update(
                "UPDATE ARTIST_MUSIC \n" +
                        "SET artist_lname =?, artist_fname=?,the_language_of_music=?,artist_music.number_albums=?" +
                        "WHERE artist_lname=?",
                artistMusic.getArtistLname(), artistMusic.getArtistFname(), artistMusic.getTheLanguageOfMusic()
                , artistMusic.getNumberAlbums(), artistLname);
    }

    public ArtistMusic findById(String artistId) {
        String sql = "SELECT *FROM ARTIST_MUSIC WHERE artist_id = ?;";
        Object[] inputs = new Object[]{artistId};

        return jdbcTemplate.queryForObject(
                sql,
                inputs,
                (reponse, rownumber) -> new ArtistMusic(reponse.getString("artist_id"),
                        reponse.getString("artist_lname"),
                        reponse.getString("artist_fname"),
                        reponse.getString("the_language_of_music"),
                        reponse.getInt("number_albums")));
    }
}