package com.company.homeWorkString;

import java.util.Arrays;

public class MethodsOfString {

    public static void main(String[] args) {
        String[] text =
                {"У лукоморья дуб зеленый ",
                        "Злотая цепь на дубе том: ",
                        "И днём и ночью кот учёный ",
                        "Всё ходит по цепи кругом; ",
                        "Идёт направо - песнь заводит, ",
                        "Налево - сказку говорит. ",
                        "Там чудеса: там леший бродит, ",
                        "Русалка на ветвях сидит; ",
                        "Там на неведомых дорожках ",
                        "Следы невиданных зверей; "};
        // Задание 1
        //  String[] words = text.split(" ");
        //   for (String word : words)
        //      System.out.println();

        // Задание 2
        //  String e = text.replace('ё', 'е');
        //  String a = e.replace('а', 'я');
        //    System.out.print(a);

        // Задание 3
        // String cut = text.replace("И днём и ночью кот учёный", " ");
        // System.out.println(cut);

        // Задание 4
        // System.out.println(text.toUpperCase());

        // Задание 5
        // System.out.println(text.toLowerCase());

        // Задание 6

        //  String words = "Русалка на ветвях сидит; ";
        //    boolean f = false;
        //  for (int i = 0; i < text.length; i++)
        //      if (text[i] == words) {
        //          f = true;
        //         break;
        //      }
        //      if (f)
        //          System.out.println("Есть");
        //       else
        //          System.out.println("Нет");

//  Задание 7

        String n;
        boolean t = false;
        for (int i = 0; i < text.length - 1; i++) {
            for (int j = 0; j >= 0; j++) {

                if (!t) {
                    n = text[j];
                    text[j] = text[text.length - 1 - j];
                    text[text.length - 1 - j] = n;
                }
                System.out.println(Arrays.toString(text));
            }
        }
    }
}
















