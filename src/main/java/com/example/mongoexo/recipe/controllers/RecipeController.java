package com.example.mongoexo.recipe.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongoexo.recipe.services.RecipeService;
import com.example.mongoexo.models.Recipe;

@RestController
@RequestMapping("recipes")
@CrossOrigin
public class RecipeController {

	private RecipeService recipeService;
	
	public RecipeController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}
	
	@GetMapping
	public List<Recipe> findAll() {
		return this.recipeService.findAll();
	}
	
	@PostMapping
	public Recipe save(@RequestBody Recipe recipe) {
		return this.recipeService.save(recipe);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Recipe recipe) {
		this.recipeService.delete(recipe);
	}
	
	@GetMapping("/{id}")
	public Recipe findById(@PathVariable String id) {
		return this.recipeService.findById(id);
	}
}
