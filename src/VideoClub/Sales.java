/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoClub;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author arouven
 */
public class Sales {
    //vars
    private int salesId;
    private String currentDate;
    
    private static int noSalePerform = 0;    
    
    //associative objects
    public Customer customerObj = new Customer();
    public Staff staffObj = new Staff();
    public Movie movieObj = new Movie();

    
    //setters
    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }
    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }
    
    //getters
    public int getSalesId() {
        return salesId;
    }   
    public String getCurrentDate() {
        return currentDate;
    }
    
    
    //method    
    public String totalSales(){
        return "The total Movies sold is: " + Integer.toString(noSalePerform);
    }
    public String performSales(int noMoviesBought){
        if(customerObj.isMember() == true){//default for all members is 20%
            movieObj.setPercentageDiscount(20);
            movieObj.setMoviePriceForMember();
            
            noSalePerform += noMoviesBought;
            movieObj.setNoOfMovies(movieObj.getNoOfMovies() - 1);
        }
        else{
            noSalePerform += noMoviesBought;
            movieObj.setNoOfMovies(movieObj.getNoOfMovies() - 1);            
        }
        System.out.println("no of sales perform " + noSalePerform);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");  
        Date date = new Date();  
        String x = formatter.format(date); 
        setCurrentDate(x);
        return printReceipt();        
    }
    public String printReceipt(){
        return
            "Sales id: " + getSalesId() + "\t\t"+ getCurrentDate() + "\n" +                
                
            "Receipt for customer id: " + customerObj.getCustomerId() +"\n" +
            "Mr(s)" + customerObj.getCustomerName() + "\n" +
            "Member " + customerObj.isMember() +"\n" +

            "Staff id: " + staffObj.getStaffId() + "\n" +
            "Perform by: " + staffObj.getStaffName() + "\n" +

            "Movie id: " + movieObj.getMovieId() +"\n" +
            "Movie name: " + movieObj.getMovieName() +"\n" +                    
            "Percentage discount " + movieObj.getPercentageDiscount() +" %\n" +
            "Price: " + movieObj.getMoviePrice() +"\n\n";
    }
}
