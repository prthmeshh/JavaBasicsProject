package com.training;

public class CustomExceptionDemo {

    void validateAge(int age) throws InvalidAgeException {

        if(age<18) throw new InvalidAgeException("Age should be greater then 18");
        else System.out.println("Age is Fine");

    }
}
