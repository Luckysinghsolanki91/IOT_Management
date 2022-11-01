package iotprojectmanagementforuniversity;

import java.awt.Color;
import java.awt.Font;
//import java.awt.Image;
//import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JTextField;

public class QuizQuestionFrame extends JFrame implements ActionListener{
    QuizQuestionFrame(String name){
        setVisible(true);
        setBounds(20,0,1300,850);
        getContentPane().setBackground(Color.white);
        
       /*ImageIcon  i2 = new ImageIcon(ClassLoader.getSystemResource("icons/Userlogin.png"));
       Image i3= i2.getImage().getScaledInstance(1300,150,Image.SCALE_REPLICATE);
       ImageIcon i4 = new  ImageIcon(i3); 
       JLabel image = new JLabel(i4);
      image.setBounds(0, 0,700, 0);
      //image.setBorder(0x12);
        add(image);*/
        
        /*ImageIcon  i2 = new ImageIcon(ClassLoader.getSystemResource("icons/Userlogin.png"));
      // Image i3= i2.getImage().getScaledInstance(1300,150,Image.SCALE_REPLICATE);
       //ImageIcon i4 = new  ImageIcon(i3); 
       JLabel image = new JLabel(i2);
      image.setBounds(0, 0,1386, 380);
      //image.setBorder(0x12);
        add(image);
      */
        /*JLabel qno = new JLabel("1)..");   
        qno.setBounds(350, 450, 500, 30);
        qno.setFont(new Font("MONOSPACED",Font.BOLD,24));
        add(qno);
        
         JLabel question = new JLabel("the question is follow ");
        question.setBounds(750, 550, 500, 30);
        question.setFont(new Font("MONOSPACED",Font.BOLD,24));
        add(question);
        */
        
        JLabel qno = new JLabel("");
        qno.setBounds(350, 450, 500, 30);
        qno.setFont(new Font("MONOSPACED",Font.BOLD,24));
        qno.setText("1)..");
        add(qno);
        
         JLabel question = new JLabel("");
        question.setBounds(750, 550, 500, 30);
        question.setFont(new Font("MONOSPACED",Font.BOLD,24));
       question.setText(
       
          "<html>"+"1. Your questions is started from hrer..."+"<br></br>"
          +"&nbsp;"
                  +"</html>"
              );
        add(question);
        
        
        
        JLabel qno2 = new JLabel("");
        qno2.setBounds(450, 550, 500, 30);
        qno2.setFont(new Font("MONOSPACED",Font.BOLD,24));
        qno2.setText("");
        add(qno2);
        
         JLabel question2 = new JLabel("");
        question2.setBounds(850, 750, 500, 30);
        question2.setFont(new Font("MONOSPACED",Font.BOLD,24));
       question2.setText(
       
          "<html>"+"1). Your questions is started from hrer..."+"<br></br>"
          +"</html>"
              );
        add(question2);
        
        
        /* JLabel qno3 = new JLabel("");
        qno3.setBounds(550, 650, 500, 30);
        qno3.setFont(new Font("MONOSPACED",Font.BOLD,24));
        add(qno3);
        
         JLabel question3 = new JLabel("");
        question3.setBounds(950, 850, 500, 30);
        question3.setFont(new Font("MONOSPACED",Font.BOLD,24));
       question3.setText(
       
          "<html>"+"3). Your questions is started from hrer..."+"<br></br>"
          +"</html>"
              );
        add(question3);*/
    }
 
    
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String args[]){
    new QuizQuestionFrame("user");
}    

    @Override
    public void actionPerformed(ActionEvent e) {
 
        
        
    }
}
