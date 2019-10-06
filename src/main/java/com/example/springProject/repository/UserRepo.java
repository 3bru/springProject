package com.example.springProject.repository;

import com.example.springProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<User,Long> {

    User findByUsername(String username);

}
