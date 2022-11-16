package com.iotprojectmanagmentforuniversity;

import java.awt.Color;
import java.awt.Font;
//import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.SQLException;
//import java.sql.Statement;

//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddStudent extends JFrame implements ActionListener{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*ImageIcon i1;
      i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Home.jpg.jpg"));
     Image i2 = i1.getImage().getScaledInstance(1366,768,Image.SCALE_DEFAULT);
     ImageIcon i3 = new  ImageIcon(i2); 
     JLabel image = new JLabel(i3);
      add(image);
      */

       

  //here we create a globlly object of JTextField
  JTextField tfname;
  JTextField tfage;
  JTextField tfemail;
  JTextField tfproject;
  JTextField tfrollno;
  JTextField tfstat;
  JTextField tfphone;
  JTextField tfcollege;
  JTextField  tfDOB;
  JTextField tfsem;
  JTextField tfaddress;
  JTextField  tfcountry;
 //here we create a globlly object of JLabel 
 //JLabel labelrollno;
  //JLabel lblUniversity;
  //JLabel lblprolist;
//JLabel Agelist;
  //JLabel  ulist;
  //JLabel lSem;
  JLabel lDob ;
  JLabel lStat;
  JLabel lCoun;
 //JLabel lblcollege;
 // JLabel lblUnivesity;
  
//here we create a globlly object of JButtons of submit and cancel 
  JButton submit,cancel;


//here we created a globally JComboBox object
  //JComboBox cbprolist;
  //JComboBox  cagelist;
  //JComboBox Ulist;

