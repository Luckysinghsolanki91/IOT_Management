package iotprojectmanagementforuniversity;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;

public class fackbookpage extends JFrame{
    
fackbookpage(){
    
   setSize(1366,768);
        setVisible(true);
        
    
}


@SuppressWarnings("ResultOfObjectAllocationIgnored")
public static void main(String args[]) throws URISyntaxException, IOException{
    Desktop d=Desktop.getDesktop();
    d.browse(new URI("http://www.facebook.com"));
    new fackbookpage();
}
}