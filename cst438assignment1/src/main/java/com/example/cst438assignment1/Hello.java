package com.example.cst438assignment1;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {

  @Autowired
  MovieRepository movieRepository;

  @GetMapping("/movies")
  public String hello(Model model) {
    Iterable<Movie> movies = movieRepository.findAll();
    model.addAttribute("movies", movies);
    return "movie_list";
  }

  @PostMapping("/movies/new")
  public String processPersonForm(@Valid Movie movie,
      BindingResult result,
      Model model) {
    if (result.hasErrors()) {
      return "movie_form";
    }

    movieRepository.save(movie);
    Iterable<Movie> movies = movieRepository.findAll();
    model.addAttribute("movies", movies);
    return "movie_list";
  }

  @GetMapping("/movies/new")
  public String createPerson(Model model) {
    Movie movie = new Movie();
    model.addAttribute("movie", movie);
    return "movie_form";
  }
}
