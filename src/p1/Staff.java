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
    
    int noSalePerform = 0;
    int noCustomerAdded = 0;
    int noMemberAdded = 0;
    //methods
    public int performSales(int movieNo){        
        noSalePerform ++;
        System.out.println("performing a sale. num of sales is "+noSalePerform);
        return movieNo--;
    }
    public void addCustomer(){
        noCustomerAdded ++;
        System.out.println("add a customer. num customer addes: "+noCustomerAdded);
    }
    public void addMember(){
        noMemberAdded++;
        System.out.println("add a new member. num of mem added: "+noMemberAdded);
    }   
    public void insertMovies(String movieName,int noMovies){
        System.out.println("add new movies "+movieName);
        System.out.println("no of copies "+noMovies);
    }
    public void deleteMovies(String movieName){
        System.out.println("deleting old movies"+movieName);
    }    
    public void checkNoOfMovies(int noMovies){        
        System.out.println("movies are available in stock"+noMovies);
    }
    
    
    public void displayStaffDetails(){
        System.out.println("staff id is:" + getStaffId());
        System.out.println("getStaffName"+getStaffName());
        System.out.println("getStaffAddress"+getStaffAddress());
        System.out.println("getStaffEmail"+getStaffEmail());
        System.out.println("getStaffPhoneNo"+getStaffPhoneNo());
    }
}
