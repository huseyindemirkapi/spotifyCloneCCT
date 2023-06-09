package com.example.musicAll.Repository;

import com.example.musicAll.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

    Song findByTitle(String title);
    List<Song> findByTitleContainingIgnoreCase(String keyword);











}
