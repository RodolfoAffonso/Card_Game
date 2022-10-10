package com.rodolfoafonso.CardGame.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MoviesDTO {

    private Long id ;
    private String title ;
    private Double ranking ;
    private Long vote ;

}
