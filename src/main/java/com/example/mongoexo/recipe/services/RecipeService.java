package com.example.mongoexo.recipe.services;

import java.util.List;

import com.example.mongoexo.models.Recipe;

public interface RecipeService {
	
	List<Recipe> findAll();
	
	Recipe findById(String id);
	
	Recipe save(Recipe recipe);
	
	void delete(Recipe recipe);
	
	void deleteByID(String id);
}
