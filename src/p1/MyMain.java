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
public class MyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiating objects
        Staff st1 = new Staff();
        
        Customer cus1 = new Customer();// for new customer //default will set address to the location of the videoclub    
        
        Member mem1 = new Member();// for new customer member
        
        Movie mov1 = new Movie();
        
        Sales sal1 = new Sales();
        
        st1.setStaffId(1);
        st1.setStaffName("staff name john");
        st1.setStaffPhoneNo(7777777);
        st1.setStaffAddress("staff addr mauritius");
        st1.setStaffEmail("staff email myemail.com");
        
        
        //staff creates new customer
        cus1.setCustomerID(1);
        cus1.setCustomerName("customer name john");
        cus1.setCustomerPhoneNo(888888);
        cus1.setCustomerAddress("customer addr mauritius");
        cus1.setCustomerEmail("customer email myemail.com");
        
        
        //staff create member
        mem1.setCustomerID(1);
        mem1.setCustomerName("member name smith");
        mem1.setCustomerPhoneNo(999999);
        mem1.setCustomerAddress("member addr mauritius");
        mem1.setCustomerEmail("member email myemail.com");
        mem1.setPercentageDiscount(10.0);
        
        
        //staff adding a movie
        mov1.setMovieId(1);
        mov1.setMovieName("movie name john wick");
        mov1.setMovieType("movie type is action");
        mov1.setNoOfMovies(10);
        
        
        //staff making sales
        sal1.setSalesId(1);
        sal1.setMovieId(1);
        sal1.setStaffId(1);
        sal1.setCustomerId(1);
        
        
        cus1.displayCustomerDetails();
        mem1.displayMemberDetails();
        mov1.displayMovieDetails();
        sal1.printReceipt();
        
        
        
        st1.performSales();
                
        st1.addCustomer();
            
        st1.addMember();

        st1.insertMovies("jean jean",100);
        
        st1.deleteMovies("movie name john wick");
        
        st1.checkNoOfMovies(200);
        
        st1.displayStaffDetails();
        
        mov1.displayMovieDetails();
        
        
    
        System.exit(0);
    }
    
}
