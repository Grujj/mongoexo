package com.example.mongoexo.ingredient.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongoexo.models.Ingredient;

public interface IngredientRepository extends MongoRepository<Ingredient, String>{
	
	
}
