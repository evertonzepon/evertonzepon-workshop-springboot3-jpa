package com.zepon.solutions.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zepon.solutions.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
