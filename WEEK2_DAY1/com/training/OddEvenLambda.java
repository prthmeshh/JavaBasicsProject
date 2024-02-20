package com.training;
import java.util.function.Predicate;

public class OddEvenLambda
{
    public static void main(String[] args) {

        Predicate<Integer> isOdd = x -> x % 2 != 0;
        System.out.println(isOdd.test(5)); // Output: true
        System.out.println(isOdd.test(6)); // Output: false

    }

}
