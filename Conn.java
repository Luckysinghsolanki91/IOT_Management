package com.iotprojectmanagmentforuniversity;
import java.sql.*;
public class Conn {

    Connection con;
   Statement s;
   // Object s;
    
    
    @SuppressWarnings({})
Conn(){
    try{
      Class.forName("com.mysql.jdbc.Driver");
      
        //c = DriverManager.getConnection("jdbc:mysql://","root","Lucky@123");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iotprojectdata","root","Lucky@123");
       s=con.createStatement();
        if(con!=null) {
        	System.out.println("Connection successfully");
        }
    }catch(Exception e)
    {
        e.printStackTrace();
        
    }
}    
    public static void main(String args[]) {
    	System.out.println("your connection success");

    }
}

