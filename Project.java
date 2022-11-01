package iotprojectmanagementforuniversity;

import java.awt.Color;
import java.awt.Desktop;
//import java.awt.Desktop;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.net.URI;
//import java.net.URI;
//import java.awt.Desktop;
//import java.net.URI;


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
        
        
       /*  JMenuItem ProjectOwners=new JMenuItem("Project Created By");
      details.add(ProjectOwners); 
      details.setBackground(Color.RED);
      details.addActionListener(this);*/
        
        
         JMenu Developerinfo = new JMenu("DEVELOPER-INFO");
       Developerinfo.setForeground(Color.BLUE);
        mb.add(Developerinfo);
        
        
         JMenuItem ProjectOwners=new JMenuItem("Project Created By");
      Developerinfo.add(ProjectOwners); 
      Developerinfo.setBackground(Color.RED);
      ProjectOwners.addActionListener(this);
        
        
        
        
         JMenu Servies = new JMenu("SERVIES");
        Servies.setForeground(Color.BLACK);
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
       //  Shop.addActionListener(this);
        mb.add(Shop);
        
         JMenuItem S1=new JMenuItem("IOT-PROJECT-COMPONTENTS");
      Shop.add(S1); 
      Shop.setBackground(Color.RED);
      S1.addActionListener(this);
      
      
      /*JMenuItem basiclevel =new JMenuItem("basic-level");
         ProjectMaterial.add(basiclevel);
         basiclevel.addActionListener(this);
       ProjectMaterial.setBackground(Color.blue);*/
      
      
        /*JMenuItem Link2=new JMenuItem("LINK2");
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
      */
      
      
/*<==================================================================================================>*/
/*<==================================================================================================>*/
       //YOUTUBE ONLINE TUTORIALS FOR IOT
        JMenu Studyvideo = new JMenu("STUDY-MATERIAL");
        Studyvideo.setForeground(Color.BLACK);
        mb.add( Studyvideo);
        
        JMenuItem Websitelinks=new JMenuItem("Website-Page's");
      Studyvideo.add(Websitelinks); 
      Studyvideo.setBackground(Color.RED);
      Websitelinks.addActionListener(this);
       
       /* JMenuItem Websitestudy=new JMenuItem("Website-study");
      Studyvideo.add(Websitestudy); 
      Websitestudy.setBackground(Color.RED);
      Websitestudy.addActionListener(this);*/
        
      
      /* JMenu Studylink = new JMenu("STUDY-LINK");
        Studylink.setForeground(Color.BLACK);
        Studyvideo .add( Studyvideo);
 
        JMenuItem Websitestudyleft=new JMenuItem("Website-Links");
      Studyvideo.add(Websitestudy); 
      Websitestudyleft.setBackground(Color.RED);
      Websitestudyleft.addActionListener(this);*/
      
       
         JButton Link1 = new JButton("LINK1");
         Link1.setForeground(Color.BLUE);
         Link1.addActionListener(this);
         Studyvideo.add( Link1);
          
          JButton Link2 = new JButton("LINK2");
          Link2.setForeground(Color.BLUE);
          Link2.addActionListener(this);
         Studyvideo.add( Link2);
         
          JButton Link3 = new JButton("LINK3");
          Link3.setForeground(Color.BLUE);
          Link3.addActionListener(this);
         Studyvideo.add( Link3);
          
          JButton Link4 = new JButton("LINK4");
          Link4.setForeground(Color.BLUE);
          Link4.addActionListener(this);
         Studyvideo.add( Link4);
         
         JButton Link5 = new JButton("LINK5");
          Link5.setForeground(Color.BLUE);
          Link5.addActionListener(this);
         Studyvideo.add( Link5);
          
         JButton Link6 = new JButton("LINK6");
          Link6.setForeground(Color.BLUE);
          Link6.addActionListener(this);
         Studyvideo.add( Link6);
        
         JButton Link7 = new JButton("LINK7");
          Link7.setForeground(Color.BLUE);
          Link7.addActionListener(this);
         Studyvideo.add( Link7);
         
       /*  JMenuItem Channellink=new JMenuItem("Channel-link's");
      Studyvideo.add(Channellink); 
      Studyvideo.setBackground(Color.RED);
      Channellink.addActionListener(this);
         */
