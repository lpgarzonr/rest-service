package com.example.restservice.services;

public class SpanishGreetingProvider implements GreetingProvider {

    @Override
    public String getGreetingByLanguage() {
        return "hola en espaniol";
    }

}
