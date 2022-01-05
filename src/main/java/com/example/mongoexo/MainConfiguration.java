package com.example.mongoexo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.mongoexo.ingredient.IngredientConfiguration;
import com.example.mongoexo.recipe.RecipeConfiguration;

@Configuration
@Import({ IngredientConfiguration.class, RecipeConfiguration.class })
public class MainConfiguration {

}
