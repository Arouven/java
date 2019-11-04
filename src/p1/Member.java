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
public class Member extends Customer {//a member is a customer with special offer
    //var
    private double percentageDiscount;

    //constructors
    public Member() {//default constructor
        this.percentageDiscount = 5;
    }
    
    //getter
    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    //setter
    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
    
    //method
    
}
