package iotprojectmanagementforuniversity;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
public class Shoping extends JFrame implements ActionListener {
    
    Shoping(){
        
        JMenu Shop = new JMenu("SHOPING");
        Shop.setForeground(Color.BLUE);
         Shop.addActionListener(this);
       
        
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
         
    }
    public static void main() throws Exception{
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
           
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
    }
    
}
