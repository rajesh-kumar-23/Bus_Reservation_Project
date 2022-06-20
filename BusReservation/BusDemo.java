package BusReservation;

import java.util.Scanner;
import java.util.*;

public class BusDemo {

    public static void main(String[] args) {

        ArrayList<Bus>  buses = new ArrayList<Bus>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,48));

        ArrayList<Booking> bookings = new ArrayList<Booking>();


        int userOpt = 1;
        Scanner sc = new Scanner(System.in);

        for(Bus b : buses){

            b.displayBusInfo();

        }

        while(userOpt == 1) {

            System.out.println("Enter 1 to Book and 2 to Exit");
            userOpt = sc.nextInt();

            if(userOpt == 1) {

				Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){

                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");

                }else{

                    System.out.println("Sorry, Bus is full!");

                }

            }

        }



    }

}
