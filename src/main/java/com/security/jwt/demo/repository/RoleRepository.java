package com.security.jwt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.jwt.demo.models.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
}
