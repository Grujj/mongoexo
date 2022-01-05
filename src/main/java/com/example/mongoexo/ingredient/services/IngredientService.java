package com.example.mongoexo.ingredient.services;

import java.util.List;

import com.example.mongoexo.models.Ingredient;

public interface IngredientService {
	
	List<Ingredient> findAll();
	
	Ingredient findById(String id);
	
	Ingredient save(Ingredient ingredient);
	
	void delete(Ingredient ingredient);
	
	void deleteByID(String id);
}
