package com.company.oopIntrF;

public class Duck implements EatSleep, SwimDive {
    int weight;

    public Duck(int weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Питается водорослями, насекомыми.");
            }

    @Override
    public void sleep() {
        System.out.println("Спит около 6 часов.");

    }

    @Override
    public void swim() {
        System.out.println("Проплывает в день около 1000 метров.");

    }

    @Override
    public void dive() {
        System.out.println("Ныряет на глубину до 2,5 метров.");

    }

    @Override
    public String toString() {
        return "Утка" + " " + "весит" + " " + weight + " " + "кг.";
    }
}
