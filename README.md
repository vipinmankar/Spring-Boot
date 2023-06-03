# Spring-Boot


Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need minimal Spring configuration.’

Features---


	•	Create stand-alone Spring applications
	•	Embed Tomcat, Jetty or Undertow directly (no need to deploy WAR files)
	•	Provide opinionated 'starter' dependencies to simplify your build configuration
	•	Automatically configure Spring and 3rd party libraries whenever possible
	•	Provide production-ready features such as metrics, health checks, and externalized configuration
	•	Absolutely no code generation and no requirement for XML configuration

Installation and Getting Started


The reference documentation includes detailed installation instructions as well as a comprehensive getting started guide.
Here is a quick teaser of a complete Spring Boot application in Java:
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}

}


Topic to Cover

1. CRUD Operation in Spring boot

2. Spring boot Actuator




