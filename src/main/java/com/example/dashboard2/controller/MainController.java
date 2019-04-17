package com.example.dashboard2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@Value("${homepage.message}")
	String homePageMsg;

	@GetMapping("/")
	public String showHomePage(Model model){
		model.addAttribute("message", homePageMsg);
		return "home-page";
	}
	
	@GetMapping("/example")
	public String showExampleCharts(){
		return "chart-chartist";
	}
}
