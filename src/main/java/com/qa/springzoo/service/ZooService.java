package com.qa.springzoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springzoo.domain.Zoo;
import com.qa.springzoo.repo.ZooRepo;

@Service // Business Logic 
public class ZooService {
	// Communication between Domain object and Repo
	
	// Dependency 
	private ZooRepo repo; 
	
	@Autowired
	public ZooService(ZooRepo repo) {
		this.repo = repo;
	}
	
	// CREATE
	
	public Zoo create(Zoo zoodata) {
		return this.repo.saveAndFlush(zoodata);
	}
	
	// READ EVERYTHING
	
	public List<Zoo> read(){
		return this.repo.findAll();
	}
	
	
	// UPDATE
	
	// DELETE
	
	
	
	
	
}
