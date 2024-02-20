package com.training;

public class Table {

    void printTable(int n){
        synchronized (this)
        {
            System.out.println("Table of :"+n);
            for(int i=1;i<=10;i++)
            {
                System.out.println(n*i);
            }

        }

    }
}
