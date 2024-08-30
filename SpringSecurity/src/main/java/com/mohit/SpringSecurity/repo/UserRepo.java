package com.mohit.SpringSecurity.repo;

import com.mohit.SpringSecurity.modal.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {
    Users getUserByUsername(String username);
}
