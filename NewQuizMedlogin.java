/*package com.iotprojectmanagmentforuniversity;

public class NewQuizMedlogin {

}
*/
package com.iotprojectmanagmentforuniversity;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewQuizMedlogin extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton rules,cancel;
    JTextField tfname;
    NewQuizMedlogin(){
        // setSize(1366,768);
        setVisible(true);
   // setVisible(true);
    setSize(1200,500);
    setLocation(80,150);
 getContentPane().setBackground(Color.WHITE);
 setLayout(null);
 /*ImageIcon i2;
        i2 = new ImageIcon(ClassLoader.getSystemResource("icons/Userlogin.png"));
       Image i3= i2.getImage().getScaledInstance(1200,500,Image.SCALE_DEFAULT);
       ImageIcon i4 = new  ImageIcon(i3); 
       JLabel image = new JLabel(i4);*/
    // ImageIcon.setBounds(10,10,600,700);//10,10,600,700
      //ImageIcon.setBorder(0x12);
      // add(ImageIcon);
 setContentPane(new JLabel(new ImageIcon("C:\\Users\\Hp\\Pictures\\Userlogin.png")));
        
        
        JLabel Topheading = new JLabel("--:QUIZ-LOGINPAGE:--");
           Topheading .setBounds(450, -10, 530, 60);
           Topheading .setFont(new Font("Monospaced",Font.BOLD,32));
           Topheading .setForeground(Color.BLACK);
         add(Topheading );
        
        
         JLabel heading = new JLabel("IOT QUESTION QUIZ");
         heading.setBounds(650, 60, 500, 45);
         heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
         heading.setForeground(Color.BLUE);
         add(heading);
         
         
         JLabel Username = new JLabel("Enter your name:-");
          Username.setBounds(750,250, 230, 20);
          Username.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
          Username.setForeground(Color.BLACK);
         add( Username);
         
          tfname=new JTextField();
         tfname.setBounds(1000, 250, 150, 25);
          tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
         add(tfname);
         
        JLabel UserPassword = new JLabel("Enter your Password:-");
          UserPassword.setBounds(750, 350, 230, 20);
          UserPassword.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
          UserPassword.setForeground(Color.BLACK);
         add(UserPassword);
         
         JTextField tfpassword=new JTextField();
         tfpassword.setBounds(1000, 350, 150, 25);
          tfpassword.setFont(new Font("Times New Roman",Font.BOLD,20));
         add(tfpassword);
         
          //tfpassword= new JPasswordField("");
        //  tfpassword.setBounds(950,350,150,25);
        //tfpassword.setFont(new Font("Times New Roman",Font.BOLD,20));
       //add(tfpassword);
       
       JButton login=new JButton("Login");
       login.setBackground(Color.blue);
        login.setForeground(Color.WHITE);
       login.setBounds(750, 450, 150, 50);
       add(login);
        cancel=new JButton("Cancel");
       cancel.setBackground(Color.blue);
        cancel.setForeground(Color.WHITE);
       cancel.setBounds(950, 450, 150, 50);
        cancel.addActionListener(this);
       add(cancel);
       
       rules=new JButton("Rules");
       rules.setBackground(Color.red);
       rules.setForeground(Color.WHITE);
       rules.setBounds(1150, 50, 110, 50);
       rules.addActionListener(this);
       add(rules);
       
}
    public static void main(String args[]){
       new NewQuizMedlogin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rules){
            setVisible(false);
         // new NewQuizSecondFrame(name);
           // new NewQuizSecondFrame("User");
            new NewQuizMedSecondFrame("User");
           // new OpenquizMeduimpage();
        }else if(e.getSource()==cancel){
            setVisible(false);
            
        }
  
    }
}