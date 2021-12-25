package com.company.oopIntrF;

public class Fish implements EatSleep, SwimDive {
    String species;

    public Fish(String species) {
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("Питается рыбой.");
    }

    @Override
    public void sleep() {
        System.out.println("Спит 2 часа в сутки.");
    }

    @Override
    public void swim() {
        System.out.println("Проплывает в сутки от 1 до 5 километров.");
    }

    @Override
    public void dive() {
        System.out.println("Погружается на глубины рек.");
    }

    @Override
    public String toString() {
        return "Вид речной рыбы" + " " + species + ".";
    }
}
