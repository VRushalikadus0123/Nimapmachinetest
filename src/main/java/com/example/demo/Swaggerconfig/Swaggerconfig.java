package com.example.demo.Swaggerconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class Swaggerconfig {
	@Bean
	public OpenAPI custOpenAPI()
	{
		return new OpenAPI()
				.info(new Info()
						.title("Nimapmachinetest")
						.description("API Decumentation for Nimapmachinetest details")
						.version("2.0.0")
						.contact(new Contact()
								.name("Nimapmachinetest")
								.email("xyz")
								.url("https://google.com")
								)
						);
				
	
	}

}
