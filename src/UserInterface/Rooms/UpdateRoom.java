   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Rooms;

import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Patient.Patient;
import Business.Rooms.Rooms;
import Business.UserAccount.UserAccount;
import UserInterface.HospitalAdmin.ManageRooms;
import UserInterface.Patient.PatientSOSJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shrutikasalian
 */
public class UpdateRoom extends javax.swing.JPanel {

    /**
     * Creates new form UpdateRoom
     */
    JPanel CardLayoutJPanel;
    int viewRoom;
    Hospital hospital;
    Rooms s;
    private Ecosystem business;
    private UserAccount useraccount;
    Patient patient;
    public UpdateRoom(JPanel CardLayoutJPanel,Ecosystem business,UserAccount useraccount, int viewRoom, Hospital hospital) {
        initComponents();
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.viewRoom=viewRoom;
        s = hospital.roomId(viewRoom);
       
        if(s!=null){
            TxtUpdate.setText(String.valueOf(s.getRoomQuantity()));
            RoomStatus.setText(s.getRoomStatus());
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

        jLabel4 = new javax.swing.JLabel();
        TxtUpdate = new javax.swing.JTextField();
        UpdateSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RoomStatus = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(138, 194, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Update Rooms:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, 30));

        TxtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUpdateActionPerformed(evt);
            }
        });
        add(TxtUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 160, -1));

        UpdateSave.setBackground(new java.awt.Color(255, 255, 255));
        UpdateSave.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        UpdateSave.setText("Save");
        UpdateSave.setEnabled(false);
        UpdateSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSaveActionPerformed(evt);
            }
        });
        add(UpdateSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 120, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Room Status:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 30));
        add(RoomStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 160, -1));

        UpdateBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 120, -1));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUpdateActionPerformed

    private void UpdateSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSaveActionPerformed
        /*for (Rooms r: hospital.getRoomDirectory()){
            if(r.getSerialNo()==viewRoom){
                r.setRoomQuantity(Integer.parseInt(TxtUpdate.getText()));
                r.setRoomStatus(RoomStatus.getText());
            }
            
        }*/
        s.setRoomQuantity(Integer.parseInt(TxtUpdate.getText()));
        s.setRoomStatus(RoomStatus.getText());
        
    }//GEN-LAST:event_UpdateSaveActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        TxtUpdate.setEditable(true);
        RoomStatus.setEditable(true);
        UpdateSave.setEnabled(true);
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ManageRooms mr=new ManageRooms(CardLayoutJPanel,business,useraccount);
       CardLayoutJPanel.add("ManageRoomsPanel",mr);
       CardLayout layout=(CardLayout)CardLayoutJPanel.getLayout();
       layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RoomStatus;
    private javax.swing.JTextField TxtUpdate;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton UpdateSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
