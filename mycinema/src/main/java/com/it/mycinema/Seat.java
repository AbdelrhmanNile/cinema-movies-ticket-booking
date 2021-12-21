package com.it.mycinema;
public class Seat {
          private boolean taken;
        public Seat (){  
        
            this.taken = false ;
        }    
         public String state (){
             if(taken==false){
                 return "free";
             } 
             else{
                 return "taken";
}
    }
         public void reserve(){
             taken=true;
         }
         public void reclaim() {
             taken=false;
         }
}