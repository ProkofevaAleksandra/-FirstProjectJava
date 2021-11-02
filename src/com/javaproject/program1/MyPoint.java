package com.javaproject.program1;

import javax.swing.*;
import java.util.Arrays;

public class MyPoint {
    private  int x=0;
    private  int y=0;

    public MyPoint(){
    }

    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if ((obj == null) || (this.getClass() != obj.getClass())) return false;

        MyPoint myPoint = (MyPoint) obj;
        return this.x == myPoint.x
                && this.y == myPoint.y;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + x;
        result = 31 * result + y;

        return result;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] mass= new int[2];
        mass[0]=x;
        mass[1]=y;
        return mass;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "("+
                x + "," +
                y + ")";
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
    }


    public double distance(MyPoint anotherPoint){
        return Math.sqrt(Math.pow((this.x-anotherPoint.getX()),2)+Math.pow((this.y-anotherPoint.getY()),2));
    }

    public double distance(){
        return Math.sqrt(Math.pow((this.x-0),2)+Math.pow((this.y-0),2));
    }

}
