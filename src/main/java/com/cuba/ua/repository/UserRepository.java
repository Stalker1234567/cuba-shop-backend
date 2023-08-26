package com.cuba.ua.repository;

import java.util.Optional;

import com.cuba.ua.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
