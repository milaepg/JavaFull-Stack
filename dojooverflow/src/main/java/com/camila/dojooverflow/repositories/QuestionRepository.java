package com.camila.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.camila.dojooverflow.models.Question;

@Repository

public interface QuestionRepository extends CrudRepository <Question, Long> {

}
