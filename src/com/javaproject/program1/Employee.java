package com.javaproject.program1;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.firstName=firstName;
        this.id=id;
        this.lastName=lastName;
        this.salary=salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if ((obj == null) || (this.getClass() != obj.getClass())) return false;

        Employee employee = (Employee) obj;
        return this.id == employee.id
                && this.firstName.equals(employee.firstName)
                && this.lastName.equals(employee.lastName)
                && this.salary == employee.salary;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + id;
        result = 31 * result + salary;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();

        return result;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName+ " "
                +lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary (){
        return salary*12;
    }

    public int raiseSalary(int percent){
        return salary*percent;
    }

    @Override
    public String toString() {
        return "Employee["+
                "id="+ id+
                ", name="+getName()+
                ", salary="+salary+']';
    }
}
