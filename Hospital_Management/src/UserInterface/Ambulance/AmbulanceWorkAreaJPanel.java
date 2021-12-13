/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Ambulance;

import Business.Ambulance.Ambulance;
import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import UserInterface.LoginJPanel;
import java.awt.CardLayout;

import javax.swing.JPanel;

/**
 *
 * @author shrutikasalian
 */
public class AmbulanceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AmbulanceWorkAreaJPanel
     */
    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    private UserAccount account;
    private Ambulance ambulance;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public AmbulanceWorkAreaJPanel(JPanel CardLayoutJPanel , UserAccount account, Ecosystem business) {

         initComponents();
         
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
        
        this.ambulance = (Ambulance) account.getDetails();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rideRequestBtn = new javax.swing.JButton();
        ambulanceinfoBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        rightSystemAdminPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(138, 194, 211));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setPreferredSize(new java.awt.Dimension(1800, 900));

        systemAdminPanel.setBackground(new java.awt.Color(215, 81, 81));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1780, Short.MAX_VALUE)
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2424, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rideRequestBtn.setText("Ride Requests");
        rideRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rideRequestBtnActionPerformed(evt);
            }
        });
        jPanel3.add(rideRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        ambulanceinfoBtn.setText("Ambulance Information");
        ambulanceinfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulanceinfoBtnActionPerformed(evt);
            }
        });
        jPanel3.add(ambulanceinfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        logOutBtn.setBackground(new java.awt.Color(204, 204, 204));
        logOutBtn.setText("Logout");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        jPanel3.add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/BKG3_1.jpg"))); // NOI18N
        rightSystemAdminPanel.add(jLabel1, "card2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(systemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(systemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rideRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rideRequestBtnActionPerformed
        // TODO add your handling code here:

        RideRequestJPanel rideRequestJPanel = new RideRequestJPanel(rightSystemAdminPanel,business,account, ambulance);
        rightSystemAdminPanel.add("RideRequestJPanel", rideRequestJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_rideRequestBtnActionPerformed

    private void ambulanceinfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulanceinfoBtnActionPerformed
        // TODO add your handling code here:
        AmbulanceInfoJPanel ambulanceInfoJpanel = new AmbulanceInfoJPanel(rightSystemAdminPanel, this.ambulance);
        rightSystemAdminPanel.add("AmbulanceInfoJpanel", ambulanceInfoJpanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_ambulanceinfoBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(business);
        LoginJPanel loginJPanel = new LoginJPanel(CardLayoutJPanel, business,"");
        CardLayoutJPanel.add("LoginJPanel", loginJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_logOutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambulanceinfoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton rideRequestBtn;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}