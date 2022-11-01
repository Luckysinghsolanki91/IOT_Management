package iotprojectmanagementforuniversity;
import java.awt.Choice;
import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.Desktop;
import java.awt.Font;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.*;
//import java.io.File;
import net.proteanit.sql.DbUtils;

@SuppressWarnings("CallToPrintStackTrace")
public class TeacherDetails extends JFrame implements ActionListener{
    @SuppressWarnings("FieldMayBeFinal")
    private JTextField textField;
    Choice Teacher_id_no;
    JTable table;
    JButton search,print,update,copy,add,cancel;
    
    
    @SuppressWarnings({"CallToPrintStackTrace", "UseSpecificCatch"})
    TeacherDetails(){
        //(width,length)
        setSize(1118,700);
        //(left,top)
        setLocation(150,20);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        /* i1 = new ImageIcon(ClassLoader.getSystemResource("icons/University.jpeg"));
       Image i2 = i1.getImage().getScaledInstance(1118,768,Image.SCALE_DEFAULT);
       ImageIcon i3 = new  ImageIcon(i2); 
       JLabel image = new JLabel(i3);
       // image.setBounds(350,0,200,200);
        add(image);*/
        
       
        JLabel heading=new JLabel("Search by Teacher_name");
        //WIDTH, WIDTH, WIDTH, HEIGHT
        heading.setBounds(160, 30, 1000, 30);
        heading.setFont(new Font("serif",Font.ITALIC,30));
        add(heading);
        
         Teacher_id_no = new Choice();
          Teacher_id_no.setBounds(510,10, 300, 30);
          add(Teacher_id_no);
        
          try{
              Conn c=new Conn();
           var rs=c.s.executeQuery("select * from TeacherDetails");
           while(rs.next()){
               Teacher_id_no.add(rs.getString("Teacher_name"));
               
           }
          }catch(Exception e){
              e.printStackTrace();
          }
          table = new JTable();
            try {
                 Conn c=new Conn();
              var rs = c.s.executeQuery("select * from TeacherDetails");
               table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException ex) {
                Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
             catch(Exception ae){
              ae.printStackTrace();
}  
            JScrollPane jsp=new JScrollPane(table);
            jsp.setBounds(0, 200,1100,600);
            add(jsp);
            
            search=new JButton("search");
            search.setBounds(20,90, 100, 30);
            search.setBackground(Color.red);
            search.setForeground(Color.white);
            search.addActionListener(this);
            search.setVisible(true);
            add(search);
           
            
            print=new JButton("print");
            print.setBounds(210,90, 100, 30);
            print.setBackground(Color.blue);
            print.setForeground(Color.white);
            print.addActionListener(this);
            print.setVisible(true);
            add(print);
            
             update=new JButton("update");
            update.setBounds(380,90,100, 30);
            update.setBackground(Color.green);
            update.setForeground(Color.white);
            update.addActionListener(this);
            update.setVisible(true);
            add(update);
            
            copy=new JButton("copy");
            //copy.setText("hello guys");
            copy.setBounds(580,90,100,30);
            copy.setBackground(Color.orange);
            copy.setForeground(Color.white);
           // copy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           // copy.setSize(230, 150);
           textField = new JTextField(20);
            copy.addActionListener(this);
            copy.setVisible(true);
            add(textField);
             //setLayout(new FlowLayout());
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            add(copy);
            
            
             add=new JButton("add");
            add.setBounds(780,90,100,30);
            add.setBackground(Color.gray);
            add.setForeground(Color.white);
            add.addActionListener(this);
            add.setVisible(true);
            add(add);
            
             cancel=new JButton("cancel");
            cancel.setBounds(980,90,100, 30);
            cancel.setBackground(Color.black);
            cancel.setForeground(Color.white);
            cancel.addActionListener(this);
           cancel.setVisible(true);
            add(cancel);
    }
    
    
    @Override
    @SuppressWarnings({"UseSpecificCatch", "ResultOfObjectAllocationIgnored"})
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
            String query ="select * from TeacherDetails where  Teacher_name='"+ Teacher_id_no.getSelectedItem()+"'";
            try{
                Conn c= new Conn();
                var rs=c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch(Exception e){
                e.printStackTrace();
                
            }
            // try{
         //Runtime.getRuntime().exec("rundll32.url,FileProtocalHandler "+"C://Users//Hp//Documents//NetBeansProjects//IOTPROJECTMANAGEMENTFORUNIVERSITY//src//File//SMARTFARMINGREPORT.pdf");
// Desktop.getDesktop().open(new File("File/API's connection.txt"));
        //}
          //  catch(Exception a){
            //    a.printStackTrace();
            //}
                    
            }
    else if(ae.getSource()==print){
            try{
                table.print();
        } catch(Exception e){
            e.printStackTrace();
        }
        }else if(ae.getSource() == add){
            setVisible(false);
            new AddStudent();
                   
        }
        
else if(ae.getSource() == copy){
            setVisible(false);
            String copystr=copy.getText();
            copy.setText(copystr);
            textField.copy();
            copy.setText(textField.getText());
          //  ((JButton)e.getSource()).setText("hello");
           
        }        
        
        else if(ae.getSource() == update){
            setVisible(false);
            new AddTeacher();
            
        } else{
             setVisible(false);
        }
    }
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String[] args){
    new TeacherDetails();
}
    //  private static class UpdateStudent {
    //    public UpdateStudent() {
    //    }
    //}

}

