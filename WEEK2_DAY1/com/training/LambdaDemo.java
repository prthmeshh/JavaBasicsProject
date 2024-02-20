package com.training;

import java.util.function.BiFunction;

public class LambdaDemo {
    public static void main(String... args) {

       // myFunctionalInterface obj=(a,b) -> a+b;
       // System.out.println(obj.getSum(20,30));


        BiFunction<Integer,Integer,Integer> obj=(a,b)-> a+b;
        System.out.println(obj.apply(70,30));



    }



}
