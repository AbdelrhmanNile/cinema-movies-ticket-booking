package com.it.mycinema;
import java.util.ArrayList;

public class Party {
    private String from;
    private String to;
    
    protected static int TotalNumOfChairs = 50;
    protected static int NumOfSections = 3;
    private ArrayList<Seat> secA = new ArrayList<Seat>(10); 
    private ArrayList<Seat> secB = new ArrayList<Seat>(30); 
    private ArrayList<Seat> secC = new ArrayList<Seat>(10);
    public Party(String from, String to){
        this.from = from;
        this.to = to;
        generateSeats();
    }

    private void generateSeats(){
        for (int i = 0; i < 10; i++){
          secA.add(new Seat());
          secC.add(new Seat()); 
       }
       for (int i = 0; i < 30; i++){
           secB.add(new Seat());
       }
       
   }

   public Seat seat(char section, int chair){
       if (section == 'A' || section == 'a'){
           return secA.get(chair);
       }
       else if (section == 'B' || section == 'b'){
           return secB.get(chair);
       }
       else
            return secC.get(chair);
    }


    public String toString(){
        return "from: " + from + ", to: " + to;
    }
}
