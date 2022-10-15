package com.rodolfoafonso.CardGame.repository;

import com.rodolfoafonso.CardGame.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
