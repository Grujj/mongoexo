package com.example.mongoexo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Step {
	
	@Id
	private String id;
	
	private String number;
	
	private String description;
	
	private String duration;
}
