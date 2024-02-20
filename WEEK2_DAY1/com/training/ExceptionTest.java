package com.training;

public class ExceptionTest {

    public static void main(String[] args) {
        CustomExceptionDemo obj =new CustomExceptionDemo();

        try{
            obj.validateAge(13);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());

        }
    }
}
