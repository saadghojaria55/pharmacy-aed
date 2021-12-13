/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Ambulance;

import Business.Ambulance.Ambulance;
import Business.Ecosystem;
import Business.Patient.Patient;
import Business.SOSRequest.SOSRequests;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saad Ghojaria
 */
public class UpdateStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateStatusJPanel
     */
    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    private UserAccount useraccount;
    String reqId;
    private SOSRequests sosreq;
   
    Ambulance ambulance;
    public UpdateStatusJPanel(JPanel CardLayoutJPanel,Ecosystem business, UserAccount useraccount,Patient patient, String reqId,Ambulance ambulance ) {
        initComponents();
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.reqId=reqId;
        this.business=business;
        this.useraccount=useraccount;
        this.ambulance=ambulance;
        idLabel.setText(String.valueOf(reqId));
       
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
        ReqStatus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        UPDATE = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(138, 194, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("STATUS:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 80, 30));

        ReqStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReqStatusActionPerformed(evt);
            }
        });
        add(ReqStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 160, 30));

        jLabel2.setText("REQUEST ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, 40));

        idLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 60, 60));

        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 100, 40));

        backbtn.setText("<Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ReqStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReqStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReqStatusActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        
       String s= ReqStatus.getText();
       System.out.println(s);
        for (Ambulance ambu: business.getAmbulancefleet().getAmbulanceFleet()) {
           
            if (ambu.getUsername().equals(useraccount.getUsername())) {
               
               for(SOSRequests req: ambu.getSosreq()){
                  
                   if(req.getRequestId().equals(reqId)){
                        req.setReqStatus(ReqStatus.getText());
                        JOptionPane.showMessageDialog(null, "AMBULANCE STATUS UPDATED!");
                        ambu.setReqStatus(ReqStatus.getText());
                 }
               }
                
            }
            
        }
    
        
        /*for(SOSRequests req: ambulance.getSosreq()){
                if(req.getRequestId()==reqId){
                    req.setReqStatus(ReqStatus.getText());
                    JOptionPane.showMessageDialog(null, "AMBULANCE REQUEST SENT");
                 }*/
    }//GEN-LAST:event_UPDATEActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        RideRequestJPanel  rideRequestJPanel = new  RideRequestJPanel(CardLayoutJPanel,business, useraccount, ambulance);
        CardLayoutJPanel.add("UpdateRoom", rideRequestJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ReqStatus;
    private javax.swing.JButton UPDATE;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
