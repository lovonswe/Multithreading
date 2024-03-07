package org.example;

import org.example.thread.Car;
import org.example.thread.Counter;
import org.example.thread.MovieBookApp;

public class Main {
    public static void main(String[] args) {

        MovieBookApp movieBookApp7 = new MovieBookApp(7);
        Thread thread1 = new Thread(movieBookApp7);

        MovieBookApp movieBookApp2 = new MovieBookApp(5);
        Thread thread2 = new Thread(movieBookApp2);

        thread1.start();
        thread2.start();

        System.out.println("Remaining tickits : " + movieBookApp2.seat);

//        System.out.println("Hello world!");
//
//        Car car = new Car();
//        Counter counter = new Counter();
//
//        Thread carThread = new Thread(car);
//        Thread counterThread = new Thread(counter);
//
//        carThread.start();
//        counterThread.start();
    }
}