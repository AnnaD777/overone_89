package com.company.oop;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Олег", 17, 7);
        System.out.println(student.goStudy());
        Schooler schooler = new Schooler("Андрей", 12, 8);
        System.out.println(schooler.goStudy());
    }
}

