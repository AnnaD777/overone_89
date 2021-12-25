package com.company.company;

import java.util.Arrays;

public class HomeWork8 {

    public static void main(String[] args) {

      /*  int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 20);
        }
        System.out.println(Arrays.toString(array));
    boolean k = true;
        for (int i = 1; i < array.length; i++) {
        if (array[i] <= array[i - 1]) {
            k = false;
          break;
        }
    }
        if (k){
                System.out.println("Массив является строго возрастающей последовательностью");
            } else {
                System.out.println("Массив не является строго возрастающей последовательностью");
            }
        }
    }*/










  /*      int[] array = {25, -15, 14, 0, -5, 7};
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int k = array[i];
                array[i] = array[min_i];
                array[min_i] = k;
            }
        }
            System.out.println(Arrays.toString(array));
    }
}*/


        int[] array = {25, -15, 14, 0, -5, 7};
        for (int i = array.length-1 ; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


