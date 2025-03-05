//Kanzurrizk M R A - IT22166524
//Group ID - Y3.S2.WE.IT.01.01
//PAF: Extension for Practical Session 3

package com.practical4.greeting_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GreetingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingAppApplication.class, args);
    }

    // question 01
    // the /greet endpoint
    @GetMapping("/greet")
    public String greet() {
        return "Welcome to Spring Boot!";
    }

    // question 02 and extension
    // /greet with path variable and optional query parameter
    @GetMapping("/greet/{name}")
    public String greetWithNameAndMessage(
        @PathVariable String name,
        @RequestParam(required = false) String message) {

        return (message == null) 
            ? "Hello " + name + "! Welcome to Spring Boot!" 
            : "Hello " + name + "! " + message;
    }
}
