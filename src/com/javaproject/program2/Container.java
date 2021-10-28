package com.javaproject.program2;

public class Container {

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x + width;
        y2 = y + height;
    }

    public int getX1(){
        return x1;
    }

    public int getY1(){
        return y1;
    }

    public int getX2(){
        return x2;
    }

    public int getY2(){
        return y2;
    }

    public boolean collides(Ball ball){
        if (ball.getX() - ball.getRadius() > x1 &&
                ball.getX() + ball.getRadius() < x2 &&
                ball.getY() - ball.getRadius() > y1 &&
                ball.getY() + ball.getRadius() < y2)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Container[("+ x1 + ","+ y1+"),("
                + x2 + ","+ y2+")";
    }
}
