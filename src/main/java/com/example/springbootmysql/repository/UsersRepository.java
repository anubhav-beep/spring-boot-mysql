package com.example.springbootmysql.repository;

import com.example.springbootmysql.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
