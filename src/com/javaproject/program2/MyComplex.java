package com.javaproject.program2;

public class MyComplex {

    private double real=0.0;
    private double imag=0.0;

    public MyComplex(){
    }

    public MyComplex(double real, double imag){
        this.imag=imag;
        this.real=real;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if ((obj == null) || (this.getClass() != obj.getClass())) return false;
        MyComplex myComplex = (MyComplex) obj;
        return Double.doubleToLongBits(this.real) == Double.doubleToLongBits(myComplex.real)
                && Double.doubleToLongBits(this.imag) == Double.doubleToLongBits(myComplex.imag);

    }

    @Override
    public int hashCode() {
        int result = 17;

        result = (int) (31 * result + Double.doubleToLongBits(real));
        result = (int) (31 * result + Double.doubleToLongBits(imag));

        return result;
    }

    public double getReal(){
        return real;
    }

    public void setReal(double real){
        this.real=real;
    }
    public void setImage(double imag){
       this.imag=imag;
     }

     public double getImag(){
        return imag;
     }

     public String toString(){
        return "(real + imagi), e.g., ("+
                real + " + " +
                imag + "i)";
     }

     public boolean isReal(){
            return Math.abs(real)!=0;
     }

    public boolean isImaginary(){
        return Math.abs(imag)!=0;
    }

     public boolean equals(double real, double imag){
         double threshold = 0.000001;
         return ((Math.abs(this.real - real) < threshold)&&(Math.abs(this.imag - imag) < threshold));
     }

     public boolean equals (MyComplex another){
         double threshold = 0.000001;
         return ((Math.abs(another.getReal() - this.real) < threshold)&&(Math.abs(another.getImag() - this.imag) < threshold));
     }

     public double magniture(){
        return Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
     }

    public double argument(){
        double radian;
        if (real>0 && imag>=0) {return radian= Math.atan(imag/real);}
        if (real<0 && imag>=0) {return radian=Math.PI-Math.atan(Math.abs(imag/real));}
        if (real<0 && imag<0)  {return radian=Math.PI+Math.atan(Math.abs(imag/real));}
        if (real>0 && imag<0) {return radian=2*Math.PI-Math.atan(Math.abs(imag/real));}
        if (real==0 && imag>0) {return radian=Math.PI/2;}
        if (real==0 && imag<0) {return radian=3*Math.PI/2;}
        return 0.0;
    }


    public MyComplex add(MyComplex right){
        this.real=this.real+right.getReal();
        this.imag=this.imag+right.getImag();
        return new MyComplex(real, imag);
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplex substract(MyComplex right){
        this.real=this.real-right.getReal();
        this.imag=this.imag-right.getImag();
        return new MyComplex(real, imag);
    }

    public MyComplex substractNew(MyComplex right){
        return new MyComplex(this.real - right.getReal(), this.imag - right.getImag());
    }


    public MyComplex multiply(MyComplex right){
        double real1=(this.real*right.getReal())-(this.imag*right.getImag());
        double imag1=(this.real*right.getImag())+(this.imag*right.getReal());;
        return new MyComplex(real1, imag1);
    }


    public MyComplex divide(MyComplex right){
        double denominator=Math.pow((right.getReal()),2)+Math.pow((right.getImag()),2);
        double real1= ((this.real*right.getReal())+(this.imag*right.getImag()))/denominator;
        double imag1 = ((this.imag*right.getReal())-(this.real*right.getImag()))/denominator;
        return new MyComplex(real1, imag1);
    }

    public MyComplex conjugate(){
        return new MyComplex(real,-imag);
    }
}


