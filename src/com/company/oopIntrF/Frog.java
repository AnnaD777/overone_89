package com.company.oopIntrF;

public class Frog implements EatSleep, SwimDive {
    int age;

    public Frog(int age) {
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Питается насекомыми, жуками, малюсками.");
    }

    @Override
    public void sleep() {
        System.out.println("Спит почти весь день - 22 часа.");
    }

    @Override
    public void swim() {
        System.out.println("Проплывает в день до 50 метров.");
    }

    @Override
    public void dive() {
        System.out.println("Погружается в воду более чем на 20 см.");
    }

    @Override
    public String toString() {
        return "Лягушка живет" + " " + age + " " + "лет.";
    }
}
