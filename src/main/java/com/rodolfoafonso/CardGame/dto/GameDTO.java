package com.rodolfoafonso.CardGame.dto;

import com.rodolfoafonso.CardGame.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class GameDTO {
    private Long id ;
    private Boolean active ;
    private User user;

}
