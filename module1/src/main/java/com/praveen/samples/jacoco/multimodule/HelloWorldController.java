package com.praveen.samples.jacoco.multimodule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping(path = "/helloWorld")
    public String sayHelloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/welcome")
    public String sayWelcome() {
        return "Welcome";
    }
}
