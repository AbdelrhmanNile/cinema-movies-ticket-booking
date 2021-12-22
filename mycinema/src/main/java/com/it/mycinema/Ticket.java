package com.it.mycinema;

public class Ticket {
    private static int init = 0;
    private int id;
    private String movieName;
    private String party;
    private String seat;

    public Ticket(String movieName, String party, String seat){ // consructor
        this.id = init + 1;
        init++;
        this.movieName = movieName;
        this.party = party;
        this.seat = seat;
        /// #### note for fady: replacing the output to consol with output to gui ### 
        System.out.println(toString()); // prints the ticket details to the screen upon creation of that ticket
    }

    @Override
    public String toString() {
        return  "==========\n" + "Ticket id: " + id + "\nMovie: " + movieName + "\nParty: " + party + "\nSeat: " + seat+ "\n==========";
    }
}
