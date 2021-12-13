/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Lab.Lab;
import Business.UserAccount.UserAccount;
import UserInterface.Lab.LabSideNavWorkAreaJpanel;

import javax.swing.JPanel;

/**
 *
 * @author srushtidesai
 */
public class LabRole extends Role {
    public JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, Ecosystem business) {
        Lab lab = (Lab) account.getDetails();
        
        if(lab.getType().equals("Pathology Lab")) {
            return new LabSideNavWorkAreaJpanel(userProcessContainer, account, business, "Pathology Lab");
        }
        
        if(lab.getType().equals("Neurology Lab")) {
            return new LabSideNavWorkAreaJpanel(userProcessContainer, account, business, "Neurology Lab");
        }
        
        if(lab.getType().equals("Orthopedic Lab")) {
            return new LabSideNavWorkAreaJpanel(userProcessContainer, account, business, "Orthopedic Lab");
        }
        
        return null;
        
    }

   
}
