package com.company.company;
public class HomeWork6 {
    public static void main(String[] args) {
        int number = 5485611;
        int count = 0;
        int sum = 0;
        int result = 0;
        while (number > 0) {
            sum = sum + number % 10;
            count++;
            number = number / 10;
        }
        result = sum / count;
        System.out.println(result);
    }
}













       /* int number = 38641;
        int min = 9;
        int max = 0;

        while (number > 0) {
            if (min > number%10){
                min = number%10;
            }
            if (max < number%10) {
                max = number%10;
            }
            number = number/10;
        }
        System.out.println("Min значение"+" "+min);
        System.out.println("Max значение"+" "+max);
    }
}*/










     /*   int i = 234567654;
        System.out.print("Четные числа:" + " ");
        while (i > 0) {
            int k = i % 10;
            if (k % 2 == 0) {
                System.out.print(k + " ");
            } i = i / 10;
        }
        System.out.println();
        int l = 234567654;
        System.out.print("Нечетные числа:" + " ");
        while (l > 0) {
            int f = l % 10;
            if (f % 2 != 0) {
                System.out.print(f + " ");
            } l= l/10;
        }
    }}*/
