package com.changeside.spring_security_project.repository;

import com.changeside.spring_security_project.models.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    @EntityGraph(attributePaths = "roles")
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
}
