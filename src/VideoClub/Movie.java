/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideoClub;

/**
 *
 * @author arouven
 */
public class Movie {
    //vars
    private int movieId;
    private String movieName;
    private String movieType;
    private int noOfMovies;
    private double moviePrice;
    private double percentageDiscount;

    //constructor
    public Movie() {
        this.moviePrice = 100;
        this.percentageDiscount = 0;
    }
    
    
    //setters
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }
    public void setNoOfMovies(int noOfMovies) {
        this.noOfMovies = noOfMovies;
    }  
    public void setMoviePrice(double moviePrice) {
        this.moviePrice = moviePrice;        
    }
    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    //getters
    public int getMovieId() {
        return movieId;
    }
    public String getMovieName() {
        return movieName;
    }
    public String getMovieType() {
        return movieType;
    }
    public int getNoOfMovies() {
        return noOfMovies;
    }
    public double getMoviePrice() {
        return moviePrice;
    }
    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    
    //methods
    public void setMoviePriceForMember(){//call is sales class
        this.moviePrice -= (getMoviePrice() * (percentageDiscount / 100));
    }
    public String displayMovieDetails(){
        return
                "Movie Id is: " + getMovieId() + "\n" +
                "Movie Name: " + getMovieName() + "\n" +
                "Movie Type: " + getMovieType() + "\n" +
                "No Of Movies: " + getNoOfMovies() + "\n" +
                "Movie Price: " + getMoviePrice() + "\n\n";
    }
}
