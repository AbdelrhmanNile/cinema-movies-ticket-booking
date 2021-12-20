package com.it.mycinema;
import java.util.ArrayList;


public class Hall 
  {
   
   private static int TotalNumOfSeats = 50;
   private static int NumOfSections = 3;
   private Movie movie;
   ArrayList <Seat> secA = new ArrayList(10);
   ArrayList <Seat> secB = new ArrayList(30);
   ArrayList <Seat> secC = new ArrayList(10);
   
   public Hall()
   {
    generateSeats();
   }
   
   //This method generates 50 seat for each hall 
   private void generateSeats()
   {
       for(int i = 0; i < 10 ; i++)
       {
         secA.add(i,new Seat());
         secC.add(i,new Seat());
       }
       for (int s=0 ; s<30 ; s++)
       {
         secB.add(s,new Seat());
       }
       
   }
   public Seat seat(char section,int seat)
   {
       if(section =='A'||section=='a')
       {
           return secA.get(seat);
       }
       else if (section == 'B'||section == 'b')
       {
           return secB.get(seat);
       }
       else
           return secC.get(seat);
          
   }
   public void setMovie(Movie movie)
   {
       this.movie = movie;
   }
   public Movie getMovie()
   { 
       return movie;
   }
   
}
   
   

   


