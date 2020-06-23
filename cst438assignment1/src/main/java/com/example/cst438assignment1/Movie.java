package com.example.cst438assignment1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {

  @Id
  @GeneratedValue
  private long id;

  private String movieTitle;

  private Integer movieRating;

  private String nameOfPerson;

  public Movie() {

  }

  public Movie(long id, String movieTitle, Integer movieRating, String nameOfPerson) {
    super();
    this.movieTitle = movieTitle;
    this.movieRating = movieRating;
    this.nameOfPerson = nameOfPerson;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getMovieTitle() {
    return movieTitle;
  }

  public void setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
  }

  public Integer getMovieRating() {
    return movieRating;
  }

  public void setMovieRating(Integer movieRating) {
    this.movieRating = movieRating;
  }

  public String getNameOfPerson() {
    return nameOfPerson;
  }

  public void setNameOfPerson(String nameOfPerson) {
    this.nameOfPerson = nameOfPerson;
  }

}
