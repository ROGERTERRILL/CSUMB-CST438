package com.example.cst438assignment1;

import java.util.Date;
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

  private String time;

  public Movie() {
    movieTitle = null;
    movieRating = null;
    nameOfPerson = null;
    time = null;
  }

  public Movie(long id, String movieTitle, Integer movieRating, String nameOfPerson) {
    this.id = id;
    this.time = null;
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

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }
}
