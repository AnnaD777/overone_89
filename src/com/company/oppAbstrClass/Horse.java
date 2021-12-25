package com.company.oppAbstrClass;

public class Horse extends Animals{


    public Horse(String name, int age) {
        super(name, age);
    }

    public Horse(String name) {
        super(name);
    }

    public Horse(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();

    }
    @Override
    public void eat() {
        System.out.println("Ест сено");
    }
    @Override
    public void makeSound() {
        System.out.println("Говорит игого-игого");
    }
}
