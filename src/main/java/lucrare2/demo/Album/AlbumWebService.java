package lucrare2.demo.Album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlist")
public class AlbumWebService {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("album")
    public List<Album> findAll() {
        return albumRepository.findAll();
    }

    @GetMapping("album/{albumId}")
    public Album findById(@PathVariable String albumId){
        return albumRepository.findById(albumId);
}

    @PostMapping("album")
    public void save(@RequestBody Album album) {
        albumRepository.save(album);
    }

    @PutMapping("album/{albumName}")
    public void update(@RequestBody Album album, @PathVariable String albumName){
        albumRepository.update(album,albumName);
    }

    @DeleteMapping("album/{albumName}")
    public void delete (@PathVariable String albumName ){
        albumRepository.delete(albumName);

    }

}
