package org.launchcode.calendarapp.controllers;

import org.launchcode.calendarapp.models.BookingData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import org.launchcode.calendarapp.models.Booking;

@Controller
@RequestMapping()
public class HelloController {

    Booking bookings = new Booking();

    @RequestMapping(value= "")
    public String index(Model model){

        model.addAttribute("title", "Artist Booking App"); //passes to the view
        model.addAttribute("header", "Request Booking");
        return "book/index";
    }

    @RequestMapping(value="bookings", method = RequestMethod.GET)
    public String displayBookingForm(Model model){
        model.addAttribute("title", "Artist Booking App");
        model.addAttribute("title", "Pending Bookings");
        model.addAttribute("info", BookingData.getAll());
        return "book/bookings";
    }

    @RequestMapping(value= "", method=RequestMethod.POST)
    public String processBooking(@RequestParam String eventType, String description,
                                 String fname, String lname, String email){
        Booking newBooking = new Booking(eventType, fname, lname, email, description);
        BookingData.add(newBooking);
        //bookings.add(newBooking);
        return "redirect:bookings";
    }

    @RequestMapping(value="remove", method=RequestMethod.GET)
    public String displayRemoveBooking(Model model){
        model.addAttribute("title", "Remove Booking");
        model.addAttribute("bookings", BookingData.getAll());
        return "book/remove";
    }

    @RequestMapping(value="remove", method=RequestMethod.POST)
    public String processRemoveBooking(@RequestParam int [] bookingIds ){
        for (int bookingId : bookingIds){
            BookingData.remove(bookingId);
        }
        return "redirect:";
    }

}


