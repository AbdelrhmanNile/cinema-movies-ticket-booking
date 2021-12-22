package com.it.mycinema;
public class Seat {
    private char section;
    private int index;
    private Boolean taken;

    public Seat(char section, int index){ // contructor
        this.section = section;
        this.index = index;
        this.taken = false;
         
    }

    // method to check the state of a seat, taken or not
    public Boolean state(){
        if (this.taken == false){
            return false;
        }
        else
            return true;
    }

    // method reserves a seat, change taken value to true
    public Boolean reserve(){
        if(this.taken == true){ // if you are tring to reserve an already taken seat
            return false;
        }
        else{
            this.taken = true;
            return true;
        }
    }

    public void reclaim(){ // frees a taken seat
        this.taken = false;
    }
    

    public String toString(){
        return "{" + section + index + "}";
    }
    
}