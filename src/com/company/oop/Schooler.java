package com.company.oop;

public class Schooler extends Person {
    public Schooler(String name, int age, int mark) {
        super(name, age, mark);

    }

    @Override
    public String goStudy() {
        return "Школьник " + getName() + " возраст " + getAge()
                + " ходит в школу "
                + " и получает оценку " + getMark();
    }
}




