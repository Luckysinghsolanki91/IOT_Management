package iotprojectmanagementforuniversity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmAddNewStudent extends javax.swing.JFrame implements ActionListener {
    public frmAddNewStudent() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Fathername = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        Studentname = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        txtfather1 = new javax.swing.JTextField();
        Contactno = new javax.swing.JLabel();
        txtHContactno = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        Emailid = new javax.swing.JLabel();
        HomeContactno = new javax.swing.JLabel();
        btnEditStudent = new javax.swing.JButton();
        btnSaveStudent = new javax.swing.JButton();
        btnDeleteStudent = new javax.swing.JButton();
        txtBranch = new javax.swing.JTextField();
        Branch = new javax.swing.JLabel();
        txtSemester = new javax.swing.JTextField();
        Semester = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        btnCopyStudent = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        txtDOB = new javax.swing.JTextField();
        DOB = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("                                                Student-Attendence-Details");

        Fathername.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        Fathername.setText("Father-name:-");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        Studentname.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        Studentname.setText("student-name:-");

        Contactno.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        Contactno.setText("Contact-no:-");

        btnCancel.setBackground(new java.awt.Color(51, 51, 255));
        btnCancel.setFont(new java.awt.Font("Footlight MT Light", 3, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        Emailid.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        Emailid.setText("Email-id:-");

        HomeContactno.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        HomeContactno.setText("Home Contact-no:-");

        btnEditStudent.setBackground(new java.awt.Color(255, 255, 102));
        btnEditStudent.setFont(new java.awt.Font("Footlight MT Light", 3, 18)); // NOI18N
        btnEditStudent.setText("Edit");
        btnEditStudent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));
        btnEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditStudentActionPerformed(evt);
            }
        });

        btnSaveStudent.setBackground(new java.awt.Color(102, 255, 102));
        btnSaveStudent.setFont(new java.awt.Font("Footlight MT Light", 3, 18)); // NOI18N
        btnSaveStudent.setText("Save");
        btnSaveStudent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));
        btnSaveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveStudentActionPerformed(evt);
            }
        });

        btnDeleteStudent.setBackground(new java.awt.Color(255, 0, 0));
        btnDeleteStudent.setFont(new java.awt.Font("Footlight MT Light", 3, 18)); // NOI18N
        btnDeleteStudent.setText("Delete");
        btnDeleteStudent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));
        btnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStudentActionPerformed(evt);
            }
        });

        Branch.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        Branch.setText("      Branch:-");

        Semester.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        Semester.setText("Semester:-");

        Address.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        Address.setText("Address:-");

        btnCopyStudent.setBackground(new java.awt.Color(31, 220, 182));
        btnCopyStudent.setFont(new java.awt.Font("Footlight MT Light", 3, 18)); // NOI18N
        btnCopyStudent.setText("Copy");
        btnCopyStudent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));
        btnCopyStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyStudentActionPerformed(evt);
            }
        });

        DOB.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        DOB.setText("DOB:-");

        tblShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student-Name", "Fater-name", "Contact-no", "Email-id", "Home Contact-no", "Branch", "Semester", "Address", "Dob", "Present", "Absent", "Total Attendence"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblShow);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HomeContactno)
                            .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHContactno, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(btnCopyStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(btnSaveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(209, 209, 209))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Studentname)
                            .addComponent(Fathername)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Emailid, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Contactno)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfather1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Branch)
                                .addComponent(Address)
                                .addComponent(DOB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Semester, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1001, 1001, 1001)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Studentname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Branch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfather1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fathername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Contactno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Emailid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HomeContactno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHContactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Semester, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCopyStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditStudentActionPerformed

    private void btnSaveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveStudentActionPerformed
      if(txtUser.getText().trim().length()==0){
          JOptionPane.showMessageDialog(this,"Please Enter Name");
          txtUser.setText("");
          txtUser.grabFocus();
      }
        else if(txtContact.getText().trim().length()==0){
          JOptionPane.showMessageDialog(this,"Please Enter Contact");
          txtContact.setText("");
          txtContact.grabFocus();
      }
        
        else if(txtHContactno.getText().trim().length()==0){
          JOptionPane.showMessageDialog(this,"Please Enter your Home Contact Number");
          txtHContactno.setText("");
          txtHContactno.grabFocus();
      }
        
          else if(txtBranch.getText().trim().length()==0){
          JOptionPane.showMessageDialog(this,"Please Enter Branch");
          txtBranch.setText("");
          txtBranch.grabFocus();
      }
           else  if(txtSemester.getText().trim().length()==0){
          JOptionPane.showMessageDialog(this,"Please Enter Semester");
          txtSemester.setText("");
          txtSemester.grabFocus();
      }
              else if(txtAddress.getText().trim().length()==0){
          JOptionPane.showMessageDialog(this,"Please Enter Address");
          txtAddress.setText("");
          txtAddress.grabFocus();
      }
                else if(txtfather1.getText().trim().length()==0){
          JOptionPane.showMessageDialog(this,"Please Enter Father name");
          txtfather1.setText("");
          txtfather1.grabFocus();
      }
                 else  if(txtEmail.getText().trim().length()==0){
          JOptionPane.showMessageDialog(this,"Please Enter Email Address");
          txtEmail.setText("");
          txtEmail.grabFocus();
      }
                  else if(txtDOB.getText().trim().length()==0){
          JOptionPane.showMessageDialog(this,"Please Enter DOB");
          txtDOB.setText("");
          txtDOB.grabFocus();
                  }
