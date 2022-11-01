package iotprojectmanagementforuniversity;
import java.sql.*;
public class Conn {

    Connection c;
   Statement s;
   // Object s;
    
    
    @SuppressWarnings({"UseSpecificCatch", "CallToPrintStackTrace"})
Conn(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //c = DriverManager.getConnection("jdbc:mysql://","root","Lucky@1234");
       c = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Lucky@1234");
       System.out.println(c);
        s=c.createStatement();
        
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}    
}
