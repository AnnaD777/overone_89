package com.company.oppAbstrClass;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat ("Кот", 5, 2);
        System.out.println(cat.getName() + " " + cat.getAge() + " " + "лет" + " "
                + cat.getWeight() + " кг");
        cat.makeSound();
        cat.eat();

         System.out.println("*******");

        Dog dog = new Dog ("Собака",7, 3);
        System.out.println(dog.getName() + " " + dog.getAge() + " "
                 + "лет" + " " + dog.getWeight() + " " + "кг");
        dog.makeSound();
        dog.eat();

        System.out.println("*******");

        Horse horse = new Horse ("Лошадь",4, 520);
        System.out.println(horse.getName() + " " + horse.getAge() + " " + "года"
                + " " + horse.getWeight() + " " + "кг");
        horse.makeSound();
        horse.eat();

        System.out.println("*******");

            }
    }

