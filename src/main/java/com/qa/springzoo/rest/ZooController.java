package com.qa.springzoo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springzoo.domain.Zoo;
import com.qa.springzoo.service.ZooService;

@RestController
public class ZooController {
	
	// Dependency
	private ZooService service; 
	
	@Autowired
	public ZooController(ZooService service) {
		this.service = service; 
	}
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
	}
	
	// CREATE
	
	@PostMapping("/createZoo")
	public ResponseEntity<Zoo> createZoo(@RequestBody Zoo userZoo){
		return new ResponseEntity<>(this.service.create(userZoo), HttpStatus.CREATED);
	}
	
	// READ ALL 
	
	@GetMapping("/readAll")
	public ResponseEntity<List<Zoo>> readAll(){
		return new ResponseEntity<>(this.service.read(),HttpStatus.OK);
	}
	
	
	
	
}
