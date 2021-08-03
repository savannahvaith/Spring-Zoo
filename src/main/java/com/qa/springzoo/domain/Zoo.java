package com.qa.springzoo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // MARKS AS A TABLE
public class Zoo {
	
	// Variables
	
	@Id // MARK IT AS A PK (PRIMARY KEY)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENET
	private Long id; 
	
	private String name; 
	
	private int noOfAnimals;


	// Constructors
	
	public Zoo() {}
	
	public Zoo(String name, int noOfAnimals) {
		this.name = name; 
		this.noOfAnimals = noOfAnimals; 
	}
	
	public Zoo(Long id, String name, int noOfAnimals) {
		this.id = id; 
		this.name = name; 
		this.noOfAnimals = noOfAnimals; 
	}
	
	
	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	} 

}
