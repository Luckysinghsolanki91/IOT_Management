package iotprojectmanagementforuniversity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import javax.swing.JTextField;

public class NewQuizSecondFrame extends JFrame implements ActionListener{

    String name;
     JTextField tfname;
  JButton next,Previous;
    private Object msg;
    NewQuizSecondFrame(String name){
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        this.name=name;
        
        JLabel heading = new JLabel("WELCOME"+"-"+name+"-"+"TO"+"-"+"IOT"+"-"+"BASIC"+"-"+"LEVEL"+"-"+"QUIZ");
         heading.setBounds(90, 30, 1000, 50);
         heading.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
         heading.setForeground(Color.BLUE);
         add(heading);
         
         JLabel rules= new JLabel("");  
        rules.setBounds(20, 90, 700, 350);
         rules.setFont(new Font("Times New Roman",Font.PLAIN,16));
         rules.setForeground(Color.BLACK);
         rules.setText(
         "<html>"+"1. YOU ARE TRAINED TO BE IOT PROJECT PROGRAMMER AND NOT A STORY TELLER, ANSWER POINT TO..."+"<br></br>"
                 +"2. DO NOT UNNECESSARILY SMILE AT THE PERSON SITTING NEXT TO YOU.THEY MAY ALSO NOT KNOW THE ANSWER..."+"<br></br>"
                 +"3. YOU MAY HAVE LOT OF OPTIONS IN LIFE BUT HERE ALL THE QUESTIONS ARE COMPULSORY"+"<br></br>"
                 +"4. CRYING IS ALLOWED BUT PLEASE DO TO QUITELY..."+"<br></br>"     
                 +"5. ONLY A FOOL ASK AND A WISE ANSWER(BE WISE, NOT OTHERWISE)..."+"<br></br>"
                 +"6. DO NOT GET NERVIOUS IF YOUR FRIEND IS ANSWERING MORE QUESTION,MAY BE HE/SHE IS DOING JAI MATA DI... "+"<br></br>"
                 +"7. BRACE YOURSELF,THIS PAPER IS NOT FOR THE FAINT HEARTED..."+"<br></br>"
                 +"8. MAY YOU KNOW MORE THAN WHAT HJOM SNOW KNOWS,GOOD LUCK..."+"<br></br>"
          +"</html>"
         );
         
         add(rules);
         
        @SuppressWarnings("LocalVariableHidesMemberVariable")
         JButton next=new JButton("Next");
       next.setBackground(Color.blue);
        next.setForeground(Color.WHITE);
         next.addActionListener(this);
       next.setBounds(750, 450, 150, 50);
       add(next);
       
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        JButton Previous=new JButton("Previous");
       Previous.setBackground(Color.red);
        Previous.setForeground(Color.WHITE);
        Previous.addActionListener(this);
       Previous.setBounds(550, 450, 150, 50);
       add(Previous);
       
       
    }

    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String args[]){
     new NewQuizSecondFrame("User");
}    

    @Override
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public void actionPerformed(ActionEvent be) {
   /* if(be.getSource()==next){
           @SuppressWarnings("LocalVariableHidesMemberVariable")
           String name=next.getText();
            new QuizQuestionFrame(name);
          setVisible(false);
         // new NewQuizlogin();
          new QuizQuestionFrame(name);
        }*/
    
   
   
   
   //for Bttoun
   /*if(be.getSource()==next){
            setVisible(true);
             //new QuizQuestionFrame(name);
            // new Openpdfview().setVisible(true);
            //new IOTQuizQuestionpage().setVisible(true);
            
        }else {
            //setVisible(false);
            //new NewQuizlogin();
             new IOTQuizQuestionpage().setVisible(true);
            
        }
   
         if(be.getSource()==Previous){
            setVisible(true);
             //new QuizQuestionFrame(name);
            // new Openpdfview().setVisible(true);
           // new IOTQuizQuestionpage().setVisible(true);
            
        }else {
            //setVisible(false);
            new NewQuizlogin();
            //System.exit(0);
        } 
   
   
   &/ 
    
    //for Jlabel
    
    
    
   /* if(msg.equals("Next")){
            //new Openpdfview().setVisible(true);
            //new QuizQuestionFrame(name);
          new IOTQuizQuestionpage().setVisible(true);
            
     }
      if(msg.equals("Previous")){
            //new Openpdfview().setVisible(true);
            //new QuizQuestionFrame(name);
             new NewQuizlogin();
            
     }
    */
    
    
    
    
     /*if(be.getSource()==next){
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            String name=tfname.getText();
            setVisible(false);
           new QuizQuestionFrame(name);
          
            //new NewQuizlogin();
        }
     else if(be.getSource()==Previous){
        // new QuizQuestionFrame(name);
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        String name=tfname.getText();
        setVisible(false);
         new NewQuizlogin();
        }*/
        }
    }



/*public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
           new NewQuizSecondFrame(name);
        }else if(e.getSource()==cancel){
            setVisible(false);
            
        }
  */