/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Patient.PatientDetails;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saad Ghojaria
 */
public class PatientHistoryJPanel extends javax.swing.JPanel {
    
    private JPanel CardLayoutJPanel;
    private UserAccount account;
    private Patient patient;
    private boolean isPatientLoggedIn;

    /**
     * Creates new form PatientHistoryJPanel
     */
    public PatientHistoryJPanel(JPanel CardLayoutJPanel, Patient patient, UserAccount account,boolean isPatientLoggedIn) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.patient = patient;
        this.account = account;
        this.isPatientLoggedIn = isPatientLoggedIn;
        
        jButton2.setVisible(isPatientLoggedIn);
        
        populateTable();
    }
    
    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<PatientDetails> list = patient.getPatientDetails();
            
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(PatientDetails r: list) {
            Object row[] = new Object[4];
            row[0] = (r.getDoctor() != null) ? r.getDoctor().getDepartment().getHospital().getName() : "Hospital Dummy";
            row[1] = (r.getDoctor() != null) ? r.getDoctor().getName() : "Doctor Dummy";
            row[2] = r;
            row[3] = r.getNotes();
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(138, 194, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital", "Physician", "Date", "Notes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 622, 309));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 210, 40));

        jButton2.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jButton2.setText("< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int row = jTable1.getSelectedRow();
        
        if(row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        PatientDetails details = (PatientDetails) jTable1.getValueAt(row, 2);
        
        PatientDetailsJPanel patientDetailsJPanel = new PatientDetailsJPanel(CardLayoutJPanel, details, account);
        CardLayoutJPanel.add("PatientDetailsJPanel", patientDetailsJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}