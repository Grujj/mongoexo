package com.example.mongoexo.recipe.services;

import java.util.List;
import java.util.Optional;

import com.example.mongoexo.recipe.repositories.RecipeRepository;
import com.example.mongoexo.models.Recipe;

public class RecipeServiceImpl implements RecipeService {
	
private RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

	public List<Recipe> findAll() {
		return this.recipeRepository.findAll();
	}

	public Recipe save(Recipe recipe) {
		return this.recipeRepository.save(recipe);
	}

	public void delete(Recipe recipe) {
		this.recipeRepository.delete(recipe);
	}
	
	public Recipe findById(String id) {
		Optional<Recipe> optional = this.recipeRepository.findById(id);
		return optional.isPresent() ? optional.get() : new Recipe();
	}

	public void deleteByID(String id) {
		this.recipeRepository.deleteById(id);
	}
}
