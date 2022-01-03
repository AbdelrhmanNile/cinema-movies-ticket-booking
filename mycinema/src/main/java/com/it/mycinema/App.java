package com.it.mycinema;

public class App {
     static String moviestitle[][] = {{"Batman: Dark Knight", "120"}, {"Superman", "200"}, {"Predestination","150"},{"The Mummy", "190"}, {"Spiderman: No Way Home","132"}};
     static Cinema c1 = new Cinema("MUST Cinema", 5, 5, 6, moviestitle);
     


    public static void main(String[] args) throws Exception {
      

      new LoginLight().setVisible(true);
       
        
         
    }
}
