package com.rodolfoafonso.CardGame.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Question {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @ManyToOne
    @JoinColumn(name = "movie1_id", referencedColumnName = "id")
    private Movie movie1;
    @ManyToOne
    @JoinColumn(name = "movie2_id", referencedColumnName = "id")
    private Movie movie2;
    @ManyToOne
    @JoinColumn(name = "game_id" , referencedColumnName = "id")
    private Game game ;
    @ManyToOne
    @JoinColumn(name = "response", referencedColumnName = "id")
    private Movie response;


}
