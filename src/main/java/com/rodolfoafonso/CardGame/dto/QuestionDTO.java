package com.rodolfoafonso.CardGame.dto;

import com.rodolfoafonso.CardGame.entity.Game;
import com.rodolfoafonso.CardGame.entity.Movies;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class QuestionDTO {
    private Long id ;
    private Movies movie1;
    private Movies movie2;
    private Game game ;
    private Movies result;

}
