package com.javaproject;

import com.javaproject.program1.*;
import com.javaproject.program2.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        System.out.println("program1:");

        Circle circle = new Circle(15,"yellow");
        System.out.print("Area circle: ");
        System.out.println(circle.getArea());

        System.out.println("");
        Rectangle rectangle = new Rectangle(1.1f, 1.1f);
        System.out.print("Area rectangle: ");
        System.out.println(rectangle.getArea());
        System.out.print("Perimeter circle: ");
        System.out.println(rectangle.getPerimeter());

        System.out.println("");
        Employee employee = new Employee(2, "Sasha", "Prokofeva", 4);
        System.out.print("Annual Salary: ");
        System.out.println(employee.raiseSalary(2));
        System.out.print("Conclusion: ");
        System.out.println(employee.toString());

        System.out.println("");
        Authors authors1 = new Authors("sasha","Prok@mail.ru",'m');
        Authors authors2= new Authors("maksim","Maksim@mail.ru",'m');
        Authors authors3= new Authors("misha","Misha@mail.ru",'m');
        Book book=new Book("cat and dog",5.0,3, new Authors[]{authors1,authors2});
        System.out.println(book.toString());

        System.out.println("");
        MyPoint myPoint=new MyPoint(2, 3);
        System.out.println(Arrays.toString((myPoint.getXY())));
        System.out.println(myPoint.distance(4,9));
        System.out.println(myPoint.distance(new MyPoint(1,2)));

        System.out.println("");
        MyTriangle myTriangle = new MyTriangle(1,2,2,4,3,2);
        System.out.println("perimeter:");
        System.out.println(myTriangle.getPerimeter());
        myTriangle.comparingTwoNumbers();
        System.out.println(myTriangle.getType());

        System.out.println("program2:");

        MyComplex myComplex=new MyComplex(2.0,4.0);
        MyComplex myComplex1=new MyComplex(2.0,4.0);
        System.out.println(myComplex.equals(myComplex1));
        System.out.println(myComplex.conjugate());

        System.out.println("");
        MyPolynomial myPolynomial=new MyPolynomial(2.0, 3.0, 2.0, 3.0);
        MyPolynomial myPolynomial2=new MyPolynomial(          2.0, 3.0, 2.0);
        System.out.println("\n First: " + myPolynomial.toString());
        System.out.println("\n Second: " + myPolynomial2.toString());
        System.out.println("\n Sum: " + myPolynomial.add(myPolynomial2));
        System.out.println("\n Multiply: " + myPolynomial.multiply(myPolynomial2));

        System.out.println("");
        Ball ball=new Ball(6.0f,7.0f,2,3,4);
        ball.move();
        Container container=new Container(1,1,20,20);
        System.out.println(container.collides(ball));
    }
}
