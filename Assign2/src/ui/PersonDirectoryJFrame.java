/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirDirectory;


import model.HospitalDirectory;

import model.HouseDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSignsHistory;

/**
 *
 * @author Ruchi Anand Sagar
 */
public class PersonDirectoryJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PersonDirectoryJFrame
     */
    PersonDirectory personHistory;
    PatientDirectory patientHistory;
    HouseDirectory houseHistory;
    CommunityDirectory communityHistory;
    CityDirectory cityHistory;
   HospitalDirectory hospitalHistory;
   HospitalDirDirectory hospitalDirHistory;
   DoctorDirectory doctorHistory;
    EncounterHistory encounterHistory;
     VitalSignsHistory vitalSignsHistory;
    
    
    public PersonDirectoryJFrame(PersonDirectory personHistory,PatientDirectory patientHistory,HouseDirectory houseHistory,CommunityDirectory communityHistory,
    CityDirectory cityHistory,
    HospitalDirectory hospitalHistory,
    HospitalDirDirectory hospitalDirHistory,DoctorDirectory doctorHistory,EncounterHistory encounterHistory,VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.personHistory=personHistory;
        this.patientHistory=patientHistory;
        this.houseHistory=houseHistory;
        this.communityHistory=communityHistory;
        this.cityHistory=cityHistory;
        this.hospitalHistory=hospitalHistory;
        this.hospitalDirHistory=hospitalDirHistory;
        this.doctorHistory=doctorHistory;
        this.encounterHistory=encounterHistory;
        this.vitalSignsHistory=vitalSignsHistory;
        
        
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        persondirectorytbl = new javax.swing.JTable();
        namelblj = new javax.swing.JLabel();
        nametxtj = new javax.swing.JTextField();
        agelblj = new javax.swing.JLabel();
        agetxtj = new javax.swing.JTextField();
        genderlblj = new javax.swing.JLabel();
        gendertxtj = new javax.swing.JTextField();
        emailidlblj = new javax.swing.JLabel();
        emailidtxtj = new javax.swing.JTextField();
        contactnolblj = new javax.swing.JLabel();
        passwordlblj = new javax.swing.JLabel();
        contactnotxtj = new javax.swing.JTextField();
        passwordtxtj = new javax.swing.JTextField();
        confirmpasswordlblj = new javax.swing.JLabel();
        confirmpasswordtxtj = new javax.swing.JTextField();
        updatebtnj = new javax.swing.JButton();
        deletebtnj = new javax.swing.JButton();
        backbtnj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        persondirectorytbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "EmailId", "ContactNo", "Password", "ConfirmPassword"
            }
        ));
        persondirectorytbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                persondirectorytblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(persondirectorytbl);

        namelblj.setText("Name");

        agelblj.setText("Age");

        genderlblj.setText("Gender");

        emailidlblj.setText("Email-Id");

        emailidtxtj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailidtxtjActionPerformed(evt);
            }
        });

        contactnolblj.setText("Contact No");

        passwordlblj.setText("Password");

        passwordtxtj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtjActionPerformed(evt);
            }
        });

        confirmpasswordlblj.setText("Confirm Password");

        updatebtnj.setText("Update");
        updatebtnj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnjActionPerformed(evt);
            }
        });

        deletebtnj.setText("Delete");
        deletebtnj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnjActionPerformed(evt);
            }
        });

        backbtnj.setText("<<");
        backbtnj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agelblj)
                    .addComponent(namelblj))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agetxtj, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nametxtj, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailidlblj)
                            .addComponent(genderlblj))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gendertxtj, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailidtxtj, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactnolblj)
                            .addComponent(passwordlblj))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordtxtj, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(contactnotxtj)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmpasswordlblj)
                        .addGap(42, 42, 42)
                        .addComponent(confirmpasswordtxtj, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updatebtnj)
                .addGap(96, 96, 96)
                .addComponent(deletebtnj)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(backbtnj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(backbtnj)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebtnj)
                    .addComponent(updatebtnj))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametxtj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderlblj)
                    .addComponent(gendertxtj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactnolblj)
                    .addComponent(contactnotxtj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelblj))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailidlblj)
                    .addComponent(agetxtj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agelblj)
                    .addComponent(emailidtxtj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordlblj)
                    .addComponent(passwordtxtj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmpasswordtxtj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmpasswordlblj))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailidtxtjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailidtxtjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailidtxtjActionPerformed

    private void passwordtxtjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtjActionPerformed

    private void persondirectorytblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_persondirectorytblMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex=persondirectorytbl.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Data not Found");
             return;}
             
          DefaultTableModel model=(DefaultTableModel) persondirectorytbl.getModel();
          Person selectedPerson=(Person ) model.getValueAt(selectedRowIndex, 0);
          
          nametxtj.setText(selectedPerson.getName());
          agetxtj.setText(String.valueOf(selectedPerson.getAge()));
          gendertxtj.setText(selectedPerson.getGender());
          emailidtxtj.setText(selectedPerson.getEmailid());
          contactnotxtj.setText(String.valueOf(selectedPerson.getContactno()));
          passwordtxtj.setText(selectedPerson.getPassword());
          confirmpasswordtxtj.setText(selectedPerson.getConfirmpassword());
          
    }//GEN-LAST:event_persondirectorytblMouseClicked

    private void deletebtnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnjActionPerformed
        // TODO add your handling code here:
        int i=persondirectorytbl.getSelectedRow();
        if (i<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
             return;}
             
          DefaultTableModel model=(DefaultTableModel) persondirectorytbl.getModel();
          Person selectedPerson=(Person) personHistory.getPersonAt(i);
          int response=JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          if(response==JOptionPane.YES_OPTION){
             
          personHistory.deletePerson(selectedPerson);
          JOptionPane.showMessageDialog(this, "Person Records Deleted Successfully!!");
          }
          else {
              JOptionPane.showMessageDialog(this, "OK!!");
          }
          populateTable();
         nametxtj.setText("");
          agetxtj.setText("");
           gendertxtj.setText("");
            emailidtxtj.setText("");
             contactnotxtj.setText("");
              passwordtxtj.setText("");
               confirmpasswordtxtj.setText("");
    }//GEN-LAST:event_deletebtnjActionPerformed

    private void updatebtnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnjActionPerformed
        // TODO add your handling code here:
        
        int i=persondirectorytbl.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) persondirectorytbl.getModel();
        
        Person selectedPerson=(Person) personHistory.getPersonAt(i);
     
        selectedPerson.setName(nametxtj.getText());
        selectedPerson.setAge(Integer.parseInt(agetxtj.getText()));
        selectedPerson.setGender(gendertxtj.getText());
        selectedPerson.setEmailid(emailidtxtj.getText());
        selectedPerson.setContactno(Long.parseLong(contactnotxtj.getText()));
        selectedPerson.setPassword(passwordtxtj.getText());
        selectedPerson.setConfirmpassword(confirmpasswordtxtj.getText());
        
        
        
        if(i<0)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
          
            model.setValueAt(nametxtj.getText(), i, 0);
            model.setValueAt(agetxtj.getText(), i, 1);
            model.setValueAt(gendertxtj.getText(), i, 2);
            model.setValueAt(emailidtxtj.getText(), i, 3);
            model.setValueAt(contactnotxtj.getText(), i, 4);
            model.setValueAt(passwordtxtj.getText(), i, 5);
            model.setValueAt(confirmpasswordtxtj.getText(), i, 6);
            
            JOptionPane.showMessageDialog(this, "Details Updated Successfully!!");
            
            
       
    }//GEN-LAST:event_updatebtnjActionPerformed

    private void backbtnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnjActionPerformed
        // TODO add your handling code here:
        dispose();
        SystemJFrame systemjframe=new SystemJFrame( personHistory, patientHistory,houseHistory,communityHistory,cityHistory,hospitalHistory,hospitalDirHistory,doctorHistory,encounterHistory,vitalSignsHistory);
        systemjframe.setVisible(true);
        
    }//GEN-LAST:event_backbtnjActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agelblj;
    private javax.swing.JTextField agetxtj;
    private javax.swing.JButton backbtnj;
    private javax.swing.JLabel confirmpasswordlblj;
    private javax.swing.JTextField confirmpasswordtxtj;
    private javax.swing.JLabel contactnolblj;
    private javax.swing.JTextField contactnotxtj;
    private javax.swing.JButton deletebtnj;
    private javax.swing.JLabel emailidlblj;
    private javax.swing.JTextField emailidtxtj;
    private javax.swing.JLabel genderlblj;
    private javax.swing.JTextField gendertxtj;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namelblj;
    private javax.swing.JTextField nametxtj;
    private javax.swing.JLabel passwordlblj;
    private javax.swing.JTextField passwordtxtj;
    private javax.swing.JTable persondirectorytbl;
    private javax.swing.JButton updatebtnj;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
        DefaultTableModel model=(DefaultTableModel) persondirectorytbl.getModel();
        model.setRowCount(0);
        
        for (Person p : personHistory.getPersonHistory())
        {
            Object[] col=new Object[7];
            col[0]= p;
            col[1]= p.getAge();
            col[2]= p.getGender();
            col[3]= p.getEmailid();
            col[4]= p.getContactno();
            col[5]= p.getPassword();
            col[6]= p.getConfirmpassword();
             
            
            model.addRow(col);
            
        }
}



}
