package com.javaproject.program2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double ... coeffs) {
        this.coeffs=coeffs.clone();
    }

    public int getDegree(){
        return coeffs.length;
    }

    private double[] reverse(double[] coeffs) {
        double[] reversed = new double[coeffs.length];
        int length = getDegree();
        for (int i = 0; i < length; i++) {
            reversed[i] = coeffs[length - i - 1];
        }
        return reversed;
    }

    @Override
    public String toString() {
        double reversed[]=reverse(coeffs);
        String result = "";
        for(int i=reversed.length-1 ; i>=0 ; i--){
            result += reversed[i] + "x^" + i + " + ";
        }
        return result.substring(0, result.length() - 3);
    }

    public double evaluate(double x){
        double result=0;
        double reversed[]=reverse(coeffs);
        for(int i=reversed.length-1 ; i>=0 ; i--){
            result+=reversed[i]*Math.pow(x,i);
           }
        return result;
    }


    public MyPolynomial add(MyPolynomial right) {
        MyPolynomial result;

        if (right.coeffs.length >= coeffs.length) {
            result = new MyPolynomial(right.coeffs);
            int deltaI = right.coeffs.length - coeffs.length;
            for (int i = coeffs.length - 1; i >= 0; i--) {
                result.coeffs[i+deltaI] += coeffs[i];
            }
        }
        else {
            result = new MyPolynomial(this.coeffs);
            int deltaI = coeffs.length - right.coeffs.length;
            for (int i = right.coeffs.length - 1; i >= 0; i--) {
                result.coeffs[i+deltaI] += right.coeffs[i];
            }
        }
        return result;
    }


    private MyPolynomial multiply(double coef, int pow) {
        double result[] = new double[coeffs.length + pow];
        for (int i = 0; i < coeffs.length; i++) {
            result[i] = coeffs[i] * coef;
        }
        return new MyPolynomial(result);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        MyPolynomial result = new MyPolynomial(0);

        for (int i = 0; i < coeffs.length; i++) {
            result = result.add(right.multiply(coeffs[i], coeffs.length - i - 1));
        }

        return result;
    }
}
