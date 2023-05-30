package com.example.musicAll.Service;

import com.example.musicAll.Model.Artist;
import com.example.musicAll.Repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {
    @Autowired
    ArtistRepository artistRepository;

    @Override
    public Artist addArtist(Artist newArtist) {
        return artistRepository.save(newArtist);
    }

    @Override
    public List<Artist> listArtists() {
        return artistRepository.findAll();
    }
}
