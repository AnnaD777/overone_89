package com.company.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLinkList {

        public static void main(String[] args) {
           ArrayList<Integer> ball = new ArrayList<>(100);
            for (int i=1; i<=100; i++)  {
                ball.add (i);
            }
            Collections.shuffle(ball);
            //System.out.println("Выпавшие шары:");
            for (int i=1; i<=11; i++) {
                System.out.print("Шар №"+ ball.get(i)+" ");
            }

      /*    String text = "На дворе трава, на траве дрова, не руби дрова на трва дрова";
            ArrayList<String> word = new ArrayList<>();
            word.add ("Иванов");
            word.add ("Петров");
            word.add ("Иванов");
            word.add ("Сидоров");
            word.add ("Иванов");
            word.add ("Смирнов");
            int number = Collections.frequency(word, "Иванов");
            System.out.println("Иванов повторяется" + " " + number + " раза");*/





//       ArrayList<Integer> list1 = new ArrayList<>();
//              list1.add(1);
//             list1.add(452);
            // list1.add(4363);
            // list1.add(25245);
            //  list1.add(46246);
            // list1.add(14614);
            // System.out.println(list1);
//            ArrayList<Integer> list1 = new ArrayList<>();
//            for (int i = 0; i < 10; i++) {
//                list1.add(i);
//            }
//            System.out.println(list1);

          /*    ArrayList<String> list = new ArrayList<>();
                list.add(0, "Январь");
                list.add(1, "Февраль");
                list.add(2, "Март");
                list.add(3, "Апрель");
                list.add(4, "Май");
                list.add(5, "Июнь");
                list.add(6, "Июль");
                list.add(7, "Июль");
           //     list.remove(3);
              //  System.out.println(list);
         /*       for (Integer integer : list) {
                        System.out.println("number = " + integer);
                }
                       ArrayList<Integer> arrayList =
                        new ArrayList<>(Arrays.asList(1,2,3,4,5));
                System.out.println(arrayList);

                ArrayList<String> arrayList2 =
                        new ArrayList<>(Arrays.asList("Petya", "Vasya"));
                System.out.println(arrayList2);*/
        /*    ArrayList<String> months = new ArrayList<>();
                months.add("Январь");
                months.add("Февраль");
                months.add("Март");
                months.add("Апрель");
                months.add("Май");
                months.add("Июнь");
                months.add("Июль");
                months.add("Август");

              //  System.out.println(months.size());
              //  months.set(1, "Гдекабрь");
              // System.out.println(months);
             //    months.remove("Январь");
     //  System.out.println(months);
              //  System.out.println(months.get(3));
             //   int b1 = months.indexOf("Май");
             //   System.out.println(b1);
             //   boolean b2 = months.contains("Мар");
             //   System.out.println(b2);
            //    Collections.swap(months, months.indexOf("Апрель"),
              //          months.indexOf("Январь"));
              //  System.out.println(months);
             //   Collections.sort(months);
            //    System.out.println(months);
             //  Collections.reverse(months);
             //   System.out.println(months);
              //  months.clear();
              //  System.out.println(months);*/
             //   System.out.println(list.equals(months));
            /*   String[] strArray = {"a", "b", "c", "e", "f"};
                ArrayList<String> arrayList1 =
                        new ArrayList<>(Arrays.asList(strArray));
                System.out.println(arrayList1);

                String[] strArray1 = {"a", "b", "c", "e", "f"};
                boolean b = Arrays.asList(strArray1).contains("b");
                System.out.println(b);*/

             /*  LinkedList<Integer> linkedList = new LinkedList<>();
                for (int i = 0; i < 10; i++) {
                        linkedList.add(i);}
                        System.out.println(linkedList);
              //  System.out.println(linkedList.getFirst() + " "
                  //      + linkedList.getLast());
            /*    System.out.println(linkedList.removeFirst() + " "
                        + linkedList.removeLast());
              System.out.println(linkedList);*/
          /*  String mitsubishi = "Mitsubishi Outlander";
            String mazda = "Mazda 6";
            String honda = "Honda Accord X";
            String toyota = "Toyota Highlander";


            LinkedList<String> cars = new LinkedList<>();
            cars.add(mazda);
            cars.add(honda);

            cars.addFirst(toyota);
            cars.addLast(mitsubishi);

         //   System.out.println(cars);
           // System.out.println(cars.peekFirst());
       //    System.out.println(cars.peekLast());


           System.out.println(cars.pollFirst());
           System.out.println(cars.pollLast());

           System.out.println(cars);*/

}}

