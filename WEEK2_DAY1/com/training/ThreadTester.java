package com.training;

public class ThreadTester {

    public static void main(String[] args) throws InterruptedException{
       // ThreadDemo t1=new ThreadDemo(); //Thread is born-new state
      //  t1.start();  //runnable state

       /* RunnableThread r1=new RunnableThread("Thread-1");
        Thread t1=new Thread(r1);
        t1.start();

        t1.join();

        RunnableThread r2=new RunnableThread("Thread-2");
        Thread t2=new Thread(r2);
        t2.start(); */

       /* Table table=new Table();
        Thread1 t1=new Thread1(table);
        t1.setDaemon(true);
        System.out.println("Thread1 priority :"+t1.getPriority());
        Thread2 t2=new Thread2(table);
        t2.setPriority(10);
        // t1.start();
        // t2.start(); */

        Account account=new Account();

        new Thread(){
            public void run() {
                try {
                    account.withdraw(1200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();

        new Thread(){
            public void run() {
                account.deposit(500);
            }
        }.start();


    }
}

