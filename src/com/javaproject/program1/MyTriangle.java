package com.javaproject.program1;

import com.javaproject.program1.MyPoint;

public class MyTriangle {

    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();
    private double sideLength_V1V2, sideLength_V2V3, sideLength_V3V1;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1.setXY(x1, y1);
        this.v2.setXY(x2, y2);
        this.v3.setXY(x3, y3);
        sideLength_V1V2 = v1.distance(v2);
        sideLength_V2V3 = v2.distance(v3);
        sideLength_V3V1 = v3.distance(v1);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if ((obj == null) || (this.getClass() != obj.getClass())) return false;

        MyTriangle myTriangle = (MyTriangle) obj;
        return myTriangle.v1.equals(v1)
                && myTriangle.v2.equals(v2)
                && myTriangle.v3.equals(v3);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + v1.hashCode();
        result = 31 * result + v2.hashCode();
        result = 31 * result + v3.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() + v2.toString() + v3.toString() + ']';
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }


    private boolean isEqual(double x, double y) {
        final double threshold = 0.000001;
        return Math.abs(x - y) < threshold;
    }

    public String getType() {
        if ((sideLength_V1V2 < sideLength_V2V3 + sideLength_V3V1) && (sideLength_V2V3 < sideLength_V1V2 + sideLength_V3V1) && (sideLength_V3V1 < sideLength_V2V3 + sideLength_V1V2)) {

            if (isEqual(sideLength_V1V2, sideLength_V2V3) || isEqual(sideLength_V2V3, sideLength_V3V1) || isEqual(sideLength_V3V1, sideLength_V1V2)) {
                return "Isosceles triangle!";
            }

            if (isEqual(sideLength_V1V2, sideLength_V2V3) && isEqual(sideLength_V2V3, sideLength_V3V1) && isEqual(sideLength_V3V1, sideLength_V1V2)) {
                return "Equilateral triangle!";
            }

            if (!isEqual(sideLength_V1V2, sideLength_V2V3) && !isEqual(sideLength_V2V3, sideLength_V3V1) && !isEqual(sideLength_V3V1, sideLength_V1V2)) {
                return "Not equilateral triangle!";
            }
        }
        return "Such a triangle cannot exist!";
    }
}
