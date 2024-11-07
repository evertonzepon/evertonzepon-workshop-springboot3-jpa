package com.zepon.solutions.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zepon.solutions.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
