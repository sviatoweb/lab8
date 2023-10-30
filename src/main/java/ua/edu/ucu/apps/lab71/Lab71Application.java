package ua.edu.ucu.apps.lab71;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab71.flowers.Flower;
import ua.edu.ucu.apps.lab71.flowers.FlowerColor;

@SpringBootApplication
public class Lab71Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab71Application.class, args);
	}


}
