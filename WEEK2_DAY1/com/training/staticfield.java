package com.training;

public class staticfield
{
    static{
        System.out.println("i am inside static block #1");
    }
    static{
        System.out.println("i am inside static block #2");
    }
    static{
        System.out.println("i am inside static block #3");
    }

    public static void main(String[] args)
    {

        System.out.println("I am inside main block");

    }

}
