package com.personalsite.spring.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.personalsite.spring.mail.MailSender;

// @RestController
@Controller // To use JSP files instead of methods only
public class RootController {
	
	private MailSender mailSender;
	
	@Autowired
	public RootController(MailSender mailSender){
		this.mailSender = mailSender; 
	}
	
	
	/*@RequestMapping("/")
	// @ResponseBody to use @Controller and use a method as a view instead of a JSP
	public String home() throws MessagingException{
		mailSender.send("artu_jose@yahoo.com.mx", "Saludos", "Hola Arturo");
		return "HelloWorld !!!";
	}*/
	
	@RequestMapping("/signup")
	public String signup(Model model){ // Model injected into the App
		model.addAttribute("name","Arturo Diaz");
		return "signup";
	}
	
}