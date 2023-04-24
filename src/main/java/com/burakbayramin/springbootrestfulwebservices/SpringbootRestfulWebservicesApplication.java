package com.burakbayramin.springbootrestfulwebservices;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "Spring Boot Rest API Documentation",
		description = "Spring Boot Rest API Documentation",
		version = "1.0",
		contact = @Contact(
				name = "Burak",
				email = "buakbyrmn@gmail.com",
				url = "https://github.com/burakbayramin"
		)),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot User Management Documentation"
		)
		)
public class SpringbootRestfulWebservicesApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebservicesApplication.class, args);
	}

}
