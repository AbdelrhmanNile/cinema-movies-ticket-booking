package com.it.mycinema;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class Ticket {
    private static int numOfTickets = 0;
    private String cinemaName;
    private int id;
    private String movieName;
    private String party;
    private String seat;
    private String employeeName;


    public Ticket(String cinemaName, String movieName, String party, String seat, String employeeName){ // consructor
        this.cinemaName = cinemaName;
        this.id = numOfTickets + 1;
        numOfTickets++;
        this.movieName = movieName;
        this.party = party;
        this.seat = seat;
        this.employeeName = employeeName;
        /// #### note for fady: replacing the output to consol with output to gui ### 
        System.out.println(toString()); // prints the ticket details to the screen upon creation of that ticket
    }

    private String getDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    @Override
    public String toString() {
        return  "----------| "+ cinemaName + " |----------" + "\n // Employee: "+ employeeName + "\n // Time Stamp: "+ getDateTime() + "\n\nTicket id: " + id + "\nMovie: " + movieName + "\nParty: " + party + "\nSeat: " + seat+"\n======================================";
    }
}
