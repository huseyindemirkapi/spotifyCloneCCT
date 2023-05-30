package com.example.musicAll.Controller;

import com.example.musicAll.Model.Artist;
import com.example.musicAll.Model.Song;
import com.example.musicAll.Service.AdminService;
import com.example.musicAll.Service.ArtistService;
import com.example.musicAll.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    SongService songService;

    @Autowired
    ArtistService artistService;

    @PostMapping("/addSongToDB")
    public Song addSong(@RequestBody Song newSong) {
        return songService.addSongToDB(newSong);
    }

    @GetMapping("/listAllSongs")
    public List<Song> listAllSongs(){
        return songService.listAllSongs();
    }

    @PostMapping("/add/artist")
    public Artist addArtist(@RequestBody Artist newArtist){
        return artistService.addArtist((newArtist));
    }

    @GetMapping("/list/artists")
    public List<Artist> listArtists(){
        return artistService.listArtists();
    }
}


