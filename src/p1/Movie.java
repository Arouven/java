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
public class Movie {
    //vars
    private int movieId;
    private String movieName;
    private String movieType;
    private int noOfMovies;

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
    
    //methods
    public void displayMovieDetails(){
        System.out.println("getMovieId is:" + getMovieId());
        System.out.println("getMovieName"+getMovieName());
        System.out.println("getMovieType"+getMovieType());
        System.out.println("getNoOfMovies"+getNoOfMovies());
    }
}
