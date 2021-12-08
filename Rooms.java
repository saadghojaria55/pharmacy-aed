/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Rooms;

import Business.Hospital.Hospital;

/**
 *
 * @author shrutikasalian
 */
public class Rooms {
    private String RoomType;
    private int RoomQuantity;
    private Hospital hospital;
    
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        this.RoomType = roomType;
    }

    public Integer getRoomQuantity() {
        return RoomQuantity;
    }

    public void setRoomQuantity(Integer roomQuantity) {
        this.RoomQuantity = roomQuantity;
    }
    @Override
    public String toString() {
        return this.RoomType;
    }
   
    
}
