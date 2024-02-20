package com.training;

public class ThreadTester2 {

    public static void main(String[] args) throws InterruptedException{

        RunnableThread2 r1=new RunnableThread2("Thread-1");
        Thread t1=new Thread(r1);
        t1.start();

        t1.join();

        RunnableThread2 r2=new RunnableThread2("Thread-2");
        Thread t2=new Thread(r2);
        t2.start();


    }
}
