package com.rodolfoafonso.CardGame;

import com.rodolfoafonso.CardGame.service.MovieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CardGameApplication {

	private final MovieService movieService ;

	public CardGameApplication(MovieService movieService) {
		this.movieService = movieService;
	}

	public static void main(String[] args) {
		SpringApplication.run(CardGameApplication.class, args);

	}
	@PostConstruct
	public void carregaMovie(){
		this.movieService.carregarMovies();

	}

}
