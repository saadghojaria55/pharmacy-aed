/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Administration;
import Business.Ambulance.Ambulance;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
/**
 *
 * @author saad
 */
public class AdminDirectory {
    private ArrayList<Admin> adminDirectory;
    public AdminDirectory()
    {
        adminDirectory=new ArrayList<Admin>();
    }
    public ArrayList<Admin> getAdminDirectory() {
        return adminDirectory;
    }
    public void setAdminDirectory(ArrayList<Admin>adminDirectory)
    {
                this.adminDirectory = adminDirectory;

    }
        public void deleteAdmin(String adminId, Ecosystem system){
            for (Admin a : adminDirectory) {
                if (a.getAdmindId().equals(adminId)) {
                    adminDirectory.remove(a);
                }
            }
        }

}