//<================================================================================================================================>         
          JMenu videostudymaterial = new JMenu("VIDEO-STUDY-MATERIAL");
        videostudymaterial.setForeground(Color.BLACK);
        mb.add( videostudymaterial);
        
        JMenuItem Channellink=new JMenuItem("Channel-link's");
        videostudymaterial.add(Channellink); 
        videostudymaterial.setBackground(Color.RED);
       Channellink.addActionListener(this);
         
      
      JButton CHANNEL1 = new JButton("CHANNEL-1");
         CHANNEL1.setForeground(Color.BLUE);
         CHANNEL1.addActionListener(this);
        videostudymaterial.add( CHANNEL1);
         //videostudymaterial.add( CHANNEL1);
          
          JButton CHANNEL2 = new JButton("CHANNEL-2");
          CHANNEL2.setForeground(Color.BLUE);
          CHANNEL2.addActionListener(this);
          videostudymaterial.add(CHANNEL2);
         
          JButton CHANNEL3 = new JButton("CHANNEL-3");
          CHANNEL3.setForeground(Color.BLUE);
          CHANNEL3.addActionListener(this);
         videostudymaterial.add( CHANNEL3);
          
          JButton CHANNEL4 = new JButton("CHANNEL-4");
          CHANNEL4.setForeground(Color.BLUE);
          CHANNEL4.addActionListener(this);
         videostudymaterial.add( CHANNEL4);
         
         JButton CHANNEL5 = new JButton("CHANNEL-5");
          CHANNEL5.setForeground(Color.BLUE);
          CHANNEL5.addActionListener(this);
         videostudymaterial.add( CHANNEL5);
          
         JButton CHANNEL6 = new JButton("CHANNEL-6");
          CHANNEL6.setForeground(Color.BLUE);
          CHANNEL6.addActionListener(this);
         videostudymaterial.add( CHANNEL6);
        
         JButton CHANNEL7 = new JButton("CHANNEL-7");
          CHANNEL7.setForeground(Color.BLUE);
          CHANNEL7.addActionListener(this);
         videostudymaterial.add( CHANNEL7);   
     
      
         
         
         
         
       /*JMenuItem Cl=new JMenuItem("CHANNEL1");
      Studyvideo.add(Cl); 
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
      Studyvideo.addActionListener(this);*/
         
        
     /*<=============================================================================================>*/
    
     
       /*<=============================================================================================>*/
         /*<=============================================================================================>*/
     
      JMenu QuizLogin = new JMenu("STUDY-QUIZ");
         QuizLogin.setForeground(Color.BLUE);
        mb.add(QuizLogin);
        
      /*JMenuItem Quizbasiclevel =new JMenuItem("Beginnerlevel");
        QuizLogin.add(Quizbasiclevel);
        QuizLogin.setBackground(Color.blue);
        Quizbasiclevel.addActionListener(this);*/
      
       JMenuItem Quizbasiclevel =new JMenuItem("Beginnerlevel");
        QuizLogin.add(Quizbasiclevel);
        QuizLogin.setBackground(Color.blue);
        Quizbasiclevel.addActionListener(this);  
      
      
        /*<=============================================================================================>*/
         /*<=============================================================================================>*/
        
          JMenu Attendence = new JMenu("ATTENDENCE-INFO");
        Attendence.setForeground(Color.BLACK);
        mb.add(Attendence);
        
      JMenuItem StudentAttendence =new JMenuItem("Student-Attendence");
        Attendence.add(StudentAttendence);
        Attendence.setBackground(Color.blue);
       StudentAttendence.addActionListener(this);
        
        
        
        
        
        
        
        
        //mb.add(QuizLogin);
         
        
        
       // JMenuItem calc = new JMenuItem("Calculator");
         //     calc.addActionListener(this);
         //Tools.add(calc); 
       //calc.setBackground(Color.WHITE);
        
        
        
         JMenuItem QuizIntermidatelevel =new JMenuItem("Intermmidate-level");
        QuizLogin.add(QuizIntermidatelevel);
        QuizLogin .setBackground(Color.RED);
        QuizLogin.addActionListener(this);
        
         JMenuItem QuizAdvancedlevel =new JMenuItem("Advanced-level");
        QuizLogin.add(QuizAdvancedlevel);
        QuizLogin.setBackground(Color.GREEN);
        QuizLogin.addActionListener(this);
     
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
         
         JMenuItem AddStudent =new JMenuItem("Add-New-Student");
       // ProjectLevel.add( Quizbasiclevel);
       StudentInfo.add(AddStudent);
        AddStudent.setBackground(Color.red);
       // Quizbasiclevel.addActionListener(this);
         AddStudent.addActionListener(this);
         
       
         JMenu ProjectLevel = new JMenu("teacher-profile");
       ProjectLevel.setForeground(Color.blue);
       NewInformation.add(ProjectLevel);
       
        JMenuItem AddTeacher =new JMenuItem("Add-New-Teacher");
       // ProjectLevel.add( Quizbasiclevel);
       ProjectLevel.add(AddTeacher);
        AddTeacher.setBackground(Color.blue);
       // Quizbasiclevel.addActionListener(this);
         AddTeacher.addActionListener(this);
       
      
         
        
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
         basiclevel.addActionListener(this);
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
       
        JMenuItem explorer = new JMenuItem("FileSystem");
              explorer.addActionListener(this);
         Tools.add(explorer); 
       explorer.setBackground(Color.WHITE);
        
        JMenuItem notepad = new JMenuItem("notepad");
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
       exit.addActionListener(this);
         ex.add(exit); 
       exit.setBackground(Color.cyan); 
        setJMenuBar(mb);
        setVisible(true);
       
    }
    @Override
    @SuppressWarnings({"ConvertToStringSwitch", "ResultOfObjectAllocationIgnored", "CallToPrintStackTrace"})
     public void actionPerformed(ActionEvent ae){
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);setLocationRelativeTo(null);
     String msg = ae.getActionCommand();
     if(msg.equals("Beginnerlevel")){
              // Runtime.getRuntime().exec("calc.exe");
            //new Quizloginpage1().setVisible(true);
           // new NewQuizSecondFrame("User");
           new NewQuizlogin();
     }
     
     if(msg.equals("Add-New-Teacher")){
              // Runtime.getRuntime().exec("calc.exe");
           // new Quizloginpage1().setVisible(true);
           // new AddTeacher().setVisible(true);
             new AddTeacher1().setVisible(true);
     }
     
     if(msg.equals("Add-New-Student")){
              // Runtime.getRuntime().exec("calc.exe");
           // new Quizloginpage1().setVisible(true);
            new AddStudent().setVisible(true);
     }
     
     if(msg.equals("basic-level")){
            new Openpdfview().setVisible(true);
     }
     
      if(msg.equals("Student-Attendence")){
            new Quizloginpage1().setVisible(true);
     }
     
     
      if(msg.equals("IOT-PROJECT-COMPONTENTS")){
            new ElectronIcEquiloginpage().setVisible(true);
     }
      
      
      
      if(msg.equals("LINK1")){
     Desktop link1=Desktop.getDesktop();
        try {
            link1.browse(new URI("https://1000projects.org"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
      
      if(msg.equals("LINK2")){
     Desktop link2=Desktop.getDesktop();
        try {
            link2.browse(new URI("https://www.naukri.com/learning/articles/best-online-resources-to-learn-iot-internet-of-things/"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
      
      if(msg.equals("LINK3")){
     Desktop link3=Desktop.getDesktop();
        try {
            link3.browse(new URI("https://www.simplilearn.com/internet-of-things-iot-projects-article"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
      
      if(msg.equals("LINK4")){
     Desktop link4=Desktop.getDesktop();
        try {
            link4.browse(new URI("https://theiotprojects.com/top-10-iot-internet-of-things-projects/"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
      
      
       if(msg.equals("LINK5")){
     Desktop link5=Desktop.getDesktop();
        try {
            link5.browse(new URI("https://nevonprojects.com/iot-projects/"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
      
       if(msg.equals("LINK6")){
     Desktop link6=Desktop.getDesktop();
        try {
            link6.browse(new URI("https://www.pantechsolutions.net/iot-projects-for-engineering-students"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
      
       if(msg.equals("LINK7")){
     Desktop link7=Desktop.getDesktop();
        try {
            link7.browse(new URI("https://www.upgrad.com/blog/iot-project-ideas-topics-for-beginners/"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
      
      //for channels
      
       if(msg.equals("CHANNEL-1")){
     Desktop channel1=Desktop.getDesktop();
        try {
            channel1.browse(new URI("https://1000projects.org"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
       
         if(msg.equals("CHANNEL-2")){
     Desktop channel2=Desktop.getDesktop();
        try {
            channel2.browse(new URI("https://1000projects.org"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
         
      if(msg.equals("CHANNEL-3")){
     Desktop channel3=Desktop.getDesktop();
        try {
            channel3.browse(new URI("https://1000projects.org"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
        if(msg.equals("CHANNEL-4")){
     Desktop channel4=Desktop.getDesktop();
        try {
            channel4.browse(new URI("https://1000projects.org"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
       
          if(msg.equals("CHANNEL-5")){
     Desktop channel5=Desktop.getDesktop();
        try {
            channel5.browse(new URI("https://1000projects.org"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
      
            if(msg.equals("CHANNEL-6")){
     Desktop channel6=Desktop.getDesktop();
        try {
            channel6.browse(new URI("https://1000projects.org"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
      
        if(msg.equals("CHANNEL-7")){
     Desktop channel7=Desktop.getDesktop();
        try {
            channel7.browse(new URI("https://1000projects.org"));
           // new  Googlepage();
        } catch (URISyntaxException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElectronIcEquiSignuppage.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
      
      
      
      
      
      
      
      
      /*if(msg.equals("")){
            new ElectronIcEquiloginpage().setVisible(true);
     }*?
     
     
    //if(msg.equals("Exit")){
        //setVisible(false);
      //  System.exit(0);
    //}
     else if(msg.equals("EXIT")){
         setVisible(false);
           
          //System.exit(0);
         // Runtime.getRuntime().exec("explorer.exe");
     }
     
    if(msg.equals("CHANNEL1")){
         //setVisible(false);
          new Channel1(); 
          //System.exit(0);
         // Runtime.getRuntime().exec("explorer.exe");
     }
     
     
     
   
   else if(msg.equals("FileSystem")){
         try{
                   Runtime.getRuntime().exec("explorer.exe");
                }catch(IOException e){
                    
                }  
     }
   
   
   
   
   
   
   
    else if(msg.equals("Calculator")){
         try{
                   Runtime.getRuntime().exec("calc.exe");
                }catch(IOException e){
                    
                }   //explorer.exe
     } 
    
         else if(msg.equals("Notepad")){
         try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(IOException e){
                    
                }
         }
         /*else if(msg.equals("University-Contact")){
                new AddStudent();
                }else if(msg.equals("College-Contact")){
                 new AddStudent();
     }
    */
    if(msg.equals("CHANNEL1")){
         setVisible(false);
         try{
                    Runtime.getRuntime().exec("d");
                }catch(IOException e){
                 }
         if(msg.equals("CHANNEL2")){
         setVisible(false);
         try{
                    Runtime.getRuntime    ().exec("d1");
                }catch(IOException e){
                 }
          if(msg.equals("CHANNEL3")){
         setVisible(false);
         try{
                    Runtime.getRuntime().exec("d2");
                }catch(IOException e){
                 }
          if(msg.equals("CHANNEL4")){
         setVisible(false);
         try{
                    Runtime.getRuntime().exec("d3");
                }catch(IOException e){
                 }
          }
          if(msg.equals("CHANNEL5")){
         setVisible(false);
         try{
                    Runtime.getRuntime().exec("d4");
                }catch(IOException e){
                 }
          }
          if(msg.equals("CHANNEL16")){
         setVisible(false);
         try{
                    Runtime.getRuntime().exec("d5");
                }catch(IOException e){
                 }
          }
            if(msg.equals("CHANNEL17")){
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
      
          /*Desktop d=Desktop.getDesktop();
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
    */
   new Project();
      }    

    }
      
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
   
