package com.javaproject.program1;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if ((obj == null) || (this.getClass() != obj.getClass())) return false;
        Circle circle = (Circle) obj;
        return Double.doubleToLongBits(this.radius) == Double.doubleToLongBits(circle.radius)
                && this.color.equals(circle.color);

    }

    @Override
    public int hashCode() {
        int result = 17;

        result = (int) (31 * result + Double.doubleToLongBits(radius));
        result = 31 * result + color.hashCode();

        return result;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle["+
                "radius="+ radius+
                ", color="+color +']';
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
}

