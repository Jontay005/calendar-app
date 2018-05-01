package org.launchcode.calendarapp.controllers;

import org.launchcode.calendarapp.models.data.BookingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.launchcode.calendarapp.models.Booking;

import java.util.Date;

@Controller
@RequestMapping()
public class HelloController {

    //Booking bookings = new Booking();

    @Autowired
    private BookingDao bookingDao;

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
        model.addAttribute("bookings", bookingDao.findAll());
        return "book/bookings";
    }

    @RequestMapping(value= "", method=RequestMethod.POST)
    public String processBooking(@ModelAttribute Booking  newBooking){
        bookingDao.save(newBooking);
        return "redirect:bookings";
    }

    @RequestMapping(value="remove", method=RequestMethod.GET)
    public String displayRemoveBooking(Model model){
        model.addAttribute("title", "Remove Booking");
        model.addAttribute("bookings", bookingDao.findAll());
        return "book/remove";
    }

    @RequestMapping(value="remove", method=RequestMethod.POST)
    public String processRemoveBooking(@RequestParam int [] bookingIds ){
        for (int bookingId : bookingIds){
            bookingDao.delete(bookingId);
        }
        return "redirect:";
    }

}
