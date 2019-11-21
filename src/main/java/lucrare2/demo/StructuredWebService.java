package lucrare2.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import  javax.validation.Valid;

@RestController
@RequestMapping("/media")
public class StructuredWebService {
    FilmRepository sRep = new FilmRepository();
    GameRepository tRep = new GameRepository();

    @GetMapping
    public String test() {
        return "First try in Spring Web";
    }

    @GetMapping("/films")
    public List<String> filmsList(){
        return sRep.getFilms();
    }

    @GetMapping("/games")
    public List<String> gamesList(){
        return tRep.getGames();
    }

    @PostMapping("/addFilm/{name}")
    public void addFilm(@PathVariable("name") String name) {
        sRep.addFilms(name);

    }

    @PutMapping("/addGame/{name}")
    public void addGame(@PathVariable("name") String name) {
        tRep.addGame(name);

    }
    @DeleteMapping("/delGame/{name}")
    public  void delGame(@PathVariable("name")String name){
        tRep.delGame(name);
    }

}
