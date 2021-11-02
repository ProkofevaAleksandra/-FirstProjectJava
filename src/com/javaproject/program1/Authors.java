package com.javaproject.program1;

public class Authors {

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if ((obj == null) || (this.getClass() != obj.getClass())) return false;

        Authors authors = (Authors) obj;
        return this.name.equals(authors.name)
                && this.email.equals(authors.email)
                && this.gender == authors.gender;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + (int)gender;
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();

        return result;
    }

   public String getName(){ return name; }
}
