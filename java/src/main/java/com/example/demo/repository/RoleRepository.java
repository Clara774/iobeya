package com.example.demo.repository;

import com.example.demo.enums.RoleEnum;
import com.example.demo.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<UserRole, Integer> {
    Optional<RoleEnum> findByName(RoleEnum name);
}
