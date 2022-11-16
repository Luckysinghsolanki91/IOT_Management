package com.iotprojectmanagmentforuniversity;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;

/*public class Introduction extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;
	JLabel L1;
	Thread t;
	public Introduction() {
		setSize(1366,768);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Hp\\Pictures\\Home.jpg")));
		setLayout(new FlowLayout());
		L1=new JLabel();
		add(L1);
		setSize(1366,768);
		setVisible(true);
		//t=new Thread(this);
		//t.start();
		setVisible(true);
	    setLocation(1366,766);
			try {
				Thread.sleep(10);
				setVisible(true);
				new Loginpage();
			}catch(InterruptedException e) {
				
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  new Introduction();
  }

	@Override
	public void run() {
		 try {
	            Thread.sleep(2000);
	            setVisible(false);
	        } 
	        catch(InterruptedException e){
	        
	        }
	}

}
*/
//import javax.swing.*;
//import java.awt.*;
public class Introduction extends JFrame implements Runnable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Thread t;
    @SuppressWarnings({})
    Introduction(){
    	setSize(1366,768);
    	setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//setLocation(1376,768);
		setLocation(0,0);
		
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Hp\\Pictures\\Home.jpg")));
		setLayout(new FlowLayout());
		JLabel L1 = new JLabel();
		add(L1);
		/* ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Home.jpg.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
       ImageIcon i3 = new  ImageIcon(i2); 
       JLabel image = new JLabel(i3);
        add(image);*/
    	//setContentPane(new JLabel(new ImageIcon("C:\\Users\\Hp\\Pictures\\Home.jpg")));
        t=new Thread(this);
        t.start();
        setVisible(true);
      // int x=1;
      //for(int i=2;i<=600;i+=4,x+=1){
       // setLocation(50,20);
        //setSize(1366,768);
        // setLocation(600 -((i+x)/2),350-(i/2));
        //setSize(i+3*x,i+x/2);
        try{
            Thread.sleep(10);
            setVisible(true);
            //Next Frame
            //now we create a Login page object for show a Loginpage
        // new Loginpage();
            new Loginpage().setVisible(true);
        }catch(InterruptedException e){}
        
        }    
    public static void main(String[] args){
    new Introduction();
        
}    
@Override
    public  void run() {
         try {
            Thread.sleep(2000);
            setVisible(false);
        } 
        catch(InterruptedException e){

        }
     
    }
    }
