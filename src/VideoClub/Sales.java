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
    
    public static int noSalePerform = 0;//global var
    
    //associative objects
    public Customer customerObj = new Customer();
    public Staff staffObj = new Staff();
    public Movie movieObj = new Movie();

    //setters
    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }
    
    //getters
    public int getSalesId() {
        return salesId;
    }    
    
    //method    
    public String totalSales(){           
        return "total sales for the day is " + noSalePerform;        
    }
    public String printReceipt(int noMoviesBought){
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
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        System.out.println(formatter.format(date));  
    
        return
            "Sales id: " + getSalesId() + "\n"+
            formatter.format(date) + "\n\n" +                
                
            "Receipt for customer id: " + customerObj.getCustomerId() +"\n" +
            "\t\tMr(s)" + customerObj.getCustomerName() + "\n\n" +
            "\t\tMember " + customerObj.isMember() +"\n\n" +

            "Staff id: " + staffObj.getStaffId() + "\n" +
            "\t\tPerform by: " + staffObj.getStaffName() + "\n\n" +

            "Movie id: " + movieObj.getMovieId() +"\n" +
            "Movie name: " + movieObj.getMovieName() +"\n" +                    
            "\t\tPercentage discount " + movieObj.getPercentageDiscount() +" %\n\n" +
            "Price: " + movieObj.getMoviePrice() +"\n\n";
    }
}
