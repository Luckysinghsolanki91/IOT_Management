package iotprojectmanagementforuniversity;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;

public class Browser  extends JFrame{

    private final JButton add;
    public Browser(){
          add=new JButton("add");
            add.setBounds(780,90,100,30);
            add.setBackground(Color.gray);
            add.setForeground(Color.white);
           // add.addActionListener(this);
            add.setVisible(true);
            add(add);
    }
    private void jButtonActionPerfromed(java.awt.event.ActionListener evt) throws URISyntaxException{
        Desktop browser = Desktop.getDesktop();
        try{
        browser.browse(new URI("http://www.google.com"));
    }catch(IOException err){
        
    }
    }
public static void main(String args[]){

}
}
