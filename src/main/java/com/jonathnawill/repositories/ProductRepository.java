package com.jonathnawill.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathnawill.entities.Category;
import com.jonathnawill.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
