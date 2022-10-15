package com.rodolfoafonso.CardGame.repository;

import com.rodolfoafonso.CardGame.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game , Long> {

}
