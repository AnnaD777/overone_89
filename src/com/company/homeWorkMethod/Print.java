package com.company.homeWorkMethod;

import java.util.Arrays;

public class Print {
    public static void printToArray (){
        int [] array = {2, 8, 15, 1, 4, 5, -3, 7};
        MethodSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
