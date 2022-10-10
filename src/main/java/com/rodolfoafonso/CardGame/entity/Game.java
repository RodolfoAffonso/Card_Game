package com.rodolfoafonso.CardGame.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Game {
    @Id
    @Column(name = "id")
    private Long id ;
    @Column(name = "active")
    private Boolean active ;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "username")
    private User user;
}
