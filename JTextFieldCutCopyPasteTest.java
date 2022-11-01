package iotprojectmanagementforuniversity;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class JTextFieldCutCopyPasteTest extends JFrame{
    
    
    private JTextField textField;
    @SuppressWarnings("FieldMayBeFinal")
    private JButton cutButton;
    @SuppressWarnings("FieldMayBeFinal")
    private JButton copyButton;
    @SuppressWarnings("FieldMayBeFinal")
    private JButton pasteButton;
    @SuppressWarnings("Convert2Lambda")
   public JTextFieldCutCopyPasteTest() {
      setTitle("JTextField CutCopyPaste Test");
      setLayout(new FlowLayout());
      textField = new JTextField(20);
      cutButton = new JButton("Cut");
      pasteButton = new JButton("Paste");
      copyButton = new JButton("Copy");
      cutButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            textField.cut();
         }
      });
      copyButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            textField.copy();
         }
      });
      pasteButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent le) {
            textField.paste();
         }
      });
      textField.addCaretListener(new CaretListener() {
         @Override
         public void caretUpdate(CaretEvent ce) {
            System.out.println("All text: " + textField.getText());
            if (textField.getSelectedText() != null)
               System.out.println("Selected text: " + textField.getSelectedText());
            else
               System.out.println("Selected text: ");
         }
      });
      add(textField);
      add(cutButton);
      add(copyButton);
      add(pasteButton);
      setSize(375, 250);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);setLocationRelativeTo(null);
      setVisible(true);
   }
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
   public static void main(String args[]){
      new JTextFieldCutCopyPasteTest();
   }
}
