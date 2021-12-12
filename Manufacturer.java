/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import Business.ManuReq.ManuRequests;
import java.util.ArrayList;

/**
 *
 * @author srushtidesai
 */
public class Manufacturer { 
    private String ManuName;
    private String emailAddress;
    private String ManuId;
    private ArrayList<ManuRequests> Manureq;

        public Manufacturer(){
        Manureq =new ArrayList<ManuRequests>();
    }
    
    
    ItemDirectory itemDirectory;
    private String userName;
    String PhoneNumber;
    private String Password;
    
    public String getManuId() {
        return ManuId;
    }

    public void setManuId(String ManuId) {
        this.ManuId = ManuId;
    }   
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public String getManuName() {
        return ManuName;
    }

    public void setManuName(String manuName) {
        this.ManuName = manuName;
    }
    public ArrayList<ManuRequests> getManureq() {
        return Manureq;
    }

    public void setManureq(ArrayList<ManuRequests> Manureq) {
        this.Manureq = Manureq;
    }

    
   

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

   

    public ItemDirectory getItemDirectory() {
        return itemDirectory;
    }

    public void setItemDirectory(ItemDirectory itemDirectory) {
        this.itemDirectory = itemDirectory;
    }
    
   
    
    
    @Override
    public String toString()
    {
        return this.ManuName;
    }
    
}

    