else{
                      Connection c;
          try {
             
              String UserName=txtUser.getText();
              String FatherName=txtfather1.getText();
              @SuppressWarnings("LocalVariableHidesMemberVariable")
              String Contactno=txtContact.getText();//if i convert it into in integer then i will do String Contactno=Integer.parseInt(txtContact.getText());
              String Email=txtEmail.getText();
              String HomeContact=txtHContactno.getText();
              @SuppressWarnings("LocalVariableHidesMemberVariable")
              String Branch=txtBranch.getText();
              @SuppressWarnings("LocalVariableHidesMemberVariable")
              String Semester=txtSemester.getText();
              @SuppressWarnings("LocalVariableHidesMemberVariable")
              String Address=txtAddress.getText();
              @SuppressWarnings("LocalVariableHidesMemberVariable")
              String DOB=txtDOB.getText();
              
              
              
              
              
              
              Class.forName("com.mysql.cj.jdbc.Driver");
               Conn con = new Conn();
               c = DriverManager.getConnection("jdbc:mysql:///iotprojectmanagementsystem","root","Lucky@1234");
             var s=c.prepareStatement("insert into attendencestudentdetails4(UserName,FatherName,Contactno,Email,HomeContact,Branch,Semester,Address,Dob)");   
           // String query="insert into login where attendencestudentdetails4(UserName,FatherName,Contactno,Email,HomeContact,Branch,Semester,Address,Dob);
             s.setString (1,UserName);
             s.setString(2, FatherName);
             s.setString(3, Contactno);
             s.setString(4, Email);
             s.setString(5, HomeContact);
             s.setString(6, Branch);
             s.setString(7, Semester);
             s.setString(8, Address);
             s.setString(9,  DOB); 
             s.executeUpdate();
             JOptionPane.showMessageDialog(this, "your data is saved successfully","success",JOptionPane.INFORMATION_MESSAGE);
             
             txtUser.setText("");
             txtfather1.setText("");
             txtContact.setText("");
             txtEmail.setText("");
             txtHContactno.setText("");
             txtBranch.setText("");
             txtSemester.setText("");
             txtAddress.setText("");
             txtDOB.setText("");
             
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(frmAddNewStudent.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(frmAddNewStudent.class.getName()).log(Level.SEVERE, null, ex);
          }
                  }   
                 
    }//GEN-LAST:event_btnSaveStudentActionPerformed

    private void btnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteStudentActionPerformed

    private void btnCopyStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopyStudentActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmAddNewStudent().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Branch;
    private javax.swing.JLabel Contactno;
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel Emailid;
    private javax.swing.JLabel Fathername;
    private javax.swing.JLabel HomeContactno;
    private javax.swing.JLabel Semester;
    private javax.swing.JLabel Studentname;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCopyStudent;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnEditStudent;
    private javax.swing.JButton btnSaveStudent;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblShow;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBranch;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHContactno;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtfather1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
