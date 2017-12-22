package com.sci.basicAuth.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicAuthController {

	@RequestMapping(value = "/secure/user/{userId}")
	@ResponseBody
	public void notify(HttpServletRequest request,
			HttpServletResponse response, @PathVariable String userId)
			throws Exception {
		try {
			System.out.print("-----------------------User passed security test-----------------------------");

		} catch (Exception ex) {

		}
	}
	
	@RequestMapping(value = "/test")
	public String test()
			throws Exception {
		return "test";
	}
	@ResponseBody
	@RequestMapping(value = "/test1")
	public String test1()
			throws Exception {
		return "test";
	}
}
