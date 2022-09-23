package iotproject.smangementforuniversity;
/*<=======================================================================>*/
//now we import package's of java
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
/*<=======================================================================>*/
//Now we create a Loginpage of our IOTPROJECTMANAGMENT FOR UNIVERSUTY AND COLLAGE

public class Loginpage extends JFrame implements ActionListener{
    JButton Login,Cancel;
     JTextField tfusername,tfpassword;
    
    Loginpage(){
        JLabel lblusername=new JLabel("USERNAME");
       setLayout(null);
       tfusername=new JTextField();
       tfusername.setBounds(150,20,150,20);
       add(tfusername);
       /*<=======================================================================>*/
       
        JLabel lblpassword=new JLabel("PASSWORD");
       lblpassword.setBounds(40,70,100,20);
       add(lblpassword);
       
       tfpassword= new JPasswordField();
       tfpassword.setBounds(150,70,150,20);
       add(tfpassword);
       //now here we create a Jbuttuon object for user login 
      Login=new JButton("Login");
      Login.setBounds(40,140,120,30);
      Login.setBackground(Color.black);
      Login.setForeground(Color.white);
      Login.addActionListener(this);
     Login.setFont(new Font("serif",Font.BOLD,15));
      add(Login);
      /*<=======================================================================>*/
       //now we create a login cancle button
       Cancel=new JButton("Cancel");
      Cancel.setBounds(180,140,120,30);
       Cancel.setBackground(Color.black);
       Cancel.setForeground(Color.white);
       Cancel.addActionListener(this);
      Cancel.setFont(new Font("serif",Font.BOLD,15));
      add( Cancel);
      /*<=======================================================================>*/
      //now we add UserLogo image
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Userlogin.png"));
       Image i2 = i1.getImage().getScaledInstance(500, 270,Image.SCALE_DEFAULT);
       ImageIcon i3 = new  ImageIcon(i2); 
       JLabel image = new JLabel(i3);
       image.setBounds(350,0,200,200);
        add(image);
      /*<=======================================================================>*/
     add(lblusername);
        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
        getContentPane().setBackground(Color.white);
       lblusername.setBounds(40,20,100,20);
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
               Conn con = new Conn();
               ResultSet rs = con.s.executeQuery(query);
             if(rs.next()){
                 setVisible(false);
                 new Project();
             }else{
                 JOptionPane.showMessageDialog(null,"Invalid username or password");
                 setVisible(false);
             }
           }catch(Exception pe){
               pe.printStackTrace();
           }
           
           // setVisible(true);
        }
        else if(e.getSource()== Cancel){
            
            setVisible(false);
        }
        
    }
    }

