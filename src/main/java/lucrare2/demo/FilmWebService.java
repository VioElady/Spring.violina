package lucrare2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmWebService {

    @Autowired
    private FilmRepository filmRepository;

    @GetMapping
    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Film film) {
        filmRepository.save(film);
    }

    @DeleteMapping
    public void delete (@PathVariable String name ){
        filmRepository.delete(name);

    }

}
