package com.jonathnawill.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathnawill.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
