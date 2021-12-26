package com.it.mycinema;

public class App {
    public static void main(String[] args) throws Exception {
       String moviestitle[][] = {{"batman", "120"}, {"superman", "200"}, {"eve","150"},{"bob", "50"}, {"spiderman 3","132"}};
        Cinema c1 = new Cinema("AliBaBa Cinema", 5, 5, 6, moviestitle);
        Employee em1 = new Employee("Abdo Wael", "abdow", "abdo@gmail.com", "12345678", c1);

       System.out.println(em1.reserveTicket(3, 4, 'B', 16));
        
       //System.out.println(em1.reserveTicket(3, 4, 'C', 3)); 
       
        
         
    }
}
