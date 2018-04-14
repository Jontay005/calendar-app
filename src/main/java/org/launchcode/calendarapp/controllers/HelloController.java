package org.launchcode.calendarapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping()
public class HelloController {

    static ArrayList<String> info = new ArrayList<>();

    @RequestMapping(value= "")
    public String index(Model model){

        model.addAttribute("title", "Artist Booking App"); //passes to the view
        model.addAttribute("header", "Pending Bookings");
        return "book/index";
    }

    @RequestMapping(value="bookings", method = RequestMethod.GET)
    public String displayBookingForm(Model model){
        model.addAttribute("title", "Artist Booking App");
        model.addAttribute("title", "Request Booking");
        model.addAttribute("info", info);
        return "book/bookings";
    }

    @RequestMapping(value= "", method=RequestMethod.POST)
    public String processBooking(@RequestParam String eventType, String description,
                                 String fname, String lname, String email){
        info.add(eventType);
        info.add(description);
        info.add(fname);
        info.add(lname);
        info.add(email);
        return "redirect:bookings";
    }

}


