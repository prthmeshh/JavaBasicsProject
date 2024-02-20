package com.training;

import java.io.FileInputStream;
import java.io.FileReader;

public class ExceptionDemo
{
    public static void main(String[] args) {
      // FileReader fileReader=new FileReader("demo.txt"); //Checked Exception

        try{
            int x=0;
            int y=5/x;   //Unchecked Exception
        }
        catch(NumberFormatException e) {
            System.out.println("Number format Exception occurred");
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }
        catch(Exception e) {
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("Inside Finally Block");
        }

        System.out.println("Program continues");



    }
}
