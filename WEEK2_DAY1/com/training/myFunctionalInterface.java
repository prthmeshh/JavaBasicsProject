package com.training;

//only one abstract method
@FunctionalInterface
public interface myFunctionalInterface
{
    // void show();
     int getSum(int a,int b);

    default void populateLog(String str){
    System.out.println("Logging....."+str);
}


}
