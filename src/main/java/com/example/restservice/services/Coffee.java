package com.example.restservice.services;

public class Coffee {
    private final int id;
    private final String type;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Coffee(int id, String type) {
        this.id = id;
        this.type = type;
    }

}
