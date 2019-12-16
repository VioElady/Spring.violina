package lucrare2.demo.Music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/playlist")
    public class MusicWebService {

        @Autowired
         MusicRepository musicRepository;

        @GetMapping("music")
        public List<Music> findAll() {
            return musicRepository.findAll();
        }

        @GetMapping("music/{musicId}")
        public Music findById(@PathVariable String musicId) {
            return musicRepository.findById(musicId);
        }

        @PostMapping("music")
        public void save(@RequestBody Music music) {
            musicRepository.save(music);
        }

        @PutMapping("music/{nameTrack}")
        public void update(@RequestBody Music music,@PathVariable String nameTrack){
            musicRepository.update(music,nameTrack);
        }

        @DeleteMapping("music/{nameTrack}")
        public void delete (@PathVariable String nameTrack ){
            musicRepository.delete(nameTrack);

        }
    }
