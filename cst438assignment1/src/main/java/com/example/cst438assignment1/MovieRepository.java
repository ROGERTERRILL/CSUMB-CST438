package com.example.cst438assignment1;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long>{
    @Query("select m from Movie m order by title, date desc")
    List<Movie> findAll();
}
