package com.it.mycinema;


public class Employee implements CanFuntion { // employee class implements the interface "CanFunction"
    
    private String ename;
    private String username;
    private String email;
    private String password;
    private Cinema cinemaBranch;

    // employee's constructor
    public Employee(String ename, String username, String email, String password, Cinema cinemaBranch){
        this.ename = ename;
        this.username = username;
        this.email = email;
        this.password = password;
        this.cinemaBranch = cinemaBranch;
    }
    
    public void setName(String ename) {
       this.ename = ename;
    }
    
     public String getName() {
       return ename;
   }
     
   public void setUsername(String username) {
       this.username = username;
   }
    
   public String getUsername() {
       return username;
   }
   
   public void setEmail(String email) {
       this.email = email;
   }
   
    public String getEmail() {
        return email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
     public String getPassword() {
         return password;
     }

    @Override // method to validate login info
    public Boolean login(String usrname, String passwd) {
       if (this.username == usrname && this.password == passwd){
           return true;
       }
       else{
           return false;
       }
    }

    @Override // method to reserve a ticket
    public String ReserveTicket(int hallIndex, int partyIndex, char section, int seatIndex) {
        // employee is NOT interacting directly with the methods defined in the other classes
        try{ // Exception handling if employee entered an out of range seat number
                if(cinemaBranch.hall(hallIndex).party(partyIndex).countAvSeats() < 1){
                return "Not enough seats"; // if not enough seats
                }
                else{ // if there is enough seats, reserve
                    cinemaBranch.hall(hallIndex).party(partyIndex).seat(section, seatIndex).reserve();
                    // creating a Ticket object after reserving a seat
                    new Ticket(cinemaBranch.hall(hallIndex).getMovie().toString(), cinemaBranch.hall(hallIndex).party(partyIndex).toString(), cinemaBranch.hall(hallIndex).party(partyIndex).seat(section, seatIndex).toString());
                    return "Done!";
                }
    } catch (Exception e){
        return "ERROR: Invalid Seat Index, please mind the number of seats for the selected section";
    }
    }

    @Override // method to reclaim a taken seat in case of ticket cancellation
    public void CancelTicket(int movieIndex, int partyIndex, char section, int seatIndex) {
        cinemaBranch.hall(movieIndex).party(partyIndex).seat(section, seatIndex);
    }
      
}
