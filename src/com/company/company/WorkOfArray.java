package com.company.company;

public class WorkOfArray {

    public static int[] sort(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                    if (array[j] < array[j + 1]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                }
            }
        }
        return array;
    }

}

