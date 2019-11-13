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
    private double moviePrice = 100;
    private double percentageDiscount = 0;
    
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
    

//    public void insertMovies(String movieName,int noMovies){
//        System.out.println("add new movies " + movieName);
//        System.out.println("no of copies " + noMovies);
//    }
//    public void deleteMovies(String movieName){
//        System.out.println("deleting old movies" + movieName);
//    }    
//    public void checkNoOfMovies(int noMovies){        
//        System.out.println("movies are available in stock" + noMovies);
//    }
    
    //methods
    public void setMoviePriceForMember(){
        this.moviePrice -= (getMoviePrice() * (percentageDiscount / 100));
    }
    public String displayMovieDetails(){
        return
                "Movie Id is: " + getMovieId() + "\n" +
                "Movie Name: " + getMovieName() + "\n" +
                "Movie Type: " + getMovieType() + "\n" +
                "No Of Movies: " + getNoOfMovies() + "\n" +
                "Movie Price: " + getMoviePrice();
    }
}
