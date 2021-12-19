package com.it.mycinema;
import java.util.ArrayList;

public abstract class AbsCinema { 
   protected String name;
   protected int numOfHalls;
   protected int numOfMovies;
   protected int numOfParties;
   protected ArrayList<Hall> halls = new ArrayList<Hall>();
   protected ArrayList<Movie> movies = new ArrayList<Movie>();

   abstract public void setName(String name);
   abstract public String getName();
   abstract public void setNumOfHalls(int numOfHalls);
   abstract public int getNumOfHalls();
   abstract public void setNumOfMovies(int numOfMovies);
   abstract public int getNumOfMovies();
   abstract public void setNumOfParties(int numOfParties);
   abstract public int getNumOfParties();
   abstract public Hall hall(int index);
   abstract public void generateHalls(int numOfHalls);
   abstract protected void addMovies(String[][] movieslist);
   abstract protected void assignMovieToHall();
   abstract public Movie movie(int index);
}