package connection;
import java.sql.*;
public class con_class{
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/UniversityManagementsystem","root","Lucky@1234");
		    Statement stmt=com.createStatement();
		    System.out.println("inserting records");
                 String sql="Insert into login values('admin',12345)";   
                 stmt.executeUpdate(sql);
		}
		catch(SQLException a) {
			System.out.println("print a"+a);
		}

	}
  
            
        }
