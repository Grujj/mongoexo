package com.example.mongoexo.models;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Recipe {
	
	@Id
	private String id;
	
	private String description;
	
	private String author;
	
	private Map<Ingredient, String> ingredients;
	
	private List<Step> steps;
}
