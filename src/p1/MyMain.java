/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import javax.swing.JOptionPane;

import static p1.Customer.addCustomer;
import static p1.Customer.deleteCustomer;
import static p1.Customer.displayAddedCustomers;

/**
 *
 * @author arouven
 */
public class MyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiating objects
        Staff staff1 = new Staff();
        
        Customer customer1 = new Customer();// for new customer //default will set address to the location of the videoclub    
        
        Member memember1 = new Member();// for new customer member
        
        Movie movie1 = new Movie();
        
        Sales sales1 = new Sales();
        
        
        //creating new staff  
        staff1.setStaffId(Integer.parseInt(JOptionPane.showInputDialog("Input staff id(interger)")));
        staff1.setStaffName(JOptionPane.showInputDialog("Input staff name(string)"));
        staff1.setStaffPhoneNo(Integer.parseInt(JOptionPane.showInputDialog("Input staff phone no(interger)")));
        staff1.setStaffAddress(JOptionPane.showInputDialog("Input staff address(string)"));
        staff1.setStaffEmail(JOptionPane.showInputDialog("Input staff email(string)"));
        JOptionPane.showMessageDialog(null, staff1.displayStaffDetails());//display staff details
        
        
        
        //creating new movie
        movie1.setMovieId(Integer.parseInt(JOptionPane.showInputDialog("Input movie id(interger)")));
        movie1.setMovieName(JOptionPane.showInputDialog("Input movie name(string)"));
        movie1.setMovieType(JOptionPane.showInputDialog("Input movie type(string)"));
        movie1.setNoOfMovies(Integer.parseInt(JOptionPane.showInputDialog("Input number of movies to be added(interger)")));
        movie1.setPercentageDiscount(0);
        JOptionPane.showMessageDialog(null, movie1.displayMovieDetails());//display movie details
        
        
        
        //creating new customer
        customer1.setCustomerId(Integer.parseInt(JOptionPane.showInputDialog("Input customer id(interger)")));
        customer1.setCustomerName(JOptionPane.showInputDialog("Input customer name(string)"));
        customer1.setCustomerPhoneNo(Integer.parseInt(JOptionPane.showInputDialog("Input customer phone no(interger)")));
        customer1.setCustomerAddress(JOptionPane.showInputDialog("Input customer address(string)"));
        customer1.setCustomerEmail(JOptionPane.showInputDialog("Input customer email(string)"));
        customer1.setMember(true);
        addCustomer();//adding 1 to customer
        JOptionPane.showMessageDialog(null, customer1.displayCustomerDetails());//display customer details
        
       
        
        
        
        //creating new sales
        sales1.setSalesId(1);

        
        JOptionPane.showMessageDialog(null, sales1.printReceipt());
        
         
        
        JOptionPane.showMessageDialog(null, displayAddedCustomers());
        
        
        //to delete a customer
        deleteCustomer();
        
        
        //at the end of the day display all customers added
        JOptionPane.showMessageDialog(null, displayAddedCustomers());
        
        JOptionPane.showMessageDialog(null, sales1.totalSales());
    
        System.exit(0);
    }
    
}
