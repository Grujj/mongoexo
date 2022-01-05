package com.example.mongoexo.recipe;

import org.springframework.context.annotation.Bean;

import com.example.mongoexo.recipe.repositories.RecipeRepository;
import com.example.mongoexo.recipe.services.RecipeService;
import com.example.mongoexo.recipe.services.RecipeServiceImpl;

public class RecipeConfiguration {
	
	@Bean
	public RecipeService recipeService(RecipeRepository recipeRepository) {
		return new RecipeServiceImpl(recipeRepository);
	}
}
