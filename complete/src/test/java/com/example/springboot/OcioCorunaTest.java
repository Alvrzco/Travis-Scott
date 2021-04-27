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
public class OcioCorunaTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getLocales() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/locales").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("[{\"id\":1,\"name\":\"Sala Pelicano\",\"apertura\":\"Jueves, Viernes, Sabado\"},{\"id\":2,\"name\":\"My by Dux\",\"apertura\":\"Jueves, Viernes, Sabado, Domingo\"},{\"id\":3,\"name\":\"Amura\",\"apertura\":\"Miercoles, Domingo\"},{\"id\":4,\"name\":\"The Brit Wave\",\"apertura\":\"Jueves, Viernes, Sabado\"},{\"id\":5,\"name\":\"Inn Club\",\"apertura\":\"Lunes, Martes, Miercoles\"},{\"id\":6,\"name\":\"Anden Beach Club\",\"apertura\":\"Jueves, Viernes, Sabado, Domingo\"}]"));
	}
	
	@Test
	public void getLocalesByID() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/locales/{id}", 1).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":1,\"name\":\"Sala Pelicano\",\"apertura\":\"Jueves, Viernes, Sabado\"}"));
      				
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/locales/{id}", 2).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":2,\"name\":\"My by Dux\",\"apertura\":\"Jueves, Viernes, Sabado, Domingo\"}"));
      		
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/locales/{id}", 3).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":3,\"name\":\"Amura\",\"apertura\":\"Miercoles, Domingo\"}"));
      		
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/locales/{id}", 4).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":4,\"name\":\"The Brit Wave\",\"apertura\":\"Jueves, Viernes, Sabado\"}"));				
	
		
		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/locales/{id}", 5).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":5,\"name\":\"Inn Club\",\"apertura\":\"Lunes, Martes, Miercoles\"}"));	
      	
      		
      		mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/locales/{id}", 6).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
      				.andExpect(content().string("{\"id\":6,\"name\":\"Anden Beach Club\",\"apertura\":\"Jueves, Viernes, Sabado, Domingo\"}"));	
      		
      	
    				
      				
      						
	}
}
