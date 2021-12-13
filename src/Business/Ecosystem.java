/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Ambulance.AmbulanceFleet;
import Business.Doctor.DoctorDirectory;
import Business.Hospital.HospitalDirectory;
import Business.Lab.LabDirectory;
import Business.Manufacturer.Manufacturer;
import Business.Manufacturer.ManufacturerDirectory;
import Business.Patient.PatientDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.SOSRequest.SOSRequests;
import java.util.ArrayList;


/**
 *
 * @author Saad Ghojaria
 */
public class Ecosystem extends HealthCarePortal {
    
    private static Ecosystem business;
   
    private HospitalDirectory hospitalDirectory = new HospitalDirectory();
    private PatientDirectory patientDirectory = new PatientDirectory();
    private DoctorDirectory doctorDirectory = new DoctorDirectory();
    private PharmacyDirectory pharmacyDirectory = new PharmacyDirectory();
    private LabDirectory labDirectory = new LabDirectory();
    private ManufacturerDirectory manufacturerDirectory= new ManufacturerDirectory();

    private AmbulanceFleet ambulancefleet = new AmbulanceFleet();
    

    

    // Making ecosystem singleton
    public static Ecosystem getInstance() {
        if(business == null){
            business = new Ecosystem();
        }
        return business;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
   
    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }
    
     public LabDirectory getLabDirectory() {
        return labDirectory;
    }

    public void setLabDirectory(LabDirectory labDirectory) {
        this.labDirectory = labDirectory;
    }

    public AmbulanceFleet getAmbulancefleet() {
        return ambulancefleet;
    }

    public void setAmbulancefleet(AmbulanceFleet ambulancefleet) {
        this.ambulancefleet = ambulancefleet;
    }
    
    public ManufacturerDirectory getManufacturerDirectory() {
        return manufacturerDirectory;
    }

    public void setManufacturerDirectory(ManufacturerDirectory manufacturerDirectory) {
        this.manufacturerDirectory = manufacturerDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private Ecosystem(){
        super(null);
    }

    public boolean checkIfUserIsUnique(String userName){
       return false;
    }

}
