package org.example.thread;

public class MovieBookApp implements Runnable{
    //public static BookTheaterSeat bookTheaterSeat = new BookTheaterSeat();
    public static BookTheaterSeat bookTheaterSeat = new BookTheaterSeat();
    public int seat;

    public MovieBookApp (){

    }
    public MovieBookApp (int seat){
        this.seat = seat;
    }
    @Override
    public void run() {
        try{
            bookTheaterSeat.bookSeat(seat);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
