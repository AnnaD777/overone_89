package com.company.oopIntrF;

public class Main {
    public static void main(String[] args) {
        Dolfin dolfin = new Dolfin("Касатка",65, 560 );
       System.out.println(dolfin.toString());
        dolfin.eat();
        dolfin.sleep();
        dolfin.swim();
        dolfin.dive();
        System.out.println();

        Duck duck = new Duck(3);
        System.out.println(duck.toString());
        duck.eat();
        duck.sleep();
        duck.swim();
        duck.dive();
        System.out.println();

        Fish fish = new Fish("щука");
        System.out.println(fish.toString());
        fish.eat();
        fish.sleep();
        fish.swim();
        fish.dive();
        System.out.println();

        Frog frog = new Frog(5);
        System.out.println(frog.toString());
        frog.eat();
        frog.sleep();
        frog.swim();
        frog.dive();
        System.out.println();

        Man man = new Man("Олег", 30);
        System.out.println(man.toString());
        man.eat();
        man.sleep();
        man.swim();
        man.dive();
        System.out.println();

  /*      EatSleep [] mas = {dolfin, duck};
        for (EatSleep object : mas) {
            System.out.println(object.toString());

            object.eat();
            object.sleep();}
            SwimDive [] mas1 ={dolfin,duck};
                for (SwimDive object1 : mas1) {
                    object1.swim();
                    object1.dive();
                    break;*/

                }
        }







