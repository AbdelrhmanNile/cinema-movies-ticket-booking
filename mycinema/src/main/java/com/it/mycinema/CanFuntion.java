package com.it.mycinema;

interface CanFuntion {
    // interface of the functions that an employee can do
    public Boolean login(String usrname, String passwd);
    public String ReserveTicket(int movieIndex, int partyIndex, char section, int seatIndex);
    public void CancelTicket(int movieIndex, int partyIndex, char section, int seatIndex);
}
