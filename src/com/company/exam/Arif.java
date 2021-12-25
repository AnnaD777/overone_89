package com.company.exam;

public class Arif {
    public int getArif (int a, int b) {
        int sr = 0;
        int summa = 0;
        int n = 0;
            for (int i = a; i <= b; i++) {
                summa = summa + i;
            n++;
            sr = summa / n;
        }
       return sr;
    }
    }
