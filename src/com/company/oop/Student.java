package com.company.oop;

public class Student extends Person {

    public Student(String name, int age, int mark) {
        super(name, age, mark);
    }

    @Override
    public String goStudy() {
        return "Студент " + getName() + " возраст " + getAge()
                + " ходит в университет "
                + " и получает оценку " + getMark();
    }
}
