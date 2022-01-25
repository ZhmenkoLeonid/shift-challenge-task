package com.zhmenko.shiftchallengetask;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@OpenAPIDefinition
public class ShiftChallengeTaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShiftChallengeTaskApplication.class, args);
    }
}