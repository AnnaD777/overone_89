package com.company.company;

import java.util.Arrays;

public class Practice {

    public static void main (String[]args) {
        int[] array = new int[100];
        for (int i = 9, j=0; i < array.length; i = i+10, j++) {
            array [i] = j+1;
            System.out.println(Arrays.toString(array));
        }



        }
    }







