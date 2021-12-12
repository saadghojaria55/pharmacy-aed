/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Pharmacy.Pharmacy;
import Business.Pharmacy.PharmacyDirectory;
import UserInterface.Pharmacy.PharmacyInfoJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rakesh Lokam
 */
public class SystemAdminPharmacyJPanel extends javax.swing.JPanel {

    JPanel CardLayoutJPanel;
    private Ecosystem ecosystem;
    /**
     * Creates new form SystemAdminPharmacyJPanel
     */
    public SystemAdminPharmacyJPanel(JPanel CardLayoutJPanel,  Ecosystem ecosystem) {
   
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.ecosystem = ecosystem;
        populateTable();
    }
    
    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<Pharmacy> pharmacyList = ecosystem.getPharmacyDirectory().getPharmacyList();
    
        int rowCount = pharmacyTbl.getRowCount();
        DefaultTableModel model = (DefaultTableModel)pharmacyTbl.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Pharmacy p : pharmacyList) {
            Object row[] = new Object[6];
            row[0] = p;
            row[1] = p.getPharmacyId();
            row[2] = p.getLicenseNo();
            row[3] = p.getPhoneNo();
            row[4] = p.getEmailId();
            row[5] = p.getAddress();
           
           
            
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

        viewPharmacyBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pharmacyTbl = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        createPharmacyBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewPharmacyBtn.setBackground(new java.awt.Color(255, 255, 255));
        viewPharmacyBtn.setText("View Details");
        viewPharmacyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPharmacyBtnActionPerformed(evt);
            }
        });
        add(viewPharmacyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 200, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pharmacy Portal");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        pharmacyTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Pharmacy Id", "License No.", "phone no.", "email id", "Address"
            }
        ));
        jScrollPane1.setViewportView(pharmacyTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 770, 90));

        deleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete Existing Pharmacy");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 200, 30));

        createPharmacyBtn.setBackground(new java.awt.Color(255, 255, 255));
        createPharmacyBtn.setText("Sign Up New Pharmacy");
        createPharmacyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPharmacyBtnActionPerformed(evt);
            }
        });
        add(createPharmacyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 200, 30));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/icons8-back-arrow-24.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 187, 40, -1));

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 200, 30));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 70, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/HBKG_2.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1010, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createPharmacyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPharmacyBtnActionPerformed
        // TODO add your handling code here:
        CreatePharmacyJPanel createPharmacyJPanel = new CreatePharmacyJPanel(CardLayoutJPanel, ecosystem);
        CardLayoutJPanel.add("CreatePharmacyJPanel", createPharmacyJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_createPharmacyBtnActionPerformed

    private void viewPharmacyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPharmacyBtnActionPerformed
        // TODO add your handling code here:

        int row = pharmacyTbl.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        System.out.println("=========== >> " + pharmacyTbl.getValueAt(row, 0));
        Pharmacy viewPharmacy = (Pharmacy) pharmacyTbl.getValueAt(row, 0);
        PharmacyInfoJPanel pharmacyInfoJPanel = new PharmacyInfoJPanel(CardLayoutJPanel, viewPharmacy);
        CardLayoutJPanel.add("PharmacyInfoJPanel", pharmacyInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_viewPharmacyBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int row = pharmacyTbl.getSelectedRow();
        Pharmacy selectedPharmacy = (Pharmacy) pharmacyTbl.getValueAt(row, 0);

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        PharmacyDirectory pharmacyDirectory = ecosystem.getPharmacyDirectory();
        ecosystem.getPharmacyDirectory().deletePharmacy(selectedPharmacy.getPharmacyId(), ecosystem);
        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createPharmacyBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pharmacyTbl;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton viewPharmacyBtn;
    // End of variables declaration//GEN-END:variables
}
