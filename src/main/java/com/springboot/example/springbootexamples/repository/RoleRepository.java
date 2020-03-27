package com.springboot.example.springbootexamples.repository;

import com.springboot.example.springbootexamples.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByAuthority(String authority);

    Long countByAuthority(String authority);
}
