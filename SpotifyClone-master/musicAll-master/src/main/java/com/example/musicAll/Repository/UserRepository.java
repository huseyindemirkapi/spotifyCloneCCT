package com.example.musicAll.Repository;

import com.example.musicAll.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //Select from user table a username = the username passed through the URL and password passed through URL
    @Query("FROM User WHERE username = :username and password = :password")
    User login(String username, String password);

    User findByUsername(String username);
}
