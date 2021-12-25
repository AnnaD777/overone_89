package com.company.oopIntrF;

public class Dolfin implements EatSleep, SwimDive {
    String species;
    int age;
    int weight;

    public Dolfin(String species, int age, int weight) {
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Кушает сельдь.");
    }

    @Override
    public void sleep() {
        System.out.println("Спит ночью от 5 до 8 часов в сутки.");
    }

    @Override
    public void swim() {
        System.out.println("Проплывает в день 100 км.");
    }

    @Override
    public void dive() {
        System.out.println("Ныряет на глубину 100-300 метров.");
    }

    @Override
    public String toString() {
        return "Дельфин" + " " + species + " " + "живет" + " " + age + " "
                + "лет" + " "
                + "и весит" + " "
                + weight + " " + "кг.";
    }
}

