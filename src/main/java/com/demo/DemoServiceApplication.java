package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@SpringBootApplication
public class DemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }

    @RestController
    class DemoRestController {

        @GetMapping(path = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<Message> helloWorld() {
            return ResponseEntity.ok(new Message("Hello World!"));
        }

        @Data
        class Message {
            private final String message;
        }
    }
}
