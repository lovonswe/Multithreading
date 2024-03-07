package org.example.thread;

public class BookTheaterSeat {
    public static int totalSeat = 10;

    // this method is going to
    // act as a resource
    // sharing by the threads in
    // main class

    // now make this method synchronized
    synchronized void bookSeat(int seat) throws InterruptedException {
        if(totalSeat-seat>=0){
            Thread.sleep(5000);

            totalSeat-=seat;
            System.out.println(seat + " seats have been booked succecssfully");
        }
        else{
            System.out.println(seat + " seats are not available. Available seat " + totalSeat);
        }
    }
}
