package com.example.musicAll.Service;

import com.example.musicAll.Model.Song;
import com.example.musicAll.Repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SongServiceImpl implements SongService {
    @Autowired
    SongRepository songRepository;

    @Autowired
    SongService songService;

    @Override
    public Song addSongToDB(Song newSong) {

        return songRepository.save(newSong);
    }

    @Override
    public List<Song> searchByTitle(String keyword) {
        return songRepository.findByTitleContainingIgnoreCase(keyword);
    }


    @Override
    public List<Song> listAllSongs(){
        return songRepository.findAll();
    }
}

