package lucrare2.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Film> findAll() {
        return jdbcTemplate.query("SELECT*FROM FILM",
                (response, rowNumber) ->
                        new Film(response.getString("film_id"),
                                response.getString("title"),
                                response.getString("description"),
                                response.getInt("release_year"),
                                response.getInt("rental_duration"),
                                response.getInt("rating"),
                                response.getString("replacement_cost"),
                                response.getInt("last_update")));
    }


    public void save (Film film){
        jdbcTemplate.update(
                "INSERT INTO FILM(film_id, title, description, release_year, rental_duration, rating," +
                        " replacement_cost, last_update) VALUES (?,?,?,?,?,?,?,?)",
                film.getFilm_id(),film.getTitle(),film.getDescription(),film.getLast_update(),film.getRating(),
        film.getRelease_year(),film.getRental_duration(),film.getReplacement_cost());
    }

    public void delete(String name){
        jdbcTemplate.update("DELETE FROM FILM WHERE title=?",name);
    }
}