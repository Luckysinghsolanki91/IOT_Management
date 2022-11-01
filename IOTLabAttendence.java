package iotprojectmanagementforuniversity;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IOTLabAttendence extends JFrame {

   // private final JLabel jLabel1;
    private final JLabel jLabel2;
    private final JTextField jTextField2;
IOTLabAttendence(){
           setSize(1118,700);
          setLocation(150,20);
          setVisible(true); 
          getContentPane().setBackground(Color.WHITE);
          setLayout(null);
        
        //jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        
}    
@SuppressWarnings("ResultOfObjectAllocationIgnored")
public static void main(String[] args){
    new IOTLabAttendence();
}
}