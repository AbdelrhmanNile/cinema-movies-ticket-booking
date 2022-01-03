
package com.it.mycinema;

import java.util.ArrayList;

public class DataBase {
    
    
    
    final static private String[] emp1 = {
                     /*full name*/"Abdelrhman Nile",
                     /*username*/"abdow",
                     /*email*/"abdowael@gmail.com",
                     /*pawword*/"12345678"};
    
    final static private String[] emp2 = {
                     /*full name*/"Fady",
                     /*username*/"fady123",
                     /*email*/"yetuwe@gmail.com",
                     /*pawword*/"qwert"};
    
    final static private String[] emp3 = {
                     /*full name*/"Islam",
                     /*username*/"islam123",
                     /*email*/"ghgsdy@gmail.com",
                     /*pawword*/"123456789"};
    
    final static private String[] emp4 = {
                     /*full name*/"Reyad",
                     /*username*/"reyad123",
                     /*email*/"jjgsd@gmail.com",
                     /*pawword*/"rerere12"};
    
    final static private String[] emp5 = {
                     /*full name*/"Mohamad",
                     /*username*/"momo6",
                     /*email*/"ffutf@gmail.com",
                     /*pawword*/"22345678"};
    
    static private ArrayList<String[]> employess = new ArrayList<>(5);
    
    
    static public String getQuery(int empIndex, String datafield){
        
        employess.add(emp1);
        employess.add(emp2);
        employess.add(emp3);
        employess.add(emp4);
        employess.add(emp5);
        
        if(datafield == "fname"){
            return employess.get(empIndex)[0];
        }
        else if (datafield == "username"){
            return employess.get(empIndex)[1];
        }
        else if (datafield == "email"){
            return employess.get(empIndex)[2];
        }
        else if (datafield == "password"){
            return employess.get(empIndex)[3];
        }
        else throw new ArithmeticException("database error: non existing datafield");
    }
}
