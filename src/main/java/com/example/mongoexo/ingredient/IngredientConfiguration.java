package com.example.mongoexo.ingredient;

import org.springframework.context.annotation.Bean;

import com.example.mongoexo.ingredient.repositories.IngredientRepository;
import com.example.mongoexo.ingredient.services.IngredientService;
import com.example.mongoexo.ingredient.services.IngredientServiceImpl;

public class IngredientConfiguration {
	
	@Bean
	public IngredientService ingredientService(IngredientRepository ingredientRepository) {
		return new IngredientServiceImpl(ingredientRepository);
	}
}
