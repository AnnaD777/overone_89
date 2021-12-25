package com.company.exam;

public class MaxDel {
    public int getMaxDel (int a, int b) {

        int max = 0;
        int n = 0;
        for (int i = 1; i > 0; i++) {
            if (a % i == 0 && b % i == 0) {
                n = i;
            }
            if (i > max) {
                max = n;
            }
        } return max;
    }
}


