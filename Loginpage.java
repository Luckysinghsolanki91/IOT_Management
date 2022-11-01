
package iotprojectmanagementforuniversity;

/*<=======================================================================>*/
//now we import package's of java
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
//import java.sql.*;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
/*<=======================================================================>*/
//Now we create a Loginpage of our IOTPROJECTMANAGMENT FOR UNIVERSUTY AND COLLAGE

public class Loginpage extends JFrame implements ActionListener{
    JButton Login,Cancel;
     JTextField tfusername,tfpassword; 
    
    Loginpage(){
        
        
        JLabel heading = new JLabel("LOGIN-PAGE");
        heading.setBounds(80,-10,500,50);
        heading.setForeground(Color.gray);
        heading.setFont(new Font("serif",Font.ITALIC,30));
        add(heading);
        
         
        JLabel lblusername=new JLabel("USERNAME");
        lblusername.setBounds(40,60,100,20);
       add(lblusername);
       setLayout(null);
       tfusername=new JTextField("");
       tfusername.setBounds(150,60,150,20);
       add(tfusername);
       /*<=======================================================================>*/
       
        JLabel lblpassword=new JLabel("PASSWORD"); 
       lblpassword.setBounds(40,100,100,20);
       add(lblpassword);
       
       tfpassword= new JPasswordField("");
       tfpassword.setBounds(150,100,150,20);
       add(tfpassword);
       //now here we create a Jbuttuon object for user login 
      Login=new JButton("Login");
      Login.setBounds(40,160,120,30);
      Login.setBackground(Color.black);
      Login.setForeground(Color.white);
      Login.addActionListener(this);
     Login.setFont(new Font("serif",Font.BOLD,15));
      add(Login);
      /*<=======================================================================>*/
       //now we create a login cancle button
       Cancel=new JButton("Cancel");
      Cancel.setBounds(180,160,120,30);
       Cancel.setBackground(Color.black);
       Cancel.setForeground(Color.white);
       Cancel.addActionListener(this);
      Cancel.setFont(new Font("serif",Font.BOLD,15));
      add(Cancel);
      /*<=======================================================================>*/
      //now we add UserLogo image
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Userlogin.png"));
       Image i2 = i1.getImage().getScaledInstance(500, 270,Image.SCALE_DEFAULT);
       ImageIcon i3 = new  ImageIcon(i2); 
       JLabel image = new JLabel(i3);
       image.setBounds(350,0,200,200);
        add(image);
      /*<=======================================================================>*/
       
      setSize(600,300);
        setLocation(500,250);
        setVisible(true);
        getContentPane().setBackground(Color.white);
    }
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
 public static void main(String[] args){
       new Loginpage();
 }  
 
 
 /*<=======================================================================>*/
        //now we create a action listner for when user click for cancel button 
    @Override
    @SuppressWarnings({"ResultOfObjectAllocationIgnored", "UseSpecificCatch", "CallToPrintStackTrace"})
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Login){
           String username=tfusername.getText();
           String password=tfpassword.getText();
           
           String query="select*from login where username='"+username+"'and password='"+password+"'";
         
           try{
               Conn c = new Conn();
              ResultSet rs = c.s.executeQuery(query);
              System.out.print(rs);
             if(!rs.next()){
                 JOptionPane.showMessageDialog(null,"Invalid username or password");
                 setVisible(false);
             }else{
                 setVisible(false);
                 new Project();
             }
             //OPTIONAL PROCESS
             //if you want to close a connection with Mysql then use
             //c.s.close();
           }catch(Exception pe){
               pe.printStackTrace();
           }
           
           //setVisible(false);
        }
        else if(e.getSource()== Cancel){
            
            setVisible(false);
        }
        
    }
}


//public class Loginpage {
    
//}
