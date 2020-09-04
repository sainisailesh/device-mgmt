package com.mycompany.devicemgmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AngularController {
	
	@GetMapping("/")
	public String home(Model model) {
        return "forward:/index.html";
	}
	
	@GetMapping("/devices")
	public String devices(Model model) {
        return "forward:/index.html";
	}
	

}
