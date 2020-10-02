package com.asish.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int a, @RequestParam("t2") int b) {

		// No need of HttpServlet request and response
//		int a = Integer.parseInt(req.getParameter("t1"));
//		int b = Integer.parseInt(req.getParameter("t2"));
		int c = a + b;

		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", c);

		return mv;
	}

}
