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
    //vars
    private int salesId;
    private int customerId;
    private int staffId;
    private int movieId;

    //setters
    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    
    //getters
    public int getSalesId() {
        return salesId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public int getStaffId() {
        return staffId;
    }
    public int getMovieId() {
        return movieId;
    }

    //method
    public void printReceipt(){
        System.out.println("receipt for: "+getCustomerId());
        System.out.println("staff id: "+getStaffId());
        System.out.println("movie id: "+getMovieId());
        System.out.println("sales id: "+getSalesId());
    }
}
