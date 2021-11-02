package com.javaproject.program1;

import java.util.Arrays;

public class Book {

    private String name;
    private double price;
    private int qty = 0;
    private Authors[] authors = new Authors[0];

    public Book (String name, double price, Authors[] authors){
        this.name=name;
        this.price=price;
        this.authors = authors;
    }


    public Book(String name, double price, int qty, Authors[] authors){
        this.name=name;
        this.price=price;
        this.qty=qty;
        this.authors = authors;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if ((obj == null) || (this.getClass() != obj.getClass())) return false;
        Book book = (Book) obj;
        return this.name.equals(book.name)
                && Double.doubleToLongBits(this.price) == Double.doubleToLongBits(book.price)
                &&this.qty == book.qty
                && equalsUnits(book.authors);
    }

    private boolean equalsUnits(Authors[] authors) {
       return Arrays.equals(this.authors, authors);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + name.hashCode();
        result = (int) (31 * result + Double.doubleToLongBits(price));
        result = 31 * result + qty;
        result = 31 * result + unitsHashCode(authors);

        return result;
    }

    private int unitsHashCode(Authors[] authors) {

       int result = 17;
       for (int i = 0; i < authors.length; i++)
           result = 31 * result + authors[i].hashCode();
       return result;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Authors[] getAuthor(){
        return authors;
    }

    @Override
    public String toString() {
        System.out.print("Book[" +
                "name=" + name +
                ", authors={");
        for (int i = 0; i < authors.length; i++){
            System.out.print( authors[i].toString());}
            System.out.print("}, price=" + price +
                    ", qty=" + qty + ']');

        return " ";
    }


    public String getAuthorNames() {
        System.out.print("Authors = ");
        for(int i = 0; i < authors.length; i++)
            System.out.print( authors[i].getName()+" ");
        return " ";
    }
}


