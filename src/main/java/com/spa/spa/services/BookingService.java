package com.spa.spa.services;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.spa.spa.models.Booking;

@Service
public class BookingService {
    private final MongoOperations mongoOperations;
    
    public BookingService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public Booking addBooking(Booking booking) {
        return mongoOperations.insert(booking, "bookings");
    }

    public List<Booking> getAllBookings() {
        return mongoOperations.findAll(Booking.class, "bookings");
    }

    public Booking getBookingById(String id) {
        return mongoOperations.findById(id, Booking.class, "bookings");
    }
}
