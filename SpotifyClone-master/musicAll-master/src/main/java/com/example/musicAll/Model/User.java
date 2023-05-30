package com.example.musicAll.Model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    //create @column or find another way to specify that username and password can not be null/empty
    private String username;
    private String password;
    @ManyToOne()
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "playlist_id", nullable = true)
    private Playlist playlist;

    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getUserRole() { return role; }

    public void setRole(Role role) { this.role = role; }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
}
