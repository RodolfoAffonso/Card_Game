package com.rodolfoafonso.CardGame.dto;

import com.rodolfoafonso.CardGame.entity.Game;
import com.rodolfoafonso.CardGame.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class QuestionDTO {
    private Long id ;
    private Movie movie1;
    private Movie movie2;
    private Game game ;
    private Movie result;

}
