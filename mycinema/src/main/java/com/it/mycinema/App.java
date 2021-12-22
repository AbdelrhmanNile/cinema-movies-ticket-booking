package com.it.mycinema;

public class App {
    public static void main(String[] args) throws Exception {
       String moviestitle[][] = {{"batman", "120"}, {"superman", "200"}, {"eve","150"},{"bob", "50"}, {"spiderman 3","132"}};
        Cinema c1 = new Cinema("AliBaBa", 5, 5, 6, moviestitle);
        Employee em1 = new Employee("Abdoe Wael", "abdow", "abdo@gmail.com", "12345678", c1);

       System.out.println(em1.ReserveTicket(4, 3, 'A', 54)); 
        
         
    }
}
