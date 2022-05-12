package com.hdh.manageuseelectricityspringboot.repository;

import com.hdh.manageuseelectricityspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
