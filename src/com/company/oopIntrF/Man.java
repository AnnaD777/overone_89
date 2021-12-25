package com.company.oopIntrF;

public class Man implements EatSleep, SwimDive {
    String name;
    int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Питается мясом, рыбой.");
    }

    @Override
    public void sleep() {
        System.out.println("Спит 8 часов в сутки.");
    }

    @Override
    public void swim() {
        System.out.println("Плавает на расстояние 100 метров.");
    }

    @Override
    public void dive() {
         System.out.println("Может нырять на глубину 7 метров.");
    }

    @Override
    public String toString() {
        return "Мужчина" + " " + name + " " + age + " " + "лет.";
    }
}
