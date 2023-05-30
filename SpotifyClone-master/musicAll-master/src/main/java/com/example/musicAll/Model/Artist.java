package com.example.musicAll.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "artists")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private long artist_id;

    @Column(unique = true, nullable = true, length = 50)
    private String name;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "artist", orphanRemoval = true)
    private List<Song> songs;

    public Artist(){}

    public long getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(long artist_id) {
        this.artist_id = artist_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
