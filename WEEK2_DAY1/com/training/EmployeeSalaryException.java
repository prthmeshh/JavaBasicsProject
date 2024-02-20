package com.training;


import java.sql.SQLOutput;
import java.util.Scanner;

// Custom exception class for invalid salary
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}



// Employee class
class Employee {
    private String name;
    private double salary;




    // Constructor
    public Employee(String name, double salary) throws InvalidSalaryException {
        if (salary < 30000) {
            throw new InvalidSalaryException("Salary cannot be less than 30k");
        }
        this.name = name;
        this.salary = salary;
    }



    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative");
        }
        this.salary = salary;
    }

}




// Main class for testing
public class EmployeeSalaryException {
    public static void main(String[] args) {
        try {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter employee Name :");
            String name=sc.nextLine();
            System.out.println("Enter Employee Salary :");
            double salary=sc.nextInt();

            Employee emp1 = new Employee(name,salary);
            System.out.println("Done!!!");
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
