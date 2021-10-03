package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

import com.example.restservice.services.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {
    @GetMapping("/coffee")
    public Coffee getCoffee() {
        return new Coffee(1, "Espresso");
    }

    @GetMapping("/coffees")
    public List<Coffee> getCoffees() {
        List<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee(1, "EspressoL"));
        return coffees;
    }

    @PostMapping("/coffee")
    public Coffee postCoffee() {
        return new Coffee(1, "Espresso Post");
    }
}