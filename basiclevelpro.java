package iotprojectmanagementforuniversity;
//import java.util.*;
//import java.awt.Image;
//import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
//import javax.swing.JLabel;
public class basiclevelpro  extends JFrame{

    basiclevelpro(){
        setSize(1118,700);
         setLocation(150,20);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
         JLabel heading=new JLabel("WELCOME TO IOT-BASIC LEVEL PROJECT TEXT DOCUMENTATION");
         //WIDTH, WIDTH, WIDTH, HEIGHT
        heading.setBounds(180, 30, 1000, 30);
       // heading.setText("=========================================");
        heading.setFont(new Font("serif",Font.TRUETYPE_FONT,30));
        add(heading);
        heading.setForeground(Color.blue);
        
        
    // ImageIcon i1;
        //i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
       //Image i2 = i1.getImage().getScaledInstance(1118,700,Image.SCALE_DEFAULT);
       //ImageIcon i3 = new  ImageIcon(i2); 
      // JLabel image = new JLabel(i3);
     //   add(image);
}
    
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
 public static void main(String[] args){
    new basiclevelpro();
}
}