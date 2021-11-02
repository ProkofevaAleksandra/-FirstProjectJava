package com.javaproject.program1;

public class Rectangle {

    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){
    }

    public Rectangle (float length, float width){
        this.length=length;
        this.width=width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if ((obj == null) || (this.getClass() != obj.getClass())) return false;

        Rectangle rectangle = (Rectangle) obj;
        return Float.floatToIntBits(this.length) == Float.floatToIntBits(rectangle.length)
                && Float.floatToIntBits(this.width) == Float.floatToIntBits(rectangle.width);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + Float.floatToIntBits(length);
        result = 31 * result + Float.floatToIntBits(width);

        return result;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle["+
                "length="+ length+
                ", width="+width+']';
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

}
