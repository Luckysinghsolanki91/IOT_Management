package iotprojectmanagementforuniversity;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.Desktop;
import java.net.URI;


//Choice content;
public class Project extends JFrame implements ActionListener {

    //now we create a constructor of class
    Project(){
        setSize(1366,768);
        setVisible(true);
        //now we set a background image 
        ImageIcon i1;
        i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1366,768,Image.SCALE_DEFAULT);
       ImageIcon i3 = new  ImageIcon(i2); 
       JLabel image = new JLabel(i3);
        add(image);
        //now we create a menubar of Jclass
        JMenuBar mb=new JMenuBar();
        setJMenuBar(mb);
        
         
         JMenu NewInformation = new JMenu("HOME");
        NewInformation.setBounds(550, 10, 150, 30);
        NewInformation.setForeground(Color.red);
        mb.add(NewInformation);
        
        JMenu details = new JMenu("ABOUT-US");
       details.setForeground(Color.BLACK);
        mb.add(details);
        
        
         JMenu Servies = new JMenu("SERVIES");
        Servies.setForeground(Color.red);
        mb.add(Servies);
        JMenuItem Onlineshop =new JMenuItem("IOT electronics shop");
        Shop.add(Onlineshop);
       Onlineshop .setBackground(Color.GRAY);
        Onlineshop.addActionListener(this);
         mb.add(Servies);
      
 /*<==================================================================================================>*/
 /*<==================================================================================================>*/
        //ELECTRONIC DEVICES ONLINE SHOPING
        JMenu Shop = new JMenu("SHOPING");
        Shop.setForeground(Color.BLUE);
         Shop.addActionListener(this);
        mb.add(Shop);
        
          JMenuItem Link1=new JMenuItem("LINK1");
      Shop.add(Link1); 
      Shop.setBackground(Color.RED);
      Shop.addActionListener(this);
      
        JMenuItem Link2=new JMenuItem("LINK2");
      Shop.add(Link2); 
      Shop.setBackground(Color.YELLOW);
      Shop.addActionListener(this);
      
       JMenuItem Link3=new JMenuItem("LINK3");
      Shop.add(Link3); 
      Shop.setBackground(Color.GREEN);
      Shop.addActionListener(this);
         
       JMenuItem Link4=new JMenuItem("LINK4");
      Shop.add(Link4); 
      Shop.setBackground(Color.BLUE);
      Shop.addActionListener(this);
         
       JMenuItem Link5=new JMenuItem("LINK5");
      Shop.add(Link5); 
      Shop.setBackground(Color.red);
      Shop.addActionListener(this);
      
      JMenuItem Link6=new JMenuItem("LINK6");
      Shop.add(Link6); 
      Shop.setBackground(Color.red);
      Shop.addActionListener(this);
      
      
      
/*<==================================================================================================>*/
/*<==================================================================================================>*/
       //YOUTUBE ONLINE TUTORIALS FOR IOT
        JMenu Studyvideo = new JMenu("STUDY-MATERIAL");
        Studyvideo.setForeground(Color.BLACK);
        mb.add( Studyvideo);
        
          JMenuItem C1=new JMenuItem("CHANNEL1");
      Studyvideo.add(C1); 
      Studyvideo.setBackground(Color.RED);
       Studyvideo.addActionListener(this);
      
        JMenuItem C2=new JMenuItem("CHANNEL2");
      Studyvideo.add(C2); 
      Studyvideo.setBackground(Color.YELLOW);
      Studyvideo.addActionListener(this);
      
       JMenuItem C3=new JMenuItem("CHANNEL3");
      Studyvideo.add(C3); 
     Studyvideo.setBackground(Color.GREEN);
      Studyvideo.addActionListener(this);
         
       JMenuItem C4=new JMenuItem("CHANNEL4");
      Studyvideo.add(C4); 
       Studyvideo.setBackground(Color.BLUE);
      Studyvideo.addActionListener(this);
         
       JMenuItem C5=new JMenuItem("CHANNEL5");
      Studyvideo.add(C5); 
      Studyvideo.setBackground(Color.red);
      Studyvideo.addActionListener(this);
         
        
     /*<=============================================================================================>*/
     /*<=============================================================================================>*/
         
