package com.company.oppAbstrClass;

public class Cat extends Animals {

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Cat(String name, int age) {
              super(name,age);
    }

    public Cat(String name) {
        super(name);
    }


    @Override
    public void eat() {
        System.out.println("Ест рыбу");
    }
    @Override
    public void makeSound() {
        System.out.println("Говорит мяу-мяу");
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
    public int getWeight() {
        return super.getWeight();
    }
}


