package com.spring.boot.micro.db.repository;


import com.spring.boot.micro.db.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
