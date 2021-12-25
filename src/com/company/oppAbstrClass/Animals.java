package com.company.oppAbstrClass;

public abstract class Animals {
    private String name;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public Animals(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animals(String name) {
        this.name = name;
    }

    public abstract void eat ();
    public abstract void makeSound ();
}

