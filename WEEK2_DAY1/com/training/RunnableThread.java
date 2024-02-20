package com.training;

public class RunnableThread implements Runnable{

    private Thread t;
    private String threadName;


    public RunnableThread(String threadName){
        this.threadName=threadName;
        System.out.println("Creating "+threadName);
    }


    @Override
    public void run() {
        System.out.println("Running...."+threadName);
        try{

            for(int i=1;i<=5;i++)
            {
                System.out.println("Thread ::"+threadName+" "+i+" "+"time(s)");
                Thread.sleep(1000);  //Block or interrupted state
            }

        }catch(InterruptedException e){
            System.out.println(threadName +" interrupted");

        }

        System.out.println("Thread is exiting :"+threadName);

    }
}
