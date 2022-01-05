package com.example.mongoexo.ingredient.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongoexo.ingredient.services.IngredientService;
import com.example.mongoexo.models.Ingredient;

@RestController
@RequestMapping("ingredients")
@CrossOrigin
public class IngredientController {

	private IngredientService ingredientService;
	
	public IngredientController(IngredientService ingredientService) {
		this.ingredientService = ingredientService;
	}
	
	@GetMapping
	public List<Ingredient> findAll() {
		return this.ingredientService.findAll();
	}
	
	@PostMapping
	public Ingredient save(@RequestBody Ingredient ingredient) {
		return this.ingredientService.save(ingredient);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Ingredient ingredient) {
		this.ingredientService.delete(ingredient);
	}
	
	@GetMapping("/{id}")
	public Ingredient findById(@PathVariable String id) {
		return this.ingredientService.findById(id);
	}
}
