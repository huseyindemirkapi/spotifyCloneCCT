package com.example.musicAll.Model;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;


@Entity
@Table(name="songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;


    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 50)

    private String genre;

    private Time length;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "artist_id")
    private Artist artist;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "song", orphanRemoval = true)
    private List<Playlist> playlists;

    public Song() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Time getLength() {
        return length;
    }

    public void setLength(Time length) {
        this.length = length;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

}
