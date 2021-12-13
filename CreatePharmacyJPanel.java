/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Pharmacy.Pharmacy;
import Business.Role.HospitalRole;
import Business.Role.PharmacyRole;
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
public class CreatePharmacyJPanel extends javax.swing.JPanel {

    JPanel CardLayoutJPanel;
    private Ecosystem business;
    /**
     * Creates new form CreatePharmacyJPanel
     */
    public CreatePharmacyJPanel(JPanel CardLayoutJPanel, Ecosystem business) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contactNumberTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        licenseTxt = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        usernameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10a = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(138, 194, 211));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign Up New Pharmacy");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 286, 42));

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 200, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contact Number:");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        contactNumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberTxtActionPerformed(evt);
            }
        });
        jPanel1.add(contactNumberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 200, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email:");
        jLabel5.setToolTipText("");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });
        jPanel1.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 200, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Name:");
        jLabel6.setToolTipText("");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 40, -1));
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 200, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("License Number:");
        jLabel7.setToolTipText("");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));
        jPanel1.add(licenseTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 200, 30));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/icons8-back-arrow-24.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, -1, -1));

        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 200, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Password:");
        jLabel8.setToolTipText("");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Username:");
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, -1));

        jLabel10a.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10a.setText("Address:");
        jLabel10a.setToolTipText("");
        jLabel10a.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel10a, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, -1));
        jPanel1.add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 200, 30));

        jLabel2.setBackground(new java.awt.Color(138, 194, 211));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/shrutikasalian/Desktop/pharmacy1.jpeg")); // NOI18N
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, 1060, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void contactNumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberTxtActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        Component[] componentArray = CardLayoutJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminPharmacyJPanel systemAdminPharmacyJPanel = (SystemAdminPharmacyJPanel) component;
        systemAdminPharmacyJPanel.populateTable();

        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        // TODO: add validations
        
        Pharmacy newPharmacy = new Pharmacy();
        
         String username = usernameTxt.getText();
         String password= passwordTxt.getText(); 
         
         String emailId = emailtxt.getText();
         String name = nameTxt.getText();
         String phoneNo= contactNumberTxt.getText();
         String licenseNo= licenseTxt.getText();
         String address = addressTxt.getText();
         
        newPharmacy.setAddress(address);
        newPharmacy.setEmailId(emailId);
        
        newPharmacy.setLicenseNo(licenseNo);
        newPharmacy.setName(name);
        newPharmacy.setPhoneNo(phoneNo);
        newPharmacy.setUsername(username);
        newPharmacy.setPassword(password);
        
        if(password.isEmpty() || phoneNo.isEmpty() || name.isEmpty()|| username.isEmpty() || emailId.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        }
        else if(!phoneFormat(phoneNo))
        {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        }
 

        else if(!phoneFormat(phoneNo))
        {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        }
        else if(!business.getPharmacyDirectory().isPhoneUnique(phoneNo)){
            JOptionPane.showMessageDialog(null, "Phone No already registered!");
        }
        else if(!business.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists!");
        }
        else{

            Pharmacy pharmacy = business.getPharmacyDirectory().addPharmacy(newPharmacy);
            UserAccount account = business.getUserAccountDirectory().createUserAccount(username, password, pharmacy.getPharmacyId(), new PharmacyRole(), pharmacy);
        
            JOptionPane.showMessageDialog(null, "New Pharmacy added");
        }
        }

        public boolean phoneFormat(String phoneNo){
            String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(phoneNo);
            if(matcher.matches()){
                return true;
            }
            return false;

    }//GEN-LAST:event_btnSaveActionPerformed

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField contactNumberTxt;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10a;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField licenseTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}