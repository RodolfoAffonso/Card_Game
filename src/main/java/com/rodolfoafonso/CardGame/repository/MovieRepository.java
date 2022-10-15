package com.rodolfoafonso.CardGame.repository;

import com.rodolfoafonso.CardGame.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, String> {
}
