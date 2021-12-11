/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Ambulance ;

import Business.Ambulance.Ambulance;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shrutikasalian
 */
public class AmbulanceInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AmbulanceInfoJPanel
     */
    public JPanel CardLayoutJPanel;
    public Ambulance ambulance;

    public AmbulanceInfoJPanel(JPanel CardLayoutJPanel, Ambulance viewAmbulance) {

        initComponents();
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.ambulance= viewAmbulance;
        
        idTxt.setText(ambulance.getAmbulanceId());
        //emailTxt.setText(ambulance.getEmailId());
        numberTxt.setText(ambulance.getPhoneNo());
        drivernameTxt.setText(ambulance.getDriverName());
        baseLocationTxt.setText(ambulance.getBaseLocation());
        licenseTxt.setText(ambulance.getLicenseNo());
        
        idTxt.setEnabled(false);
        numberTxt.setEnabled(false);
        licenseTxt.setEnabled(false);
        baseLocationTxt.setEnabled(false);
        drivernameTxt.setEnabled(false);
        
        this.saveBtn.setEnabled(false);
        this.UpdateBtn.setEnabled(true);

        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        drivernameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numberTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        baseLocationTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        licenseTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(138, 194, 211));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setText("<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 565, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE AMBULANCE ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 96, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ambulance Id:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 225, -1, -1));
        add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 220, 221, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Driver Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 269, -1, -1));
        add(drivernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 264, 221, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact number:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 312, -1, -1));
        add(numberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 307, 221, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Base Location:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 354, -1, -1));

        baseLocationTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseLocationTxtActionPerformed(evt);
            }
        });
        add(baseLocationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 349, 221, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("License Number:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 396, -1, -1));

        licenseTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseTxtActionPerformed(evt);
            }
        });
        add(licenseTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 391, 221, -1));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 444, -1, -1));

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 444, 75, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void baseLocationTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseLocationTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseLocationTxtActionPerformed

    private void licenseTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseTxtActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

        

        String phoneNo= numberTxt.getText();
        String baseLocation = baseLocationTxt.getText();
        String driverName = drivernameTxt.getText();
        String licenseNo= licenseTxt.getText();
        
        
        ambulance.setBaseLocation(baseLocationTxt.getText());
       // ambulance.setAmbulanceId(idTxt.getText());
        ambulance.setLicenseNo(licenseTxt.getText());
        ambulance.setDriverName(drivernameTxt.getText());
        ambulance.setPhoneNo(numberTxt.getText());
        
        this.baseLocationTxt.setEnabled(false);
        this.licenseTxt.setEnabled(false);
        this.idTxt.setEnabled(false);
        this.drivernameTxt.setEnabled(false);
        this.numberTxt.setEnabled(false);

        this.saveBtn.setEnabled(false);

        this.UpdateBtn.setEnabled(true);

       
    }//GEN-LAST:event_saveBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        
        this.baseLocationTxt.setEnabled(true);
        this.licenseTxt.setEnabled(true);
        //this.idTxt.setEnabled(false);
        this.drivernameTxt.setEnabled(true);
        this.numberTxt.setEnabled(true);
        
        this.saveBtn.setEnabled(true);

        this.UpdateBtn.setEnabled(false);
        
    }//GEN-LAST:event_UpdateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField baseLocationTxt;
    private javax.swing.JTextField drivernameTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField licenseTxt;
    private javax.swing.JTextField numberTxt;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
