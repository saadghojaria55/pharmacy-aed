/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.Department.Department;
import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PhysicianRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.text.SimpleDateFormat;  


/**
 *
 * @author Saad Ghojaria
 */
public class PatientScheduleAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPageOneJPanel
     */
    
    private JPanel CardLayoutJPanel;
    private UserAccount account;
    private Ecosystem business;
    ArrayList <String> bookedSlot= new ArrayList();
    public PatientScheduleAppointmentJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.account=account;
        this.business = business;
        populateHopitalComboBox();
    }
    
    public void populateHopitalComboBox() {
        ArrayList<Hospital> hospitalList = business.getHospitalDirectory().getHospitalList();
        Hospital[] comboBoxModel1 = hospitalList.toArray(new Hospital[0]);
        hospitalNameComboBox.setModel(new DefaultComboBoxModel<Hospital>(comboBoxModel1));
    }
    
    public void populateTable(ArrayList<PhysicianRequest> appointments) {
        // populate all patients in patient directory
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(PhysicianRequest pr: appointments) {
            Object row[] = new Object[4];
            Doctor doctor = (Doctor) pr.getReceiver().getDetails();
            row[0] = doctor.getName();
            row[1] = doctor.getDepartment().getHospital().getName();
            row[2] = doctor.getDepartment().getDepartmentName();
            row[3] = pr.getTime();
            model.addRow(row);
        }
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        physicianNameCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        searchByHospitalName = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        hospitalNameComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        departmentlNameCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        booknowbtn = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        physicianNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physicianNameComboActionPerformed(evt);
            }
        });
        add(physicianNameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 200, -1));

        jLabel1.setText("Hospital: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 124, 27));

        searchByHospitalName.setText("Get available time slots");
        searchByHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByHospitalNameActionPerformed(evt);
            }
        });
        add(searchByHospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 190, -1));

        jLabel2.setText("Physician");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 124, 27));

        hospitalNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalNameComboBoxActionPerformed(evt);
            }
        });
        add(hospitalNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 200, -1));

        jLabel3.setText("Department: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 124, 27));

        departmentlNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentlNameComboActionPerformed(evt);
            }
        });
        add(departmentlNameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 200, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Physician", "Hospital", "Department", "Time Slot"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 810, 210));

        jLabel4.setText("Date");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 124, 27));

        booknowbtn.setText("Book Now");
        booknowbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booknowbtnActionPerformed(evt);
            }
        });
        add(booknowbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, -1, -1));

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(400, 250));
    dateChooserCombo1.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
    dateChooserCombo1.setCurrentNavigateIndex(0);
    add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void physicianNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physicianNameComboActionPerformed
        
    }//GEN-LAST:event_physicianNameComboActionPerformed

    private void searchByHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByHospitalNameActionPerformed
        // TODO add your handling code here:
        
        Hospital selectedHospital = (Hospital) hospitalNameComboBox.getSelectedItem();
        Department selectedDept = (Department) departmentlNameCombo.getSelectedItem();
        Doctor selectedDoctor = (Doctor) physicianNameCombo.getSelectedItem();
        String selectedDate = dateChooserCombo1.getSelectedDate().toString();
        if(selectedHospital == null || selectedDept == null ) 
        {
            JOptionPane.showMessageDialog(null, "Please select the hospital, departmnent and date");
            return;
        }
   if(selectedHospital == null || selectedDept == null || selectedDate == null) 
   {
          JOptionPane.showMessageDialog(null, "Please select the hospital, departmnent and date");
           return;
    }
  
        
 //  if(date1.before(new Date())) {
   //    JOptionPane.showMessageDialog(null, "Please select a valid date");
    //        return;
     // }
        ArrayList<PhysicianRequest> availableWorkRequests = new ArrayList();
        
        if(selectedDoctor == null) {
          
          for(Doctor d: selectedDept.getDoctorDirectory()) {              
             availableWorkRequests.addAll(this.getAvailablePhysicianSlots(d, selectedDate));
           }
          
        } else {
            
          availableWorkRequests = this.getAvailablePhysicianSlots(selectedDoctor, selectedDate);
            
        }
        
        populateTable(availableWorkRequests);
        

    }//GEN-LAST:event_searchByHospitalNameActionPerformed

    private void hospitalNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalNameComboBoxActionPerformed
        // TODO add your handling code here:
        Hospital selectedHospital = (Hospital) hospitalNameComboBox.getSelectedItem();
        ArrayList<Department> deptList = selectedHospital.getDepartmentDirectory();
        Department[] comboBoxModel = deptList.toArray(new Department[0]);
    //    System.out.print(deptList.toArray());
        departmentlNameCombo.setModel(new DefaultComboBoxModel<Department>(comboBoxModel));
     
    }//GEN-LAST:event_hospitalNameComboBoxActionPerformed

    private void departmentlNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentlNameComboActionPerformed
        // TODO add your handling code here:
        
        Department selectedDept = (Department) departmentlNameCombo.getSelectedItem();
        
        ArrayList<Doctor> doctorList = selectedDept.getDoctorDirectory();
        Doctor[] comboBoxModel2 = doctorList.toArray(new Doctor[0]);
        
        physicianNameCombo.setModel(new DefaultComboBoxModel<Doctor>(comboBoxModel2));
        
        
    }//GEN-LAST:event_departmentlNameComboActionPerformed

    private void booknowbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booknowbtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = jTable1.getSelectedRow();
       
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        Hospital selectedHospital = (Hospital) hospitalNameComboBox.getSelectedItem();
        Department selectedDept = (Department) departmentlNameCombo.getSelectedItem();
        Doctor selectedDoctor = (Doctor) physicianNameCombo.getSelectedItem();
        String selectedDate = dateChooserCombo1.getSelectedDate().toString();
        
        String timeSlot = (String) jTable1.getValueAt(selectedRow, 3);
        
        bookedSlot.add(timeSlot);
        UserAccount doctorAccount = business.getUserAccountDirectory().getUserById(selectedDoctor.getDoctorId());
        
        PhysicianRequest request = new PhysicianRequest();
        request.setReceiver(doctorAccount);
        request.setSender(account);
        request.setRequestDate(new Date());
        request.setStatus("pending physician approval");
        //request.setAppointmentDate(selectedDate);
        request.setTime(timeSlot);
        
        
        
        doctorAccount.getWorkQueue().getWorkRequestList().add(request);
        this.account.getWorkQueue().getWorkRequestList().add(request);
        
        JOptionPane.showMessageDialog(null, "Appointment sent for approval to physician");
        populateTable(new ArrayList());
    }//GEN-LAST:event_booknowbtnActionPerformed

    private ArrayList<PhysicianRequest> getAvailablePhysicianSlots (Doctor doctor, String selectedDate) {
        ArrayList<PhysicianRequest> availableWorkRequests = new ArrayList();
        ArrayList<PhysicianRequest> unavailableWorkRequests = new ArrayList();

        ArrayList<WorkRequest> existingRequests = this.business.getUserAccountDirectory().getUserById(doctor.getDoctorId()).getWorkQueue().getWorkRequestList();
        for(WorkRequest w : existingRequests) {
            
            if(w.getStatus().equals("pending physician approval") || w.getStatus().equals("physician accepted")) {
                PhysicianRequest pr = (PhysicianRequest) w;
              // if(pr.getAppointmentDate().getDate() == selectedDate.getDate()) {
                //    unavailableWorkRequests.add(pr);
             //   }
            }
        }
        for(int time = 8; time < 19; time++) {
            boolean isValid = true;
            for(PhysicianRequest pr: unavailableWorkRequests) {
                if(pr.getTime().equals(time + " - " + (time + 1))) {
                    isValid = false;
                    break;
                }
            }
            if(isValid) {
                PhysicianRequest newRequest = new PhysicianRequest();
                newRequest.setReceiver(this.business.getUserAccountDirectory().getUserById(doctor.getDoctorId()));
                try {
                    Date finaldate = new SimpleDateFormat("dd/mm/yyyy").parse(selectedDate);
                    newRequest.setAppointmentDate(finaldate);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

              
                newRequest.setRequestDate(new Date());
                newRequest.setSender(account);
                newRequest.setTime(time + " - " + (time + 1));

                availableWorkRequests.add(newRequest);
            }
        }
        return availableWorkRequests;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton booknowbtn;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JComboBox<Department> departmentlNameCombo;
    private javax.swing.JComboBox<Hospital> hospitalNameComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Doctor> physicianNameCombo;
    private javax.swing.JButton searchByHospitalName;
    // End of variables declaration//GEN-END:variables
}
