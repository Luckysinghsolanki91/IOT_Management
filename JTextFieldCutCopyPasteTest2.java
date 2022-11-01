
package iotprojectmanagementforuniversity;
//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.event.*;
public class JTextFieldCutCopyPasteTest2 extends JFrame{
@SuppressWarnings("FieldMayBeFinal")
private JButton copyButton;
//now here we make a constructor
@SuppressWarnings("Convert2Lambda")
public JTextFieldCutCopyPasteTest2(){

copyButton = new JButton("Copy");
  copyButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            textField.copy();
         }
      });

 //textField.addCaretListener(new CaretListener() {
   //      @Override
     //    public void caretUpdate(CaretEvent ce) {
       //     System.out.println("All text: " + textField.getText());
         //   if (textField.getSelectedText() != null)
           //    System.out.println("Selected text: " + textField.getSelectedText());
           // else
             //  System.out.println("Selected text: ");
         //} 
      //});
    add(copyButton);
    setSize(20, 90);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);setLocationRelativeTo(null);
      setVisible(true);
}
@SuppressWarnings("ResultOfObjectAllocationIgnored")
 public static void main(String args[]){
      new JTextFieldCutCopyPasteTest2();
   }

    private static class textField {

       // private static Object getSelectedText() {
         //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //}

        //private static String getText() {
          //   return null;
            // }

        //private static void addCaretListener(CaretListener caretListener) {
        //}

        private static void copy() {
            }
        public textField() {
        }
    }
}
