package com.example.musicAll.Service;

import com.example.musicAll.Model.Artist;

import java.util.List;

public interface ArtistService {
    public Artist addArtist(Artist newArtist);

    public List<Artist> listArtists();
}
