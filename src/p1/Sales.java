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
            movieObj.setPercentageDiscount(20);
            movieObj.setMoviePriceForMember();
            
            noSalePerform ++;
            movieObj.setNoOfMovies(movieObj.getNoOfMovies() - 1);
            
            //movieObj.setMoviePrice(movieObj.getMoviePrice() - (movieObj.getMoviePrice() * (movieObj.getPercentageDiscount() / 100))); 
            
            
        }
        else{
            noSalePerform ++;
            movieObj.setNoOfMovies(movieObj.getNoOfMovies() - 1);
            
        }
            return
                "Receipt for customer id: " + customerObj.getCustomerId() +"\n" +
                "\t\tMr(s)" + customerObj.getCustomerName() + "\n\n" +
                "\t\tMember " + customerObj.isMember() +"\n\n" +
                
                "Staff id: " + staffObj.getStaffId() + "\n" +
                "\t\tPerform by: " + staffObj.getStaffName() + "\n\n" +
                
                "Movie id: " + movieObj.getMovieId() +"\n" +
                "Movie name: " + movieObj.getMovieName() +"\n" +                    
                "\t\tPercentage discount " + movieObj.getPercentageDiscount() +" %\n\n" +
                "Price: " + movieObj.getMoviePrice() +"\n\n\n" +
                
                
                "Sales id: " + getSalesId();
            
            
        
        
    }
}
