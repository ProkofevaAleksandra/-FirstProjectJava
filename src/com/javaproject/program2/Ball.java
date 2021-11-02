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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if ((obj == null) || (this.getClass() != obj.getClass())) return false;

        Ball ball = (Ball) obj;
        return Float.floatToIntBits(this.x) == Float.floatToIntBits(ball.x)
                &&  Float.floatToIntBits(this.y) == Float.floatToIntBits(ball.y)
                &&this.radius == ball.radius
                && Double.doubleToLongBits(this.xDelta) == Double.doubleToLongBits(ball.xDelta)
                && Double.doubleToLongBits(this.yDelta) == Double.doubleToLongBits(ball.yDelta);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + result;
        result = 31 * result + Float.floatToIntBits(x);
        result = 31 * result + Float.floatToIntBits(y);
        result = (int) (31 * result + Double.doubleToLongBits(xDelta));
        result = (int) (31 * result + Double.doubleToLongBits(yDelta));

        return result;
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
