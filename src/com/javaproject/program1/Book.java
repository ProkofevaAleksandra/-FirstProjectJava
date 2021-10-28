package com.javaproject.program1;

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
            System.out.print( authors[i].getName(authors)+" ");
        return " ";
    }
}


