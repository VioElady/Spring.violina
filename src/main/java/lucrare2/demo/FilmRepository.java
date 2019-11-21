package lucrare2.demo;

import java.util.ArrayList;
import java.util.List;

public class FilmRepository {
    List<String> films = new ArrayList<>();

    public FilmRepository() {
        films.add("Harry Potter ");
        films.add("Hatiko");
        films.add("Holywood");
        films.add("Tomb Raider");
        films.add("Healer");
    }

    public List<String> getFilms(){
        return films;
    }

    public void addFilms(String name){
        films.add(name);
    }

}
