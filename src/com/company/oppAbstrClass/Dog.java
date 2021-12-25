package com.company.oppAbstrClass;

public class Dog extends Animals {

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int age, int weight) {
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
        System.out.println("Ест мясо");
    }

    @Override
    public void makeSound() {
        System.out.println("Говорит гав-гав");
    }
}
