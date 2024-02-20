package com.training;
import javax.naming.InvalidNameException;
import java.util.Scanner;

public class MarathonClass {


    private String name;
    private int age;
    private String gender;
    private String contactNo;




    // Constructor
    public MarathonClass(String name, int age, String gender, String contactNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNo = contactNo;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContactNo() {
        return contactNo;
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age = 0;
        String gender = "";
        String contactNo = "";




        try {
            System.out.println("Enter name :");
            name = scanner.nextLine();
            if (name.isBlank()) {
                throw new InvalidNameException("Name cannot be empty.");
            }
        } catch (InvalidNameException e) {
            System.err.println(e.getMessage());
            return;
        }





        try {
            System.out.println("Enter Gender :");
            gender = scanner.nextLine().toLowerCase();
            if (!gender.equals("male") && !gender.equals("female") && !gender.equals("other")) {
                throw new IllegalArgumentException("Invalid gender. Please enter 'male,' 'female,' or 'other'.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return;
        }





        try {
            System.out.println("Enter Contact Number :");
            contactNo = scanner.nextLine();
            String regex = "^(1-)?[0-9]{3}-?[0-9]{3}-?[0-9]{4}$";
            if (!contactNo.matches(regex)) {
                throw new IllegalArgumentException("Invalid contact number. Please enter a valid phone number.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return;
        }





        try {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            if (age < 0 || age > 125) {
                throw new NumberFormatException("Invalid age. Age must be between 0 and 125.");
            }

        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            return;
        } finally {
            scanner.close();
        }






        MarathonClass runner = new MarathonClass(name, age, gender, contactNo);

        System.out.println("\nRegistration successful!");
        System.out.println("Name: " + runner.getName());
        System.out.println("Age: " + runner.getAge());
        System.out.println("Gender: " + runner.getGender());
        System.out.println("Contact Number: " + runner.getContactNo());
    }
}
