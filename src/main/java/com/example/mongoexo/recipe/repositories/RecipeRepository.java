package com.example.mongoexo.recipe.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongoexo.models.Recipe;

public interface RecipeRepository extends MongoRepository<Recipe, String> {

}
