package com.company.company;

public class HomeWork7 {
    public static void main(String[] args) {
        int [] array = new int[20];
        array [0] = 1;
        array [1] = 2;
        array [2] = 8;
        array [3] = 1;
        array [4] = 5;
        array [5] = 3;
        array [6] = 4;
        array [7] = 16;
        array [8] = 18;
        array [9] = 21;
        array [10] = 26;
        array [11] = 50;
        array [12] = 62;
        array [13] = 25;
        array [14] = 7;
        array [15] = 15;
        array [16] = 9;
        array [17] = 34;
        array [18] = 48;
        array [19] = 77;
        for (int i = 0; i < array.length; i++)
            if(array[i]%2==0)
                System.out.print(array[i] + " ");
    }
}
/*    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for (int i = 0; i < array.length; i++)
            if(array[i]%2!=0)
                array[i]=0;
        System.out.println(Arrays.toString(array));
    }
} */

    /*int [] array = new int[20];
            array [0] = 1;
                    array [1] = 2;
                    array [2] = 8;
                    array [3] = 1;
                    array [4] = 5;
                    array [5] = 3;
                    array [6] = 4;
                    array [7] = 16;
                    array [8] = 18;
                    array [9] = 21;
                    array [10] = 26;
                    array [11] = 50;
                    array [12] = 62;
                    array [13] = 25;
                    array [14] = 7;
                    array [15] = 15;
                    array [16] = 9;
                    array [17] = 34;
                    array [18] = 48;
                    array [19] = 77;
                    for (int i = 0; i < array.length; i++)
        if(array[i]%2==1)
        array[i]=0;
        System.out.println(Arrays.toString(array));
        }
        }*/