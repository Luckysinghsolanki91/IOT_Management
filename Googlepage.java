package iotprojectmanagementforuniversity;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.Image;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import javax.swing.JLabel;

public class Googlepage extends JFrame implements ActionListener{
    
Googlepage(){
    
   setSize(1366,768);
        setVisible(true);
    
}


@SuppressWarnings("ResultOfObjectAllocationIgnored")
public static void main(String args[]) throws URISyntaxException, IOException{
    Desktop d=Desktop.getDesktop();
    d.browse(new URI("http://www.google.com"));
    new Googlepage();
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