//here we create a Random object for unique rollno genrater
  //Random ran = new Random();
   //long first6 = Math.abs((ran.nextInt()%900000L)+100000L);
 // private PopupMenu dcdob;
 // private Object dcbob;
  AddStudent(){
      
    /* ImageIcon i1;
      i1 = new ImageIcon(ClassLoader.getSystemResource("icons/University.jpeg"));
     Image i2 = i1.getImage().getScaledInstance(1366,768,Image.SCALE_DEFAULT);
     ImageIcon i3 = new  ImageIcon(i2); 
     JLabel image = new JLabel(i3);
     // image.setBounds(350,0,200,200);
      add(image);*/
	 // setContentPane(new JLabel(new ImageIcon("C:\\Users\\Hp\\Pictures\\student'slogo.jpg")));
      setSize(1366,768);
     // setLocation(350,90);
      setVisible(false);
      setLayout(null);
      JLabel heading = new JLabel("New Student Details");
      heading.setBounds(510,30,500,50);
      heading.setForeground(Color.red);
      heading.setFont(new Font("serif",Font.ITALIC,40));
      add(heading);
      
      
      //setSize(1366,768);
      //setVisible(true);
      
     
        //JMenuBar mb=new JMenuBar();
      //setJMenuBar(mb);
      
      
 /*=============================================================================================*/
 /*================================================================================================*/   
     JLabel lblname = new JLabel("1) Student_Name:-"); 
         lblname.setBounds(50,150,300,30);
      lblname.setFont(new Font("serif",Font.ITALIC,20));
     // lblname.setForeground(Color.red);
      add(lblname);
      
      tfname = new JTextField();
        tfname.setBounds(220,150,150,30);
        add(tfname);
        
        /*===================================================================================================*/
        /*================================================================================================*/   
        //(left,top,length,width)
        JLabel lblphone = new JLabel("2) Phone_number:-");
      lblphone.setBounds(470,150,1000,30);
       lblphone.setFont(new Font("serif",Font.ITALIC,20));
      add(lblphone);
      
      tfphone = new JTextField();
        tfphone.setBounds(650,150,150,30);
        add(tfphone);
        
      /*===================================================================================================*/               
      /*===================================================================================================*/

     JLabel lblproject = new JLabel("3) Student_project_name:-");
      lblproject.setBounds(898,150,1000,30);
       lblproject.setFont(new Font("serif",Font.ITALIC,20));
      add(lblproject);
      
       tfproject = new JTextField();
        tfproject.setBounds(1120,150,150,30);
        add(tfproject);
     setVisible(true); 
/*===================================================================================================*/
/*================================================================================================*/   
      //(left,top,length,width)
      JLabel lblrollno = new JLabel("4)Student_Enroll_number:");
      lblrollno.setBounds(40,250,500,30);
       lblrollno.setFont(new Font("serif",Font.ITALIC,20));
      add(lblrollno);
      //labelrollno = new JLabel("0829CS"+first6);
      tfrollno = new JTextField();
      tfrollno.setBounds(260,250,150,30);
       tfrollno.setFont(new Font("serif",Font.ITALIC,20));
      add(tfrollno);
    /*================================================================================================*/ 
    /*================================================================================================*/   
       //(left,top,length,width)
      JLabel lblemail = new JLabel("5) Student_Email Id:-");
       lblemail.setBounds(460,250,200,30);
        lblemail .setFont(new Font("serif",Font.ITALIC,20));
      add(lblemail);
      tfemail = new JTextField();
        tfemail.setBounds(650,250,150,30);
        add(tfemail);
     /*================================================================================================*/   
     /*================================================================================================*/   
     //(left,top,length,width)  
     JLabel lbladdress = new JLabel("6) Student_Address:-");
      lbladdress.setBounds(905,260,1000,30);
       lbladdress.setFont(new Font("serif",Font.ITALIC,20));
      add(lbladdress);
      tfaddress = new JTextField();
        tfaddress.setBounds(1110,260,150,30);
        add(tfaddress);
     /*================================================================================================*/   
     /*================================================================================================*/   
      //(left,top,length,width)
      JLabel lblCollege = new JLabel("7)Enter College Name:-");
     lblCollege.setBounds(40,350,1000,30);
       lblCollege.setFont(new Font("serif",Font.ITALIC,20));
      add(lblCollege);
       tfcollege = new JTextField();
        tfcollege.setBounds(240,350,150,30);
        add(tfcollege);
      
        
      /*@SuppressWarnings("LocalVariableHidesMemberVariable")
     JTextField tfcollege = new JTextField();
        tfcollege.setBounds(200,150,150,30);
        add(tfcollege);
     */
   // by using below code you can genrate a unquie rollno     
     //labelrollno = new JLabel("0829CS"+first6);
      //labelrollno.setBounds(305,200,200,30);
       //labelrollno.setFont(new Font("serif",Font.ITALIC,20));
      //add(labelrollno);
    /*================================================================================================*/     
   /*================================================================================================*/           
    
      lDob = new JLabel("8) Student_DOB:-");
      lDob.setBounds(460,350,250,30);
        lDob.setFont(new Font("serif",Font.ITALIC,20));
      add(lDob);
      tfDOB = new JTextField();
        tfDOB.setBounds(650,360,150,30);
        add(tfDOB);
      
      // String Agelist[]={"Select","Below-20","Above-20","Third","Fourth","Five","Six","seven","Eight"};       
       //  cagelist = new JComboBox(Agelist);
         // cagelist.setBounds(650,450,150,30);
         //cagelist.setBackground(Color.WHITE);
         //add(cagelist);
/*================================================================================================*/    
/*================================================================================================*/   
      lStat = new JLabel("9) Student_State:-");
      lStat.setBounds(905,350,250,30); //905,260,1000,30
        lStat.setFont(new Font("serif",Font.ITALIC,20));
      add(lStat);
      
        tfstat = new JTextField();
        tfstat.setBounds(1110,350,150,30);
        add(tfstat);
/*================================================================================================*/          
/*================================================================================================*/     
     JLabel lSem=new JLabel("10)Enter Semester:-");
         lSem.setBounds(40,450,1000,30);
       lSem.setFont(new Font("serif",Font.ITALIC,20));
      add(lSem);
      
      tfsem = new JTextField();
        tfsem.setBounds(220,450,150,30);
        add(tfsem);
      
      
        // String prolist[]={"Select","First","Second","Third","Fourth","Five","Six","seven","Eight"};       
         //cbprolist = new JComboBox(prolist);
         //cbprolist.setBounds(220,450,150,30);
        //cbprolist.setBackground(Color.WHITE);
         //add(cbprolist);
        
/*================================================================================================*/   
/*================================================================================================*/          
   // tfproject = new JTextField();
     //   tfproject.setBounds(630,350,150,30);
       // add(tfproject);
       
      
       
       
       JLabel lage = new JLabel("11) Student_Age:-");
      lage.setBounds(460,450,150,30);
        lage.setFont(new Font("serif",Font.ITALIC,20));
      add(lage);
       
     // String Agelist[]={"Select","Below-20","Above-20","Third","Fourth","Five","Six","seven","Eight"};       
       //  cagelist = new JComboBox(Agelist);
         // cagelist.setBounds(650,450,150,30);
         //cagelist.setBackground(Color.WHITE);
         //add(cagelist);
      tfage = new JTextField();
        tfage.setBounds(650,450,150,30);
        add(tfage);
/*================================================================================================*/   
/*================================================================================================*/         
       lCoun = new JLabel("12) Student_Country:-");
      lCoun.setBounds(905,450,250,30);
        lCoun.setFont(new Font("serif",Font.ITALIC,20));
      add(lCoun);
       tfcountry = new JTextField(); //650,450,150,30
        tfcountry.setBounds(1110,460,150,30);
        add(tfcountry);
/*================================================================================================*/           
        
/*================================================================================================*/             
         //now here we create a Jbuttuon object for user login 
    submit=new JButton("Submit");
    submit.setBounds(510,650,120,30);
    submit.setBackground(Color.black);
    submit.setForeground(Color.white);
    submit.addActionListener(this);
   submit.setFont(new Font("serif",Font.BOLD,15));
    add(submit);
    setVisible(false); 
/*================================================================================================*/   
                               /*=====*/
                       /*=== */         /*====*/
            /*=== */   /*student code end :)*/   /*====*/
                       /*=== */         /*====*/
                       /*=== */         /*====*/
                              /*=====*/
/*================================================================================================*/   
/*================================================================================================*/   
     //now we create a login cancle button
     cancel=new JButton("Cancel");
    cancel.setBounds(670,650,120,30);
     cancel.setBackground(Color.black);
     cancel.setForeground(Color.white);
     cancel.addActionListener(this);
    cancel.setFont(new Font("serif",Font.BOLD,15));
    add(cancel);
     setVisible(true);   
  }
  
  @Override
  public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==submit){
       /*  String studentName=tfname.getText();                                               
         String phone=tfphone.getText();
         String studentproject =tfproject.getText();
          String studentrollno=tfrollno.getText();
         String email = tfemail.getText();
         String address = tfaddress.getText();
         String collegename = tfcollege.getText();
         String studentdob = tfDOB.getText();
         String studentstate = tfstat.getText();
         String studentsemester = tfsem.getText();
          String studentage = tfage.getText();
          String studentcoun = tfcountry.getText();*/
    	 JOptionPane.showMessageDialog(null,"Your data successfully save..!");
         
        /*  try{
        	  //Conn con=new Conn();
String query="insert into student values('"+studentName+"'+'"+phone+"'+'"+studentproject+"''"+studentrollno+"'+'"+email+"'+'"+address+"'+'"+collegename+"'+'"+studentdob+"'+'"+studentstate+"'+'"+studentsemester+"'+'"+studentage+"'+'"+studentcoun+"')";
           // con.s.executeUpdate(query);
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","","");
               Statement stmt=con.createStatement();
               //con.s.executeUpdate(query);
              JOptionPane.showMessageDialog(null, "Student details succesfully..");
              setVisible(false);
          }catch(HeadlessException e){
              ((Throwable) e).printStackTrace();
              
          } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}     
          
      }else {
    	  setVisible(false);
      }
  }*/
      }
  }
  
          
  /*JTextField tfname;
  JTextField tfage;
  JTextField tfemail;
  JTextField tfuniversity;
  JTextField tfproject;
  JTextField tfcollege;
  JTextField lblrollno;
  JTextField tfstat;
  JTextField tfphone;
  JTextField tfcollege1;
  JTextField  tfDOB;
  JTextField tfaddress;
  JTextField tfUniversity; 
  JTextField  labelrollno;
  JTextField  tfcountry;
    */      /*try{
        	  Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage","","");
              Statement stmt=con.createStatement();
String query="insert into student values('"+tfstat+"'+'"+tfphone+"'+'"+tfproject+"''"+studentrollno+"'+'"+tfemail+"'+'"+tfaddress+"'+'"+collegename+"'+'"+studentdob+"'+'"+studentstate+"'+'"+studentage+"'+'"+studentsemester+"'+'"+studentcoun+"')";
            //  Conn con=new Conn();
              con.s.executeUpdate(query);
              
              JOptionPane.showMessageDialog(null, "Student details succesfully..");
              setVisible(false);
          }catch(HeadlessException | SQLException e){
              ((Object) e).printStackTrace();
              
          }
          
      }else{
          setVisible(false); 
      }
}*/

  
  
  public static void main(String args[]){
       new AddStudent().setVisible(true);
   }
  }
