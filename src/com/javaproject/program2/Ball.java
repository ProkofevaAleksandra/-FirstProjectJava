package com.javaproject.program2;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private double xDelta;
    private double yDelta;

    public Ball(float x, float y, int radius, int speed, int direction){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta = speed * cos(direction);
        this.yDelta = - speed * sin(direction);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public double getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+=xDelta;
        y+=yDelta;
    }

    public void reflectHorizontal(){
        xDelta=-xDelta;
    }

    public void reflectVertical(){
        yDelta=-yDelta;
    }

    @Override
    public String toString() {
        return "Ball[("+ x + ","+ y+")" +
                ", speed= (" +xDelta +","+ yDelta+")]";
    }
}
