package org.launchcode.calendarapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("book")
public class HelloController {

    @RequestMapping(value= "")
    public String index(Model model){

        model.addAttribute("title", "Booking App");
        return "book/index";
    }








}


