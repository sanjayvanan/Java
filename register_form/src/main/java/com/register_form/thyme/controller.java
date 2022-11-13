package com.register_form.thyme;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {

	@GetMapping("/register")
	public String showform(Model model) {
		user user=new user();
		model.addAttribute("user",user);
		return "register_form";
	}
	@PostMapping("/register")
	public String submitform(@ModelAttribute("user")user user) {
		System.out.print(user);
		return "profile";
	}

	
}
