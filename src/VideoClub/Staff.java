/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoClub;

/**
 *
 * @author arouven
 */
public class Staff {
    //vars
    private int staffId;
    private String staffName;
    private String staffAddress;
    private String staffEmail;
    private int staffPhoneNo;
    
    //setters
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }
    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }
    public void setStaffPhoneNo(int staffPhoneNo) {
        this.staffPhoneNo = staffPhoneNo;
    }
    
    //getters
    public int getStaffId() {
        return staffId;
    }
    public String getStaffName() {
        return staffName;
    }
    public String getStaffAddress() {
        return staffAddress;
    }
    public String getStaffEmail() {
        return staffEmail;
    }
    public int getStaffPhoneNo() {
        return staffPhoneNo;
    }
    
    //methods
    public String displayStaffDetails(){
        return 
                "Staff id is: " + getStaffId() + "\n" +
                "Staff Name is: " + getStaffName() + "\n" +
                "Staff Address is: " + getStaffAddress() + "\n" +
                "Staff Email is: " + getStaffEmail() + "\n" +
                "Staff Phone No. :" + getStaffPhoneNo() + "\n\n";
    }
}
