package com.tinhcao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping(value = "/login")
	public String login() {
		System.out.println("In The Login Method");
		return "login";
	}
}
