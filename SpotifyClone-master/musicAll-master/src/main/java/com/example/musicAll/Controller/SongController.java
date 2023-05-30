package com.example.musicAll.Controller;

import com.example.musicAll.Model.Song;
import com.example.musicAll.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("/listAllSongs")
    public Iterable<Song> listAllSongs(){
        return songService.listAllSongs();
    }
    
    @PostMapping("/addSongToDB")
    public Song addSong(@RequestBody Song newSong) {
        return songService.addSongToDB(newSong);
    }

    @GetMapping("/search/title")
    public List<Song> searchSongs(@RequestParam String keyword) {
        return songService.searchByTitle(keyword);
    }

}
