package com.example.cst438assignment1;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long>{

  @Query("select m from Movie m order by movieTitle asc, time desc")
  List<Movie> findAllMoviesOrderByTitleDateDesc();

}
