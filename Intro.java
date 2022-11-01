package iotprojectmanagementforuniversity;
import javax.swing.*;
import java.awt.*;
public class Intro extends JFrame implements Runnable{
    Thread t;
    @SuppressWarnings({"ResultOfObjectAllocationIgnored", "CallToThreadStartDuringObjectConstruction"})
    Intro(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Home.jpg.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
       ImageIcon i3 = new  ImageIcon(i2); 
       JLabel image = new JLabel(i3);
        add(image);
        t=new Thread(this);
        t.start();
        setVisible(true);
       // int x=1;
      // for(int i=2;i<=600;i+=4,x+=1){
        setLocation(50,20);
        setSize(1366,768);
           // setLocation(600 -((i+x)/2),350-(i/2));
        //setSize(i+3*x,i+x/2);
        try{
            Thread.sleep(10);
            setVisible(true);
            //Next Frame
            //now we create a Login page object for show a Loginpage
         new Loginpage();
        }catch(InterruptedException e){}
            //new Loginpage();
        }

     // new Loginnpage();
    
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String[] args){
    new Intro();
        
}    

 


    @Override
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public  void run() {
         try {
            Thread.sleep(2000);
            setVisible(false);
        } 
        catch(InterruptedException e){

        }
     
    }
    }
//public class Intro {
  //  }
