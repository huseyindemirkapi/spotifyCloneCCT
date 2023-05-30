package com.example.musicAll.Service;

import com.example.musicAll.Model.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    public User getUser(String username);

    public List<User> listUsers();

    public String createUser(User newUser);


//Original Login
//    public User login(String username, String password);

    //JWT Login
    public String login(User user);

    HttpStatus deleteUser(Long userId);

}
