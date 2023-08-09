package com.jonathnawill.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathnawill.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
