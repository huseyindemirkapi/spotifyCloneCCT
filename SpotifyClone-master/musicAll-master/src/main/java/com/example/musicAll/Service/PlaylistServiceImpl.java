package com.example.musicAll.Service;

import com.example.musicAll.Model.Playlist;
import com.example.musicAll.Repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaylistServiceImpl implements PlaylistService {
    @Autowired
    PlaylistRepository playlistRepository;

    @Override
    public Playlist createPlaylist(Playlist newPlaylist) {
        return playlistRepository.save(newPlaylist);
    }
}
