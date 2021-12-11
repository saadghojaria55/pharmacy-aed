/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Ambulance.Ambulance;
import java.util.ArrayList;

/**
 *
 * @author shrutikasalian
 */
public class AmbulanceRequest {
    
    ArrayList<Ambulance> ambulanceReq;

    public ArrayList<Ambulance> getAmbulanceReq() {
        return ambulanceReq;
    }

    public void setAmbulanceReq(ArrayList<Ambulance> ambulanceReq) {
        this.ambulanceReq = ambulanceReq;
    }
    Hospital hospital;
    static int id;
    private static int count=1;
    
    public AmbulanceRequest(){
        this.ambulanceReq=new ArrayList();
        id=count;
        count++;
    }
    public Ambulance addAmbulanceReq(Ambulance sos){
        ambulanceReq.add(sos);
        return sos;
    }
    public static int getId(){
        return id;
    }
    
           
}
