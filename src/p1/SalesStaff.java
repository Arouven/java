/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author arouven
 */
public class SalesStaff {
    //vars
    private int staffId;
    private String staffName;
    private String staffAddress;
    private String staffEmail;
    private int staffPhoneNo;
    
    //setters and getters
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
    public void performSales(){
        System.out.println("performing a sale");
    }
    public void addCustomer(){
        System.out.println("add a customer");
    }
    public void insertMovies(){
        System.out.println("add new movies");
    }
    public void deleteMovies(){
        System.out.println("deleting old movies");
    }
    public void checkStockMovies(){
        System.out.println("movies are available in stock");
    }
    
}
