/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdmin;

import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Rooms.Rooms;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrutikasalian
 */
public class ManageRooms extends javax.swing.JPanel {

    /**
     * Creates new form ManageRooms
     */
    JPanel CardLayoutJPanel;
    private Ecosystem business;
    private UserAccount account;
    private Hospital hospital;
    String RoomType;
    int rooms_quan;
    public ManageRooms(JPanel CardLayoutJPanel,Ecosystem business,UserAccount account) {
        initComponents();
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.business=business;
        this.account=account;
        this.hospital=(Hospital) this.account.getDetails();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        RoomsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(138, 194, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(79, 133, 151));

        RoomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room Type", "Number of Rooms", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RoomsTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, 290));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE ROOMS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      /*Rooms room1 = new Rooms();
      room1.setRoomType(RoomType);
      rooms_quan = Integer.parseInt(Txtrooms.getText());
      room1.setRoomQuantity(rooms_quan);
      room1.setHospital(hospital);
      Rooms room = hospital.addRooms(room1);
      populateTable();
      JOptionPane.showMessageDialog(null, "Room Added");*/
      
      AddRooms adr = new AddRooms(CardLayoutJPanel, business, hospital);
      CardLayoutJPanel.add("CreateDepartmentJPanel", adr);
      CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
      layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RoomsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        ArrayList<Rooms> roomDirectory = hospital.getRoomDirectory();
                
        int rowCount = RoomsTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)RoomsTable.getModel();
        
        
        for(Rooms r : roomDirectory ) {
            Object row[] = new Object[3];
            row[0] = r.getRoomType();
            row[1] = r.getRoomQuantity();
            model.addRow(row);
        }
    }
}