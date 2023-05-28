package com.camila.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

@Controller
public class ResultController {
	public String results(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
        Integer count = (Integer) session.getAttribute("count");
		count += 1;
		session.setAttribute("count", count);
		return "/results.jsp";
	}
}
