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
    protected int customerId;
    protected String customerName;
    protected String customerAddress;
    protected String customerEmail;
    protected int customerPhoneNo;
    
    //setters
    public void setCustomerID(int customerId) {
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
    
    //methods
    private int noCustomerAdded;
    public void addCustomer(){
        noCustomerAdded ++;
    }
    public void deleteCustomer(){
        noCustomerAdded --;
    }
    public String displayAddedCustomers(){
        return "Number of customers added: " + noCustomerAdded;
    }
    public String displayCustomerDetails(){
        return
                "customer id is:" + getCustomerId() + "\n" +
                "getCustomerName" + getCustomerName() + "\n" +
                "getCustomerAddress" + getCustomerAddress() + "\n" +
                "getCustomerEmail" + getCustomerEmail() + "\n" +
                "getCustomerPhoneNo" + getCustomerPhoneNo();
    }
}
