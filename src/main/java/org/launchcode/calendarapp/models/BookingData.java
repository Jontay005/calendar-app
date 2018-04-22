package org.launchcode.calendarapp.models;

import java.util.ArrayList;

public class BookingData {
    static ArrayList<Booking> bookings = new ArrayList<>();

    //getAll
    public static ArrayList<Booking> getAll(){
        return bookings;
    }

    //add
    public static void add(Booking newBooking){
        bookings.add(newBooking);
    }

    //remove
    public static void remove(int id){
        Booking bookingToRemove = getById(id);
        bookings.remove(bookingToRemove);
    }

    //getById
    public static Booking getById(int id){

        Booking aBooking = null;
        for (Booking candidateBooking : bookings){
            if (candidateBooking.getInfoId() == id){
                    aBooking = candidateBooking;
            }
        }

        return aBooking;
    }
}
