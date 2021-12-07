/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Role.PatientRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rakesh Lokam
 */
public class CreatePatientJPanel extends javax.swing.JPanel {

    JPanel CardLayoutJPanel;
    private Ecosystem business;
    /**
     * Creates new form CreatePatientJPanel
     */
    public CreatePatientJPanel(JPanel CardLayoutJPanel, Ecosystem business) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
         this.business = business;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addressTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        numberTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        bloodGroupTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        passwordTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(138, 194, 211));
        setPreferredSize(new java.awt.Dimension(850, 540));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 221, -1));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 221, -1));
        add(numberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 221, -1));

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 221, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(108, 177, 205));
        jLabel8.setText("Age:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 30, 15));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 177, 205));
        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 100, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(108, 177, 205));
        jLabel9.setText("Gender:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(108, 177, 205));
        jLabel10.setText("Blood Group:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(108, 177, 205));
        jLabel4.setText("Email id:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 60, 20));
        add(ageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 221, -1));
        add(bloodGroupTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 221, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(108, 177, 205));
        jLabel6.setText("Contact number:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, 20));

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "female", "male", "other" }));
        add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 221, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(108, 177, 205));
        jLabel7.setText("Address:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(108, 177, 205));
        jLabel1.setText("Sign Up New Patient");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/icons8-back-arrow-24.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));
        add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 221, -1));
        add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 221, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 177, 205));
        jLabel3.setText("Password:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, 20));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(108, 177, 205));
        jLabel5.setText("Username:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("/Users/shrutikasalian/Desktop/patient1.jpeg")); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(850, 540));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -50, 1110, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

        Patient newPatient = new Patient();
        String name = nameTxt.getText();
        String phoneNo = numberTxt.getText();
        String emailId = emailTxt.getText();
        String address = addressTxt.getText();
        String age = ageTxt.getText();
        String gender = genderComboBox.getSelectedItem().toString();
        String bloodGroup = bloodGroupTxt.getText();
        
        String username = usernameTxt.getText();
        String password = passwordTxt.getText();
        
        newPatient.setName(name);
        newPatient.setAddress(address);
        newPatient.setAge(age);
        newPatient.setBloodGroup(bloodGroup);
        newPatient.setEmailId(emailId);
        newPatient.setGender(gender);
        newPatient.setPassword(password);
        newPatient.setPhoneNo(phoneNo);
        newPatient.setUsername(username);
        
        //business.getPatientDirectory().add(newPatient);
        if(name.isEmpty() || phoneNo.isEmpty() || address.isEmpty()|| username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        }
        else if(!phoneFormat(phoneNo))
        {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        }
        else if(!business.getPatientDirectory().isPhoneUnique(phoneNo)){
            JOptionPane.showMessageDialog(null, "Phone No already registered!");
        }
        else if(!business.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists!");
        }
       else{
            Patient patient = business.getPatientDirectory().addPatient(newPatient);
            UserAccount account = business.getUserAccountDirectory().createUserAccount(username, password, patient.getPatientID(), new PatientRole(), patient);
        
        JOptionPane.showMessageDialog(null, "New patient signed up");
    }//GEN-LAST:event_saveBtnActionPerformed
    }
        public boolean phoneFormat(String phoneNo){
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(phoneNo);
        if(matcher.matches()){
            return true;
        }
        return false;
    }
    
        
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        Component[] componentArray = CardLayoutJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminPatientPortalJPanel systemAdminPatientPortalJPanel = (SystemAdminPatientPortalJPanel) component;
        systemAdminPatientPortalJPanel.populateTable();

        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bloodGroupTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField numberTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
