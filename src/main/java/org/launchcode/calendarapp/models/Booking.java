package org.launchcode.calendarapp.models;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;
import java.util.Date;
import javax.validation.constraints.Size;

import static javax.persistence.TemporalType.DATE;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private int Id;

    private String eventType;

    @NotNull
    //@Size(min = 3, max = 10)
    private String fname;

    @NotNull
    //@Size(min = 3, max = 10)
    private String lname;

    @NotNull
    //@Size(min = 3, max = 10)
    private String email;

    @NotNull
    //@Size(min = 0, message  = "Description cannot be empty")
    private String description;

    @Temporal(DATE)
    @DateTimeFormat(pattern="dd-MMM-YYYY")
    private Date eventDate;

    public Booking(String eventType, String fname, String lname,
                   String email, String description, Date eventDate) {
        this.eventType = eventType;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.description = description;
        this.eventDate = eventDate;
    }

    public Booking(){
    }

    public int getId() {
        return Id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
}
