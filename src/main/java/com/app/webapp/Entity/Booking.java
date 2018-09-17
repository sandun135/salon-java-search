package com.app.webapp.Entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Booking {


    @Id
    @Column(name = "bookingId")
    private Long bookingId;
    @Column(name = "salonId")
    private long salonId;
    @Column(name = "stylistId")
    private long stylistId;
    @Column(name = "startTime")
    private String startTime;
    @Column(name = "endTime")
    private String endTime;

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public long getSalonId() {
        return salonId;
    }

    public void setSalonId(long salonId) {
        this.salonId = salonId;
    }

    public long getStylistId() {
        return stylistId;
    }

    public void setStylistId(long stylistId) {
        this.stylistId = stylistId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}