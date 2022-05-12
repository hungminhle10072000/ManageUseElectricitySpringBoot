package com.hdh.manageuseelectricityspringboot.repository;

import com.hdh.manageuseelectricityspringboot.common.ERole;
import com.hdh.manageuseelectricityspringboot.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
