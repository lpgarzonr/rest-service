package com.example.restservice;

import com.example.restservice.services.Coffee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // @Autowired
    // private SpanishGreetingProvider greetingProvider;

    @GetMapping("/greeting")
    public Greeting getGreeting() {
        return new Greeting(1, "Hola Parcerita");
    }

    @GetMapping("/greeting/{from}")
    public Greeting getGreeting(@PathVariable String from) {

        return new Greeting(1, "Hola path variable" + from);
    }

    @PostMapping("/greeting")
    public Greeting postGreeting(@RequestBody GreetingRequest params) {
        return new Greeting(1, params.getFrom());
    }
}