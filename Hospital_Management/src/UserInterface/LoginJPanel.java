/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class LoginJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Ecosystem business;
    private String role;
    UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public LoginJPanel(JPanel userProcessContainer, Ecosystem business, String role) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.role = role;
        this.business = business;
        jPanel2.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
               
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        btnLogoutLabel = new javax.swing.JLabel();
        greetingUserLabel = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        passlabel = new javax.swing.JLabel();
        loginJButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1300, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(204, 204, 255));
        leftPanel.setMinimumSize(new java.awt.Dimension(1338, 60));
        leftPanel.setPreferredSize(new java.awt.Dimension(1338, 60));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/icons8-macos-close-64.png"))); // NOI18N
        btnLogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogoutLabelMousePressed(evt);
            }
        });
        leftPanel.add(btnLogoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 60, 60));

        greetingUserLabel.setBackground(new java.awt.Color(204, 204, 255));
        greetingUserLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        leftPanel.add(greetingUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        container.setBackground(new java.awt.Color(51, 51, 51));
        container.setForeground(new java.awt.Color(31, 50, 97));
        container.setPreferredSize(new java.awt.Dimension(1338, 540));
        container.setLayout(new java.awt.CardLayout());
        add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 900));

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setFocusCycleRoot(true);
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1800, 900));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Picture/icons8-back-arrow-24.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Picture/icons8-person-48.png"))); // NOI18N

        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        passlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Picture/icons8-key-30.png"))); // NOI18N

        loginJButton.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(123, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(loginJButton)
                        .addContainerGap(87, Short.MAX_VALUE))))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 430, 320));

        jLabel2.setBackground(new java.awt.Color(195, 195, 195));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/cover1.jpeg"))); // NOI18N
        jLabel2.setAutoscrolls(true);
        jLabel2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLabel2.setPreferredSize(new java.awt.Dimension(2000, 1200));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, -130, 2030, 1090));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2000, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutLabelMousePressed
        //logout();
    }//GEN-LAST:event_btnLogoutLabelMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // TODO add your handling code here:

        String userName = userNameJTextField.getText();
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        user = business.getUserAccountDirectory().authenticateUser(userName, password);
        
        if(user != null) {
            jPanel2.setVisible(false);
            container.setVisible(true);
            leftPanel.setVisible(true);
            String greetings = "Hi";
            greetings = greetings + " " + user.getUsername();
            container.add("workArea", 
                    user.getRole().createWorkArea(container, user, business));
            greetingUserLabel.setText(greetings + " !!!");
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        } else {
           JOptionPane.showMessageDialog(null, "Please enter correct credentials");
        }
        userNameJTextField.setText("");
        passwordField.setText("");

    }//GEN-LAST:event_loginJButtonActionPerformed

    private void btnLogoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutLabelMouseClicked
        // TODO add your handling code here:
        dB4OUtil.storeSystem(business);
        System.out.println("clicked");
        jPanel2.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
    }//GEN-LAST:event_btnLogoutLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLogoutLabel;
    private javax.swing.JPanel container;
    private javax.swing.JLabel greetingUserLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel passlabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
