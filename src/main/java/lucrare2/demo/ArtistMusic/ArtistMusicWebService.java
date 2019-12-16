package lucrare2.demo.ArtistMusic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/playlist")
    public class ArtistMusicWebService {

        @Autowired
        ArtistMusicRepository artistMusicRepository;

        @GetMapping("artistMusic")
        public List<ArtistMusic> findAll() {
            return artistMusicRepository.findAll();
        }

        @GetMapping("artistMusic/{artistId}")
        public ArtistMusic findById(@PathVariable String artistId) {
            return artistMusicRepository.findById(artistId);
        }

        @PostMapping("artistMusic")
        public void save(@RequestBody ArtistMusic artistMusic) {
            artistMusicRepository.save(artistMusic);
        }

        @PutMapping("artistMusic/{artistName}")
        public void update(@RequestBody ArtistMusic artistMusic,@PathVariable String artistName){
            artistMusicRepository.update(artistMusic,artistName);
        }

        @DeleteMapping("artist/{artistName}")
        public void delete (@PathVariable String artistName ){
            artistMusicRepository.delete(artistName);

        }

    }
