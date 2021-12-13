/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Saad Ghojaria
 */
public class Department {
    
    
    private String departmentId;
    private String departmentName;
    private String username;
    private String password;
    private Hospital hospital;
    private String departmentAdminName;
    private ArrayList<Doctor> doctorDirectory;
    
    public Department() {
        this.doctorDirectory = new ArrayList();    
    }
  
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAdminName() {
        return departmentAdminName;
    }

    public void setDepartmentAdminName(String departmentAdminName) {
        this.departmentAdminName = departmentAdminName;
    }
    
    public ArrayList<Doctor> getDoctorDirectory() {
        return this.doctorDirectory;
    }
   
    @Override()
    public String toString() {
        return this.departmentName;
    }
   
    // Add Doctor
    public Doctor addDoctor(Doctor d){
        d.setDoctorId(
                d.getDepartment().getHospital().getHospitalId()
                        + "-"
                        + d.getDepartment().getDepartmentId() 
                        + "-"
                        +"Doc"+(doctorDirectory.size()+1));
                
        doctorDirectory.add(d);
        return d;
    }
    
    //Delete Doctor
    public void deleteDoctor(String doctorId, Ecosystem system){
        // Remove the doctor from doctorList
        for(Doctor d: doctorDirectory) {
            if(d.getDoctorId().equals(doctorId)){
                doctorDirectory.remove(d);
            }
        }
        // Remove doctor from userAccountList
        for(UserAccount account: system.getUserAccountDirectory().getUserAccountList()) {
            if(account.getId().equals(doctorId)) {
                system.getUserAccountDirectory().getUserAccountList().remove(account);
            }
        }
    }
    
    public void removeAllDoctors(Ecosystem system){
        // Remove all the doctors from doctorList
        for(Doctor d: doctorDirectory) {
            deleteDoctor(d.getDoctorId(), system);
        }
        this.doctorDirectory = new ArrayList();
        
    }
    
}
