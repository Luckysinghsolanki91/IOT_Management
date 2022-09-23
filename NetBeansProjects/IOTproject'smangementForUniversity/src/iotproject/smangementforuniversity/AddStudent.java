package iotproject.smangementforuniversity;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.SQLException;
//import java.awt.Image;
//import com.toedter.calendar.JDateChooser;
public class AddStudent extends JFrame implements ActionListener{
    //here we create a globlly object
    JTextField tfname;
    JTextField tfemail;
    JTextField tfproject;
    JTextField lblrollno;
     JTextField tfphone;
    JLabel labelrollno;
    JLable lblprolist;
    JButton submit,cancel;
    JTextField tfaddress;
  //  JDateChooser dcdob;
    JComboBox cbprolist;
     Random ran = new Random();
     long first6 = Math.abs((ran.nextInt()%900000L)+100000L);
   // private Object dcbob;
    AddStudent(){
        setSize(900,700);
        setLocation(350,50);
        setVisible(true);
        setLayout(null);
        JLabel heading = new JLabel("New Student Details");
        heading.setBounds(410,30,500,50);
        heading.setFont(new Font("serif",Font.ITALIC,40));
        add(heading);
        
        
        //setSize(1366,768);
        //setVisible(true);
        
        /* ImageIcon i1;
        i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Home.jpg.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1366,768,Image.SCALE_DEFAULT);
       ImageIcon i3 = new  ImageIcon(i2); 
       JLabel image = new JLabel(i3);
        add(image);
          //JMenuBar mb=new JMenuBar();
        //setJMenuBar(mb);
*/      
        
        
        
        JLabel lblname = new JLabel("Student_Name:");
           lblname.setBounds(20,150,300,30);
        lblname.setFont(new Font("serif",Font.ITALIC,20));
        add(lblname);
        
 
       JLabel lblproject = new JLabel("Student_project_name:");
        lblproject.setBounds(340,150,1000,30);
         lblproject.setFont(new Font("serif",Font.ITALIC,20));
        add(lblproject);
        
        JLabel lbladdress = new JLabel("Address:");
        lbladdress.setBounds(50,250,1000,30);
         lbladdress.setFont(new Font("serif",Font.ITALIC,20));
        add(lbladdress);
        tfaddress = new JTextField();
          tfaddress.setBounds(200,150,150,30);
          add(tfaddress);
          
          
          JLabel lblphone = new JLabel("Phone_number:");
        lblphone.setBounds(340,150,1000,30);
         lblphone.setFont(new Font("serif",Font.ITALIC,20));
        add(lblphone);
        
        tfphone = new JTextField();
          tfphone.setBounds(530,150,150,30);
          add(tfphone);
          
          
          
        JLabel lblemail = new JLabel("Email Id:");
         lblemail.setBounds(50,350,200,30);
          lblemail .setFont(new Font("serif",Font.ITALIC,20));
        add(lblemail);
        tfemail = new JTextField();
          tfemail.setBounds(200,300,150,30);
          add(tfemail);
          
          
         /* JLabel lblphone = new JLabel("Phone_number:");
        lblphone.setBounds(340,150,1000,30);
         lblphone.setFont(new Font("serif",Font.ITALIC,20));
        add(lblphone);
        
        tfphone = new JTextField();
          tfphone.setBounds(530,150,150,30);
          add(tfphone);
          
          JLabel lbladdress = new JLabel("Address:");
        lbladdress.setBounds(50,250,1000,30);
         lbladdress.setFont(new Font("serif",Font.ITALIC,20));
        add(lbladdress);
        tfaddress = new JTextField();
          tfaddress.setBounds(200,150,150,30);
          add(tfaddress);*/
          
          
        
        @SuppressWarnings("LocalVariableHidesMemberVariable")
         JLabel lblrollno = new JLabel("Student_roll_name:");
        lblrollno.setBounds(70,200,200,30);
         lblrollno.setFont(new Font("serif",Font.ITALIC,20));
        add(lblrollno);
        
        /* JLabel lbldob = new JLabel("Date of Birth:");
        lbldob.setBounds(400,200,200,30);
         lbldob.setFont(new Font("serif",Font.ITALIC,20));
        add(lbldob);*/
        
        // dcdob = new JDateChooser();
        // dcdob.setBounds(600,200,150,30);
        //add(dcdob);
        
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        JLable lblprolist=new JLable("project_List");
        lblprolist.setBounds(50,200,1000,30);
         lblprolist.setFont(new Font("serif",Font.ITALIC,20));
        add(lblprolist);
        
           String prolist[]={"SELECT","First","Second","Third","Fourth","Five","Six","seven","Eight","Nine","Ten"};       
           cbprolist = new JComboBox(prolist);
           cbprolist.setBounds(200,400,150,30);
          cbprolist.setBackground(Color.WHITE);
           add( cbprolist);
           
        
        
        labelrollno = new JLabel("0829CS"+first6);
        labelrollno.setBounds(305,200,200,30);
         labelrollno.setFont(new Font("serif",Font.ITALIC,20));
        add(labelrollno);
       
        
         tfproject = new JTextField();
          tfproject.setBounds(530,150,150,30);
          add(tfproject);
       setVisible(true); 
        
        
          tfname = new JTextField();
          tfname.setBounds(150,150,150,30);
          add(tfname);
          
          
           //now here we create a Jbuttuon object for user login 
      submit=new JButton("Submit");
      submit.setBounds(250,550,120,30);
      submit.setBackground(Color.black);
      submit.setForeground(Color.white);
      submit.addActionListener(this);
     submit.setFont(new Font("serif",Font.BOLD,15));
      add(submit);
       //now we create a login cancle button
       cancel=new JButton("Cancel");
      cancel.setBounds(450,550,120,30);
       cancel.setBackground(Color.black);
       cancel.setForeground(Color.white);
       cancel.addActionListener(this);
      cancel.setFont(new Font("serif",Font.BOLD,15));
      add(cancel);
          
          
       setVisible(true);   
    }
    
    @Override
    @SuppressWarnings("CallToPrintStackTrace")
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String name=tfname.getText();
            //String lblproject=tfproject.getText();
            String rollno=labelrollno.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email = tfemail.getText();
            try{
                String query="insert into student values('"+name+"'+'"+rollno+"'+'"+address+"'+'"+phone+"'+'"+email+"')";
                Conn con=new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Student details succesfully..");
                setVisible(false);
            }catch(HeadlessException | SQLException e){
                e.printStackTrace();
                
            }
            
        }else{
            setVisible(false); 
        }
    }
    
    
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
     public static void main(String args[]){
         new AddStudent();
     }

    private void add(JLable lblprolist){
    }
}
