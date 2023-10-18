package com.infinite.webs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {

	
	@RequestMapping("/disp")
	public String pharma()
	{
	
		System.out.println("pharma...");
		return "bbc";
	}
}
