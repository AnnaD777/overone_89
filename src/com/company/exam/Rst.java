package com.company.exam;

public class Rst {
    public int getRst (int x1, int x2, int y1, int y2) {

        int rst = 0;
        rst = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        System.out.println("Расстояние между двумя координатами = " + Math.sqrt(rst));

    return rst;
    }
}

