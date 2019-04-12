package controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pojo.User;

@Controller
public class RegistController {
	
	@RequestMapping(value="/check", method=RequestMethod.GET)
	public String registInit(User user, Model model) {
		model.addAttribute("user",user);
		return "check";
	}
	
	@RequestMapping(value="/regist", method=RequestMethod.POST)
	public String regist(@Valid User user, Errors errors, Model model) {
		if(errors.hasErrors()) {
			return "check";
		}
		model.addAttribute("user", user);
		return "welcome";
	}
}
