/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmacy;

import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.Utils.EmailService;
import Business.WorkQueue.PharmacyRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrutikasalian
 */
public class PendingPrescriptionsJPanel extends javax.swing.JPanel {

    JPanel CardLayoutJPanel;
    UserAccount account;
    Pharmacy pharmacy;
    Ecosystem business;
    
   
    /**
     * Creates new form PendingPrescriptionsJPanel
     */
    public PendingPrescriptionsJPanel(JPanel CardLayoutJPanel, UserAccount account, Pharmacy pharmacy, Ecosystem business) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.pharmacy = pharmacy;
        this.account = account;
        this.business = business;
        
        this.populateTable();
    }

    
     public void populateTable() {
        // populate all patients in patient directory
        ArrayList<WorkRequest> appointmentList = account.getWorkQueue().getWorkRequestList();
        ArrayList<PharmacyRequest> upcomingAppointmentList = new ArrayList();
        
        for(WorkRequest w: appointmentList) {
            
            PharmacyRequest pr = (PharmacyRequest) w;            
            if(w.getStatus().equals("pending pharmacy approval") || w.getStatus().equals("awaiting patient pick up")) {
                upcomingAppointmentList.add(pr);
            }
        }
        
    
        int rowCount = pharmacyTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)pharmacyTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(PharmacyRequest w: upcomingAppointmentList) {
            Object row[] = new Object[7];
        
            
            row[0] = w.getSender().getId();
            row[1] = w.getPatient().getPatientID();
            row[2] = w.getMessage();
            row[3] = w.getStatus();
            row[4] = w;
           
            
            model.addRow(row);
            
            
        }     
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pharmacyTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(138, 194, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PENDING PRESCRIPTIONS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        backBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, 100, -1));

        pharmacyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Doctor", "Patient", "Medicines", "Status", "Request Date"
            }
        ));
        jScrollPane1.setViewportView(pharmacyTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 550, 140));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jButton1.setText("Picked Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 129, 40));

        jButton2.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jButton2.setText("Ready For Pickup");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int rowCount = pharmacyTable.getSelectedRow();
        
        if(rowCount < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        PharmacyRequest selected = (PharmacyRequest) pharmacyTable.getValueAt(rowCount, 4);
        selected.setStatus("awaiting patient pick up");
        
        String emailTo = selected.getPatient().getEmailId();
        String message = "Your prescription is ready for pick up. \n \n Regards \n WeCare ";
        String subject = "Medicines ready for pick up";
        
        boolean emailSent = EmailService.sendEmail(emailTo, message, subject);
        
        if(emailSent) {
            JOptionPane.showMessageDialog(null, "Medicines ready for pick up Email sent to the patient"); 
        } else {
             JOptionPane.showMessageDialog(null, "Medicines ready for pick up. Unable to send email to the patient");
        }

        this.populateTable();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int rowCount = pharmacyTable.getSelectedRow();
        
        if(rowCount < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        PharmacyRequest selected = (PharmacyRequest) pharmacyTable.getValueAt(rowCount, 4);
        
        selected.setStatus("medicines picked up");
        selected.setResolveDate(new Date());
        JOptionPane.showMessageDialog(null, "Medicines picked up");
        
        this.populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pharmacyTable;
    // End of variables declaration//GEN-END:variables
}