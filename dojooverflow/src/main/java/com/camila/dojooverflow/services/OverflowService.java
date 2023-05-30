package com.camila.dojooverflow.services;

import org.springframework.stereotype.Service;

import com.camila.dojooverflow.repositories.AnswerRepository;
import com.camila.dojooverflow.repositories.QuestionRepository;
import com.camila.dojooverflow.repositories.TagQuestionRepository;
import com.camila.dojooverflow.repositories.TagRepository;

@Service
public class OverflowService {
	private final AnswerRepository answerRepository;
	private final QuestionRepository questionRepository;
	private final TagRepository tagRepository;
	private final TagQuestionRepository tagQuestionRepotory;
	
	public OverflowService(AnswerRepository answerRepository, QuestionRepository questionRepository, TagRepository tagRepository, TagQuestionRepository tagQuestionRepository) {
		this.answerRepository = answerRepository;
		this.questionRepository = questionRepository;
		this.tagRepository = tagRepository;
		this.tagQuestionRepository = tagQuestionRepository;
	}

}
