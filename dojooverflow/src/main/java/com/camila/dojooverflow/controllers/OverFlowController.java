package com.camila.dojooverflow.controllers;

import javax.validation.Valid;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/questions")
public class OverFlowController {
private final OverFlowService overFlowService;
	
	public OverFlowController(OverFlowService overflowService) {
		this.overFlowService = overflowService;
	}
	
	@GetMapping("")
	public String questionsDashboard() {
		return "views/index.jsp";
	}
	
	@GetMapping("/new")
	public String newQuestions(@ModelAttribute("questionObject") Question question) {
		return "views/new.jsp";
	}
	
	@PostMapping("/addquestion")
	public String addQuestion(@RequestParam("tagReq") String tags, @Valid @ModelAttribute("questionObject") Question question, BindingResult result) {
		
		return "redirect:/views/new.jsp";
	}

}
