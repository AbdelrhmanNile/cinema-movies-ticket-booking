package com.it.mycinema;
import java.util.ArrayList;


public class Hall {
   protected Movie movie;
   // 2D array holding parties time table {{from, to}, {from, to}, .... }
   private String parties[][] = {{"12:00pm", "2:00pm"}, {"2:10pm", "4:10pm"}, {"4:20pm", "6:20pm"}, {"6:30pm", "8:30pm"}, {"8:40", "9:40"}};
   private ArrayList<Party> partiesArrayList = new ArrayList<Party>(5); // ArrayList hold Party objects
   
   public Hall(){ // constructor
       setParties(parties);
    }

    

   
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public Movie getMovie() {
        return movie;
    }
    // method to take the data from the 2D array and makes objects of them, then adds them to the ArrayList
    private void setParties(String[][] parties){
       for(int i=0; i < parties.length; i++){
           for(int j=0; j < parties[i].length; j = j + 2){
               partiesArrayList.add(new Party(parties[i][j], parties[i][j+1]));
           }
       } 
    }
    // method to access a specific party inside the ArrayList
    public Party party(int index){
        return partiesArrayList.get(index);
    }
   }


