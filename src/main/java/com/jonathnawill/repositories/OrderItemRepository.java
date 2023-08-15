package com.jonathnawill.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathnawill.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
