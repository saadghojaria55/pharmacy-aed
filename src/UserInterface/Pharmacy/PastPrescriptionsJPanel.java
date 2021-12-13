/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmacy;

import Business.Ecosystem;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srushtidesai
 */
public class PastPrescriptionsJPanel extends javax.swing.JPanel {

    JPanel CardLayoutJPanel;
    UserAccount account;
    Pharmacy pharmacy;
    /**
     * Creates new form PastPrescriptionsJPanel
     */
    public PastPrescriptionsJPanel(JPanel CardLayoutJPanel, UserAccount account, Pharmacy pharmacy) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.pharmacy = pharmacy;
        this.account = account;
        
         populateTable();
    }
    
    public void populateTable() {

    ArrayList<WorkRequest> appointmentList = account.getWorkQueue().getWorkRequestList();
        ArrayList<PharmacyRequest> upcomingAppointmentList = new ArrayList();
        
        for(WorkRequest w: appointmentList) {
            
            PharmacyRequest pr = (PharmacyRequest) w;            
            if(w.getStatus().equals("medicines picked up")) {
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
            row[5] = w.getResolveDate();
           
            
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
        jScrollPane1 = new javax.swing.JScrollPane();
        pharmacyTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(138, 194, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PAST PRESCRIPTIONS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        pharmacyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Doctor", "Patient", "Medicines", "Status", "Request Date", "Resolve Date"
            }
        ));
        jScrollPane1.setViewportView(pharmacyTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 630, 150));

        backBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pharmacyTable;
    // End of variables declaration//GEN-END:variables
}