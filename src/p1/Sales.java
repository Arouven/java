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
    
    public static int noSalePerform = 0;
    
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
    public String printReceipt(){
        if(customerObj.isMember() == true){
            
            noSalePerform ++;
            movieObj.setNoOfMovies(movieObj.getNoOfMovies() - 1);
            
            movieObj.setMoviePrice(movieObj.getMoviePrice() - (movieObj.getMoviePrice() * (movieObj.getPercentageDiscount() / 100))); 
            
            return
                "receipt for: " + customerObj.getCustomerId() +"\n" +
                "\t\tmr(s)" + customerObj.getCustomerName() +"\n\n" +
                
                "staff id: " + staffObj.getStaffId() +"\n" +
                "\t\tperform by: " + staffObj.getStaffName() +"\n\n" +
                
                "movie id: " + movieObj.getMovieId() +"\n" +
                "movie name: " + movieObj.getMovieName() +"\n" +
                "price: " + movieObj.getMoviePrice() +"\n\n\n" +
                
                
                "sales id: " + getSalesId();
            
            
        }
        else{
            noSalePerform ++;
            movieObj.setNoOfMovies(movieObj.getNoOfMovies() - 1);
            
            return
                "receipt for: " + customerObj.getCustomerId() +"\n" +
                "\t\tmr(s)" + customerObj.getCustomerName() +"\n\n" +
                
                "staff id: " + staffObj.getStaffId() +"\n" +
                "\t\tperform by: " + staffObj.getStaffName() +"\n\n" +
                
                "movie id: " + movieObj.getMovieId() +"\n" +
                "movie name: " + movieObj.getMovieName() +"\n" +
                "price: " + movieObj.getMoviePrice() +"\n\n\n" +
                
                
                "sales id: " + getSalesId();
            
            
            
        }
        
    }
}
