package lucrare2.demo.Album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlbumRepository {

    @Autowired
     JdbcTemplate jdbcTemplate;

    public List<Album> findAll() {
        return jdbcTemplate.query(
                "SELECT *FROM ALBUM",
                (response, rowNumber) ->
                        new Album(response.getString("album_id"),
                                response.getString("album_name"),
                                response.getInt("number_track"),
                                response.getFloat("rating_album")));
    }


    public void save (Album album){
        jdbcTemplate.update(
                "INSERT INTO ALBUM (album_id,album_name,number_track,rating_album) " +
                        "VALUES (?,?,?,?)",
                album.getAlbumId(), album.getAlbumName(), album.getNumberTrack(), album.getRatingAlbum());
    }

    public void delete(String albumName){
        jdbcTemplate.update("DELETE FROM ALBUM WHERE album_name=?",albumName);
    }

    public void update(Album album, String albumName){
        jdbcTemplate.update(
                "UPDATE ALBUM \n"+
                        "SET album_name =?, number_track=?,rating_album=?"+
                        "WHERE album_name=?",
                album.getAlbumName(), album.getNumberTrack(),album.getRatingAlbum(),albumName);
    }

    public Album findById(String albumId) {
        String sql = "SELECT *FROM ALBUM WHERE album_id = ?;";
        Object[] inputs = new Object[] {albumId};

        return jdbcTemplate.queryForObject(
                sql,
                inputs,
                (reponse, rownumber) ->new Album(reponse.getString("album_id"),
                        reponse.getString("album_name"),
                        reponse.getInt("number_track"),
                        reponse.getFloat("rating_album")));
    }
}