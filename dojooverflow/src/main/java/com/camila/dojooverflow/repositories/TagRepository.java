package com.camila.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.camila.dojooverflow.models.TagQuestion;

@Repository
public interface TagRepository extends CrudRepository <TagQuestion, Long> {

}
