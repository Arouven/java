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
   
    
    //method
    int noMemberAdded;
    public void addMember(){
        noMemberAdded ++;
    } 
    public String displayAddedMembers(){
        return "Number of members added: " + noMemberAdded;
    }
    public String displayMemberDetails(){
      return getCustomerName()+" "+getCustomerAddress();
    }
}
