package org.example.thread;

public class Counter implements Runnable{

    @Override
    public void run() {
        int i=0;
        int n=100;
        for(i=0; i<n; i++)
        {
            System.out.println("counter thread : " + i);
        }
    }
}
