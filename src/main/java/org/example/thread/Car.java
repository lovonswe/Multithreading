package org.example.thread;

public class Car implements Runnable{

    @Override
    public void run() {
        //provide the task here
        //that is supposed to done by
        //the thread

        int i=0;
        int n=100;
        for(i=0; i<n; i++)
        {
            System.out.println("car thread : " + i);
        }
    }
}
