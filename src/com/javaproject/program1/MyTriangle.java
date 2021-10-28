package com.javaproject.program1;

import com.javaproject.program1.MyPoint;


public class MyTriangle {

    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();
    boolean side1, side2, side3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1.setXY(x1, y1);
        this.v2.setXY(x2, y2);
        this.v3.setXY(x3, y3);
    }


    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() + v2.toString() + v3.toString() + ']';
    }

    public double getPerimeter() {
        //посмотреть
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public void comparingTwoNumbers() {
        final double threshold = 0.000001;
        side1=(Math.abs(v1.distance(v2) - v2.distance(v3)) < threshold);
        side2 = Math.abs(v2.distance(v3) - v3.distance(v1)) < threshold;
        side3 = Math.abs(v3.distance(v1) - v1.distance(v2)) < threshold;
    }

    public String getType() {
        if ((v1.distance(v2) < v2.distance(v3) + v3.distance(v1)) && (v2.distance(v3) < v1.distance(v2) + v3.distance(v1)) && (v3.distance(v1) < v2.distance(v3) + v1.distance(v2))) {
            if (side1|| side2|| side3){
            System.out.println("Isosceles triangle!");}

            if (side1 && side2 && side3) {
                System.out.println("Equilateral triangle!");}

            if (!side1 && !side2 && !side3) {System.out.println("Not equilateral triangle!");}
        }
        else{
                System.out.println("Such a triangle cannot exist!");
            }
            return " ";
        }
}
