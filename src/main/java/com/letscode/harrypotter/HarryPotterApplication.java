package com.letscode.harrypotter;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Harry Potter API", version = "1.0",
		description = "This Harry Potter API Consumes another API, simulates the Sorting Hat to the students and shows informations about the choosen house")
)
public class HarryPotterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarryPotterApplication.class, args);
	}

}
