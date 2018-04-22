package org.launchcode.calendarapp.models;

public class Booking {
    private String eventType;
    private String fname, lname, email, description;
    private int infoId;
    private static int nextId = 1;

    public Booking(String eventType, String fname, String lname, String email, String description) {
        this();
        this.eventType = eventType;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.description = description;
    }

    public Booking(){
        infoId = nextId;
        nextId++;
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

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }
}
