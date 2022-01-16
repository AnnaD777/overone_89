package com.company.exceptions;

public class Main {
    public static void main(String[] args) {
        double result = 0;
        Exception2 exception2=new Exception2();
        result = exception2.divNumbers(6,0);
        System.out.println("result= " + result);
    }
}
