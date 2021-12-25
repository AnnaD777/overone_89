package com.company.company;
class TaskA3 {

    public static void main (String[]args){

        int i=3;
        int j=4;
        int k = i*i+j*j;

    boolean a = (2>4) && (8>10);
    boolean b = (1<3) || (5<=0);
    boolean c = a && b;

    boolean d = (6>3) ^ (8>2);
    boolean f = (2<3) ^ (5<4);
    boolean e = d ^ f;

    System.out.println (i+"*"+i+"+"+j+"*"+j+"="+k);
    System.out.println (c);
    System.out.println (e);
    }
}