        JMenu Contact = new JMenu("CONTACT-US");
        Contact.setForeground(Color.BLUE);
        mb.add(Contact);
        
        
        JMenuItem Universitycon =new JMenuItem("University-Contact");
        Contact.add(Universitycon);
        Universitycon.setBackground(Color.GRAY);
        Universitycon.addActionListener(this);
         mb.add(Contact);
       
        JMenuItem Collegecon =new JMenuItem("College-Contact");
         Contact.add(Collegecon);
         Collegecon.addActionListener(this);
          mb.add(Contact);
       Collegecon.setBackground(Color.red);
       
       
        
        
        JMenu Notification = new JMenu("NOTIFICATION");
       Notification.setForeground(Color.BLUE);  
        mb.add(Notification);
       
        JMenuItem IotInfo =new JMenuItem("IOT-NOTIFICATION");
         Notification.add(IotInfo);
       IotInfo.setBackground(Color.PINK);
        
        
        
     JMenu StudentInfo = new JMenu("Student Profile");
      Notification.setForeground(Color.BLUE);
       mb.add(StudentInfo);
         NewInformation.add(Notification);
       
         JMenu ProjectLevel = new JMenu("teacher-profile");
       ProjectLevel.setForeground(Color.blue);
       NewInformation.add(ProjectLevel);
         
        
    JMenuItem ProjectInfo =new JMenuItem("UNIVERSITY-NOTIFICATION");
          ProjectInfo.addActionListener(this);
          Notification.add(ProjectInfo);
        ProjectInfo.setBackground(Color.WHITE);
        
        
        JMenuItem TeacherInfo = new JMenuItem("COLLEGE-NOTIFICATION");
         mb.add(TeacherInfo);
         Notification.add(TeacherInfo);
        ProjectInfo.setBackground(Color.WHITE);
        
        /*<=================================================================================================>*/
        /*<=================================================================================================>*/
         JMenu ProjectMaterial = new JMenu("IOT-PROJECT'S");
       ProjectMaterial.setForeground(Color.red);
       NewInformation.add(ProjectMaterial);
       
        JMenuItem Projectlevel =new JMenuItem("PROJECT-LEVEL");
         ProjectMaterial.add(Projectlevel);
       ProjectMaterial.setBackground(Color.green);
       
       
       JMenuItem basiclevel =new JMenuItem("basic-level");
         ProjectMaterial.add(basiclevel);
       ProjectMaterial.setBackground(Color.blue);
       
       JMenuItem meduimlevel =new JMenuItem("meduim-level");
         ProjectMaterial.add(meduimlevel);
       ProjectMaterial.setBackground(Color.PINK);
       
       JMenuItem Advancedlevel =new JMenuItem("Advanced-level");
         ProjectMaterial.add(Advancedlevel);
       ProjectMaterial.setBackground(Color.red);
       /*<=================================================================================================>*/
       /*<=================================================================================================>*/ 
       
        
        JMenuItem Projectupload = new JMenuItem("Student upload Project's");
       NewInformation.add(StudentInfo);
        Projectupload.setBackground(Color.BLUE);
        
          JMenuItem IOTPROJECTs=new JMenuItem("IOT PROJECTS");
      Servies.add(IOTPROJECTs); 
      Onlineshop.addActionListener(this);
       IOTPROJECTs.setBackground(Color.ORANGE);
        
        
         JMenu Tools = new JMenu("UTILITY");
        Tools.setBackground(Color.BLUE);
        mb.add(Tools);
        
        
          JMenuItem calc = new JMenuItem("Calculator");
              calc.addActionListener(this);
         Tools.add(calc); 
       calc.setBackground(Color.WHITE);
        
          JMenuItem notepad = new JMenuItem("NOTEPAD");
              notepad.addActionListener(this);
         Tools.add(notepad); 
        notepad.setBackground(Color.WHITE);
        
        
           JMenu Help = new JMenu("HELP");
      Help.setForeground(Color.BLUE);
        mb.add(Help);
         JMenuItem Instruction =new JMenuItem("Instruction");
         Help.add(Instruction);         
          mb.add(Help);
       Instruction.setBackground(Color.yellow);
        
        
       
