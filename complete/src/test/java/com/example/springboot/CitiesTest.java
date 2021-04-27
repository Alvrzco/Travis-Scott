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
public class CitiesTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getCities() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/cities").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("[{\"id\":1,\"name\":\"Santiago de Compostela\",\"province\":\"A CoruÃ±a\"},{\"id\":2,\"name\":\"A CoruÃ±a\",\"province\":\"A CoruÃ±a\"},{\"id\":3,\"name\":\"Pontevedra\",\"province\":\"Pontevedra\"},{\"id\":4,\"name\":\"Ourense\",\"province\":\"Ourense\"},{\"id\":5,\"name\":\"Lugo\",\"province\":\"Lugo\"},{\"id\":6,\"name\":\"Sanxenxo\",\"province\":\"Pontevedra\"},{\"id\":7,\"name\":\"Portosin\",\"province\":\"A CoruÃ±a\"},{\"id\":8,\"name\":\"Betanzos\",\"province\":\"A CoruÃ±a\"},{\"id\":9,\"name\":\"Sada\",\"province\":\"A CoruÃ±a\"},{\"id\":10,\"name\":\"Pedrafita do Cebreiro\",\"province\":\"Lugo\"}]"));
	}
	
	@Test
	public void getCitiesByID() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/cities/{id}", 1).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":1,\"name\":\"Santiago de Compostela\",\"province\":\"A CoruÃ±a\"}"));
      				
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/cities/{id}", 2).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":2,\"name\":\"A CoruÃ±a\",\"province\":\"A CoruÃ±a\"}"));
      		
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/cities/{id}", 3).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":3,\"name\":\"Pontevedra\",\"province\":\"Pontevedra\"}"));
      		
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/cities/{id}", 4).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":4,\"name\":\"Ourense\",\"province\":\"Ourense\"}"));				
	
		
		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/cities/{id}", 5).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":5,\"name\":\"Lugo\",\"province\":\"Lugo\"}"));	
      	
      		
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/cities/{id}", 6).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":6,\"name\":\"Sanxenxo\",\"province\":\"Pontevedra\"}"));	
      		
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/cities/{id}", 7).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":7,\"name\":\"Portosin\",\"province\":\"A CoruÃ±a\"}"));
      		
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/cities/{id}", 8).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":8,\"name\":\"Betanzos\",\"province\":\"A CoruÃ±a\"}"));
      		
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/cities/{id}", 9).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":9,\"name\":\"Sada\",\"province\":\"A CoruÃ±a\"}"));
      				
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/cities/{id}", 10).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":10,\"name\":\"Pedrafita do Cebreiro\",\"province\":\"Lugo\"}"));		
      				
    				
      				
      						
	}
}
