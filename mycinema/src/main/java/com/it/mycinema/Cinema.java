package com.it.mycinema;
import java.util.ArrayList;

public class Cinema extends AbsCinema{
   
   public Cinema(String name, int numOfHalls, int numOfMovies, int numOfParties, String[][] moviestitles){
       this.name = name;
       this.numOfHalls = numOfHalls;
       this.numOfMovies = numOfMovies;
       this.numOfParties = numOfParties;
       System.out.println("cinema");
       generateHalls(numOfHalls);
       addMovies(moviestitles);
       assignMovieToHall();

   }

   @Override 
   public void setName(String name) {
       this.name = name;
   }
   @Override
   public String getName() {
       return name;
   }
   @Override
   public void setNumOfHalls(int numOfHalls) {
       this.numOfHalls = numOfHalls;
   }
   @Override
   public int getNumOfHalls() {
       return numOfHalls;
   }
   @Override
   public void setNumOfMovies(int numOfMovies) {
       this.numOfMovies = numOfMovies;
   }
   @Override
   public int getNumOfMovies() {
       return numOfMovies;
   }
   @Override
   public void setNumOfParties(int numOfParties) {
       this.numOfParties = numOfParties;
   }
   @Override
   public int getNumOfParties() {
       return numOfParties;
   }
   @Override
   public void generateHalls(int numOfHalls){
       for(int i = 0; i < numOfHalls; i++){
           halls.add(new Hall());
       }
   }

   @Override
   public Hall hall(int index){
       return halls.get(index);
   }
    @Override   
    protected void addMovies(String[][] m){
      for(int i=0; i < m.length; i++){
          for(int j = 0; j < m[i].length ; j = j +2){
            movies.add(new Movie(m[i][j], Integer.parseInt(m[i][j+1])));
          }
      } 
       
   }
   @Override
   public Movie movie(int index){
       return movies.get(index);
   }
   @Override
   protected void assignMovieToHall(){
       for(int i = 0; i < movies.size(); i++){
           halls.get(i).setMovie(movies.get(i));
       }
   }

}
