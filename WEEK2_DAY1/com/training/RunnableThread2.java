package com.training;

public class RunnableThread2 implements Runnable{

    private Thread t;
    private String threadName;


    public RunnableThread2(String threadName){
        this.threadName=threadName;
        System.out.println("Creating "+threadName);
    }


    @Override
    public void run() {

        if (threadName.equals("Thread-1")) {
            // Display table of 5
            System.out.println("Table of 5:");
            for (int i = 1; i <= 10; i++) {
                System.out.println("5 * " + i + " = " + (5 * i));
            }
        } else if (threadName.equals("Thread-2")) {
            // Display table of 10
            System.out.println("Table of 10:");
            for (int i = 1; i <= 10; i++) {
                System.out.println("10 * " + i + " = " + (10 * i));
            }
        }

        System.out.println("Thread is exiting :"+threadName);

    }
}
