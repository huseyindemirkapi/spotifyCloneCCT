package com.example.musicAll.Service;

import com.example.musicAll.Model.Song;

import java.util.List;

public interface SongService {
    public Song addSongToDB(Song newSong);

    public List<Song> searchByTitle(String keyword);

    public List<Song> listAllSongs();

}