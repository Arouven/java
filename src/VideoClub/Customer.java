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
public class Customer {//member parent class
    //vars
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private int customerPhoneNo;   
    private boolean member;
        
    public static int noOfCustomers = 0;//global var
    
    //constructor
    public Customer() {
        this.member = false;
    }
    
    //setters
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public void setCustomerPhoneNo(int customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }
    public void setMember(boolean member) {
        this.member = member;
    }

    //getters
    public int getCustomerId() {
        return customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public int getCustomerPhoneNo() {
        return customerPhoneNo;
    }
    public boolean isMember() {
        return member;
    }    
    
    //methods
    public static void addCustomer(){ 
        noOfCustomers ++;
        System.out.println("customer created.");
    }
    public static void deleteCustomer(){
        noOfCustomers --;
        System.out.println("customer deleted.");
    }
    public static String displayAddedCustomers(){
        return "Number of customers added: " + noOfCustomers;
    }
    public String displayCustomerDetails(){
        return
                "Customer id is: \t\t" + getCustomerId() + "\n" +
                "Customer Name: \t" + getCustomerName() + "\n" +
                "Customer Address: \t" + getCustomerAddress() + "\n" +
                "Customer Email: \t" + getCustomerEmail() + "\n" +
                "Customer Phone No.: \t" + getCustomerPhoneNo() + "\n" +
                "Customer is a member: \t" + isMember() + "\n\n";
    }
}
