package com.javaproject.program1;

public class Authors {

    //public static String getName;
    private String name;
    private String email;
    private char gender;

    public Authors(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Author["+
                "name="+ name+
                ", email="+email +
                ", gender="+gender +']';
    }

    public String getName(Authors[] authors){
        return name;
    }
}
