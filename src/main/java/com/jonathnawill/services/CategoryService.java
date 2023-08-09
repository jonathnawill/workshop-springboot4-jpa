package com.jonathnawill.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathnawill.entities.Category;
import com.jonathnawill.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;

	// Este método permite buscar todas as categorias no banco de dados.
	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findByI(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
