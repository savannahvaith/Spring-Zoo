package com.qa.springzoo.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.springzoo.domain.Zoo;
import com.qa.springzoo.repo.ZooRepo;

@SpringBootTest
public class ZooServiceUnitTest {

	@MockBean
	private ZooRepo repo; 
	
	@Autowired
	private ZooService service; 
	
	
	@Test
	void testCreateUnit() {
		// GIVEN 
			
		Zoo midland = new Zoo("Midland Safari Park",2000);
		Zoo midlandWithId = new Zoo(1L,"Midland Safari Park",2000);
		
		// WHEN 
		Mockito.when(this.repo.saveAndFlush(midland)).thenReturn(midlandWithId);
		
		
		// THEN
		assertThat(this.service.create(midland)).isEqualTo(midlandWithId);
		
		Mockito.verify(this.repo, Mockito.times(1)).saveAndFlush(midland);
		
	}
	
	
	
}
