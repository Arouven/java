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
public class Sales {
    private int salesId;
    private int customerId;
    private int staffId;

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getSalesId() {
        return salesId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getStaffId() {
        return staffId;
    }
    
    
    
    public void printReceipt(){
        System.out.println("take your receipt");
    }
}
