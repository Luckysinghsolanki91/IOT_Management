package iotproject.smangementforuniversity;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
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
        NewInformation.setForeground(Color.red);
        mb.add(NewInformation);
        
        JMenu details = new JMenu("ABOUT-US");
       details.setForeground(Color.BLACK);
        mb.add(details);
        
        
         JMenu Servies = new JMenu("SERVIES");
        Servies.setForeground(Color.red);
        mb.add(Servies);
        
        JMenu Contact = new JMenu("CONTACT-US");
        Servies.setForeground(Color.BLUE);
        mb.add(Contact);
        JMenuItem Universitycon =new JMenuItem("University-Contact");
         Contact.add(Universitycon);
          mb.add(Contact);
       Universitycon.setBackground(Color.GRAY);
        JMenuItem Collegecon =new JMenuItem("College-Contact");
         Contact.add(Collegecon);
          mb.add(Contact);
       Collegecon.setBackground(Color.red);
       
       
        
        
        JMenu Notification = new JMenu("NOTIFICATION");
       Notification.setForeground(Color.BLUE);
        mb.add(Notification);
        JMenuItem IotInfo =new JMenuItem("IOT-NOTIFICATION");
         Notification.add(IotInfo);
       IotInfo.setBackground(Color.BLUE);
        
        
        JMenu Help = new JMenu("Help");
      Help.setForeground(Color.BLUE);
        mb.add(Help);
         JMenuItem Instruction =new JMenuItem("Instruction");
         Help.add(Instruction);
          mb.add(Help);
       Instruction.setBackground(Color.yellow);
        
        /*JMenuItem Studentpro =new JMenuItem("Student Profile");
      mb.add(Notification);
        Studentpro.setBackground(Color.GREEN);*/
        
         JMenu StudentInfo = new JMenu("Student Profile");
      Notification.setForeground(Color.BLUE);
       mb.add(StudentInfo);
         NewInformation.add(Notification);
         
         //JMenuItem IotInfo =new JMenuItem("IOT-NOTIFICATION");
         //Notification.add(IotInfo);
       //IotInfo.setBackground(Color.BLUE);
         
        JMenuItem ProjectInfo =new JMenuItem("UNIVERSITY-NOTIFICATION");
         Notification.add(ProjectInfo);
        ProjectInfo.setBackground(Color.WHITE);
        
       /* JMenuItem StudentSInfo =new JMenuItem("CONTACT-US");
         mb.add(StudentSInfo );
         Notification.add(ProjectInfo);
     ProjectInfo.setBackground(Color.PINK);
         */
        
        
        
        JMenuItem TeacherInfo = new JMenuItem("COLLEGE-NOTIFICATION");
         mb.add(TeacherInfo);
         Notification.add(TeacherInfo);
        ProjectInfo.setBackground(Color.WHITE);
        
        
         JMenu ProjectMaterial = new JMenu("Project-Material");
       ProjectMaterial.setForeground(Color.red);
        ProjectMaterial.add(ProjectMaterial);
        
        JMenuItem Projectupload = new JMenuItem("Student upload Project's");
       Projectupload.add(StudentInfo);
        Projectupload.setBackground(Color.BLUE);
        
          JMenuItem IOTPROJECTs=new JMenuItem("IOT PROJECTS");
      NewInformation.add(IOTPROJECTs); 
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
       
       
       
       
        JMenu ex = new JMenu("Exit");
        ex.setBackground(Color.blue);
        mb.add(ex);
        
         JMenuItem exit = new JMenuItem("EXIT");
       exit.addActionListener(this);
         ex.add(exit); 
       ex.setBackground(Color.GRAY);
        setJMenuBar(mb);
        setVisible(true);
        
    }
    @Override
     public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        switch (msg) {
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
            default -> {
            }
        }
    
     }
    public static void main(String args[]){
    new Project();
}    
   
    }
 
