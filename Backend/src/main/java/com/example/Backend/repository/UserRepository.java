package com.example.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}