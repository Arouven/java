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
public class Customer {//member parent class
    //vars
    protected int customerID;
    protected String customerName;
    protected String customerAddress;
    protected String customerEmail;
    protected int customerPhoneNo;
    
    //constructors
    public Customer() {//default
    }  
    public Customer(int customerID) {
        this.customerID = customerID;
        this.customerAddress = "Tour Koenik";
    }
    public Customer(String customerName) {
        this.customerName = customerName;
        this.customerAddress = "Tour Koenik";
    }
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = "Tour Koenik";
    }
    public Customer(int customerID, String customerName, String customerAddress, String customerEmail, int customerPhoneNo) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhoneNo = customerPhoneNo;
    }

    
    
    
    //setters
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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

    //getters
    public int getCustomerID() {
        return customerID;
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
    
    //methods
    
}
