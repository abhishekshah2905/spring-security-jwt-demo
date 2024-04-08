package com.security.jwt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.jwt.demo.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
