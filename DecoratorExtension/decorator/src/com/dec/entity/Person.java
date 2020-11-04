package com.dec.entity;

public class Person implements ISitter {
    private final String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
