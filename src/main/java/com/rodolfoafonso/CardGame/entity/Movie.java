package com.rodolfoafonso.CardGame.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Movie {
    @Id
    @Column(name = "id")
    private String id ;
    @Column(name = "title")
    private String title ;
    @Column(name = "ranking")
    private Double ranking ;
    @Column(name = "vote")
    private Long vote ;
}
