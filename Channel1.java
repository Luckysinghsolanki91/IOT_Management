package iotprojectmanagementforuniversity;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Channel1 {
    
    Channel1(){
         JLabel heading = new JLabel("LOGIN-PAGE");
        heading.setBounds(80,-10,500,50);
        heading.setForeground(Color.gray);
        heading.setFont(new Font("serif",Font.ITALIC,30));
        add(heading);
    }
    
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public void main(String args[]){
  new Channel1();   
}

    private void add(JLabel heading) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
