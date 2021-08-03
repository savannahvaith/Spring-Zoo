package com.qa.springzoo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.springzoo.domain.Zoo;

@Repository
public interface ZooRepo extends JpaRepository<Zoo, Long>{
	
}
