/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iotproject.smangementforuniversity.icons;

import java.sql.*;
public class con_class{
     Statement s ;
     Connection c ;
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/UniversityManagementsystem","root","Lucky@1234");
		    Statement s=c.createStatement();
		    System.out.println("inserting records");
                 String sql="Insert into login values('admin',12345)";   
                 //s.executeUpdate(sql);
		}
		catch(SQLException a) {
			System.out.println("print a"+a);
		}

	}
            
        }

