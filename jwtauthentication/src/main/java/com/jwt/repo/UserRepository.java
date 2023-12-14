package com.jwt.repo;

import com.jwt.model.User;
import com.jwt.model.UserQuery;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //username , it will return the user of given username
    public User findByUsername(String username);
    
   
}
