package com.rodolfoafonso.CardGame.service;

import com.rodolfoafonso.CardGame.dto.ImdbResponseDTO;
import com.rodolfoafonso.CardGame.dto.MoviesDTO;
import com.rodolfoafonso.CardGame.entity.Movie;
import com.rodolfoafonso.CardGame.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@Service
public class MovieService {

    private final RestTemplate restTemplate;

    private final MovieRepository movieRepository;

    public void carregarMovies() {
        String uri = "https://imdb-api.com/en/API/Top250Movies/k_j50wh0x1";
        ResponseEntity<ImdbResponseDTO> response = restTemplate.getForEntity(uri, ImdbResponseDTO.class);
        List<MoviesDTO> movies = response.getBody().getItems();
        for (MoviesDTO moviesDTO : movies) {
            log.info("Filme-" + moviesDTO.getTitle());
            Movie movie = new Movie(moviesDTO.getId(), moviesDTO.getTitle(), moviesDTO.getImDbRating(), moviesDTO.getImDbRatingCount());
            this.movieRepository.save(movie);
        }

    }

    public MovieService(RestTemplate restTemplate, MovieRepository movieRepository) {
        this.restTemplate = restTemplate;
        this.movieRepository = movieRepository;
    }
}
