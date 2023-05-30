package com.example.musicAll.Controller;

import com.example.musicAll.Config.JwtResponse;
import com.example.musicAll.Model.Playlist;
import com.example.musicAll.Model.User;
import com.example.musicAll.Service.PlaylistService;
import com.example.musicAll.Service.PlaylistServiceImpl;
import com.example.musicAll.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @Autowired
    PlaylistServiceImpl playlistService;
    /**
     * Creates /helloworld as an endpoint
     * @return Hello World!!!
     */
    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }

    @GetMapping("/list")
    public List<User> listUsers(){
        return userService.listUsers();
    }

    @PostMapping("/signup")
    public ResponseEntity<?> createUser(@RequestBody User newUser) {
        return ResponseEntity.ok(new JwtResponse(userService.createUser(newUser)));
    }
  
//LOGIN ENDPOINT WITHOUT JWT/SPRING SECURITY
//    @PostMapping("/login/{username}/{password}")
//    public User login( @PathVariable String username, @PathVariable String password){
//        return userService.login(username, password);
//    }

    //JWT Login Endpoint
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {     return ResponseEntity.ok(new JwtResponse(userService.login(user)));
    }

    //Returns OK
    @DeleteMapping("/delete/{userId}")
    public HttpStatus deleteUser(@PathVariable Long userId){
        return userService.deleteUser(userId);
    }


    @PostMapping("/playlist/create")
    public Playlist createPlaylist(@RequestBody Playlist newPlaylist){
        return playlistService.createPlaylist(newPlaylist);
    }


}
