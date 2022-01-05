package com.example.mongoexo.ingredient.services;

import java.util.List;
import java.util.Optional;

import com.example.mongoexo.ingredient.repositories.IngredientRepository;
import com.example.mongoexo.models.Ingredient;

public class IngredientServiceImpl implements IngredientService {

	private IngredientRepository ingredientRepository;
	
	public IngredientServiceImpl(IngredientRepository ingredientRepository) {
		this.ingredientRepository = ingredientRepository;
	}

	public List<Ingredient> findAll() {
		return this.ingredientRepository.findAll();
	}

	public Ingredient save(Ingredient ingredient) {
		return this.ingredientRepository.save(ingredient);
	}

	public void delete(Ingredient ingredient) {
		this.ingredientRepository.delete(ingredient);
	}
	
	public Ingredient findById(String id) {
		Optional<Ingredient> optional = this.ingredientRepository.findById(id);
		return optional.isPresent() ? optional.get() : new Ingredient();
	}

	public void deleteByID(String id) {
		this.ingredientRepository.deleteById(id);
	}
}
