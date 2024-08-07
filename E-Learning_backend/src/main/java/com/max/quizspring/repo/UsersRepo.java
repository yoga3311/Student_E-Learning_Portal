package com.max.quizspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.max.quizspring.model.Users;


public interface UsersRepo extends JpaRepository<Users,Long> {
    Users findByEmail(String email);
}
