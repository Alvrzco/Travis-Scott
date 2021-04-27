package com.example.springboot;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class BebidasTest{

	@Autowired
	private MockMvc mvc;

	@Test
	public void getBebidas() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/bebidas").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("[{\"id\":1,\"name\":\"Ron Barcelo\"},{\"id\":2,\"name\":\"Seagrams\"},{\"id\":3,\"name\":\"Beefeater\"},{\"id\":4,\"name\":\"Macallan 25\"},{\"id\":5,\"name\":\"Puerto de Indias\"},{\"id\":6,\"name\":\"Larios 12\"}]"));
	}
	
	@Test
	public void getBebidasByID() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/bebidas/{id}", 1).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":1,\"name\":\"Ron Barcelo\"}"));
      				
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/bebidas/{id}", 2).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":2,\"name\":\"Seagrams\"}"));
      		
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/bebidas/{id}", 3).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":3,\"name\":\"Beefeater\"}"));
      		
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/bebidas/{id}", 4).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":4,\"name\":\"Macallan 25\"}"));				
	
		
		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/bebidas/{id}", 5).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":5,\"name\":\"Puerto de Indias\"}"));	
      	
      		
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/bebidas/{id}", 6).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":6,\"name\":\"Larios 12\"}"));	
      		
      				
    				
      				
      						
	}
}
