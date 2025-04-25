package com.spa.spa.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookings")
public class Booking {
    @Id
    private String id;
    private String name;
    private String people;
    private String children;
    private String treatment;
    private String date;
    private String bookedTime;
    


    public Booking(String id, String name, String people, String children, String treatment, String date,
            String bookedTime) {
        this.id = id;
        this.name = name;
        this.people = people;
        this.children = children;
        this.treatment = treatment;
        this.date = date;
        this.bookedTime = bookedTime;
    }



    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getPeople() {
        return people;
    }



    public void setPeople(String people) {
        this.people = people;
    }



    public String getChildren() {
        return children;
    }



    public void setChildren(String children) {
        this.children = children;
    }



    public String getTreatment() {
        return treatment;
    }



    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }



    public String getDate() {
        return date;
    }



    public void setDate(String date) {
        this.date = date;
    }



    public String getBookedTime() {
        return bookedTime;
    }



    public void setBookedTime(String bookedTime) {
        this.bookedTime = bookedTime;
    }

    
    
    
}
