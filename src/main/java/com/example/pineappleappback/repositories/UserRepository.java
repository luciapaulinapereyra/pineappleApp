package com.example.pineappleappback.repositories;

import java.util.Optional;

import com.example.pineappleappback.models.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    public Optional<UserModel> findByUsername(String username);

    public Optional<UserModel> findByEmail(String email);
}