        JMenu ex = new JMenu("EXIT");
        ex.setBackground(Color.blue);
        mb.add(ex);
        
         JMenuItem exit = new JMenuItem("EXIT");
       ex.addActionListener(this);
         ex.add(exit); 
       ex.setBackground(Color.GRAY); 
        setJMenuBar(mb);
        setVisible(true);
        
    }
    @Override
    @SuppressWarnings({"ConvertToStringSwitch", "ResultOfObjectAllocationIgnored"})
     public void actionPerformed(ActionEvent ae){
     String msg = ae.getActionCommand();
     if(msg.equals("Exit")){
         setVisible(false);
     }else if(msg.equals("Calculator")){
         try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(IOException e){
                    
                }
     }
    
         else if(msg.equals("Notepad")){
         try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(IOException e){
                    
                }
         }
         else if(msg.equals("University-Contact")){
                new AddStudent();
                }else if(msg.equals("College-Contact")){
                 new AddStudent();
     }
                
     if(msg.equals("LINK1")){
         setVisible(false);
         try{
                    Runtime.getRuntime().exec("d");
                }catch(IOException e){
                 }
         if(msg.equals("LINK2")){
         setVisible(false);
         try{
                    Runtime.getRuntime().exec("d1");
                }catch(IOException e){
                 }
          if(msg.equals("LINK3")){
         setVisible(false);
         try{
                    Runtime.getRuntime().exec("d2");
                }catch(IOException e){
                 }
          if(msg.equals("LINK4")){
         setVisible(false);
         try{
                    Runtime.getRuntime().exec("d3");
                }catch(IOException e){
                 }
          }
          if(msg.equals("LINK5")){
         setVisible(false);
         try{
                    Runtime.getRuntime().exec("d4");
                }catch(IOException e){
                 }
          }
          if(msg.equals("LINK6")){
         setVisible(false);
         try{
                    Runtime.getRuntime().exec("d5");
                }catch(IOException e){
                 }
          }
            if(msg.equals("LINK7")){
         setVisible(false);
         try{
                    Runtime.getRuntime().exec("d6");
                }catch(IOException e){
                 }
          }
          }
         }
     }
     }
     
    @SuppressWarnings("ResultOfObjectAllocationIgnored")  
      public static void main(String args[])throws Exception{
          
    Desktop d=Desktop.getDesktop();
    d.browse(new URI("http://www.Electronicscomp.com"));
   
   Desktop d1=Desktop.getDesktop();
   d1.browse(new URI("http://www.Ventor.co.in"));
   
   Desktop d2=Desktop.getDesktop();
   d2.browse(new URI("http://www.Element14.com"));
   
  
   Desktop d3=Desktop.getDesktop();
   d3.browse(new URI("http://www.Inkocean.in"));
     
   
   Desktop d4=Desktop.getDesktop();
     d4.browse(new URI("http://www.Robu.in"));
    
     Desktop d5=Desktop.getDesktop();
    d5.browse(new URI("http://www.Dnatechindia.com"));
    
    
    Desktop d6=Desktop.getDesktop();
    d6.browse(new URI("http://www.Potentiallabs.com"));
           Object p=new Object();
    new Project();
}    
    }
      
        // d.browse(new URI("http://www.Extremeelectronics.co.in"));
      // d.browse(new URI("http://www.Ventor.co.in"));
     // d.browse(new URI("http://www.Element14.com"));
      //d.browse(new URI("http://www.Inkocean.in"));
   // d.browse(new URI("http://www.Robu.in"));
    // d.browse(new URI("http://www.Dnatechindia.com"));
   // d.browse(new URI("http://www.Potentiallabs.com"));
       
       /* switch (msg) {
            case "Exit" -> setVisible(false);
            case "Calculator" -> {
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(IOException e){
                    
                }
            }
            case "Notepad" -> {
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                    
                }catch(IOException e){
                    
                }
            }
        } else if(msg.equals("University-Contact")){
                new AddStudent();
                }else if(msg.equals("COLLEGE-NOTIFICATION")){
                 new AddStudent();
                
                }
    
     }*/
     
 

//public class Project {
    
//}
   
