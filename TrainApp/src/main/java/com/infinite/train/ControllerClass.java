package com.infinite.train;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	@RequestMapping("/login1")
	public String login() {

		return "login";
	}

	@RequestMapping("/show1")
	public String login1() {

		return "details";
	}
	@RequestMapping("/login2")
	public String login2() {

		return "login";
	}
	@RequestMapping("/logout")
	public String login3() {

		return "login";
	}
	
}
