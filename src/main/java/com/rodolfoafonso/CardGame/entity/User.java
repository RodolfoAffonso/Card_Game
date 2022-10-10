package com.rodolfoafonso.CardGame.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class User {
    @Id
    @Column(name = "username")
    private String username ;
    @Column(name = "password")
    private String password ;
}
