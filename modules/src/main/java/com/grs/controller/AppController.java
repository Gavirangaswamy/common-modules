package com.grs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grs.dao.RegisterDAOImpl;
import com.grs.model.User;
import com.grs.service.LoginService;
import com.grs.service.RegisterService;

@Controller
public class AppController {

	@Autowired
	RegisterDAOImpl impl;
	@Autowired
	RegisterService registerService;
	@Autowired
	LoginService loginService;

	@PostMapping("/save.do")
	public ModelAndView saveUserInfo(String firstname, String lastname, String password, long phone, String userid,
			String email, String cnfpassword) {
		User user = new User();
		user.setEmail(email);
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setMobile(phone);
		user.setUserName(userid);
		user.setPassword(password);
		ModelAndView modelAndView = new ModelAndView();
		if (registerService.validateUser(userid) && registerService.validatePassword(password, cnfpassword)) {
			impl.saveUser(user);
			modelAndView.setViewName("registrationsuccess");
			modelAndView.addObject("lastname", lastname);
			modelAndView.addObject("firstname", firstname);
			return modelAndView;
		} else {
			modelAndView.setViewName("register");
			return modelAndView;
		}

	}
	
	@PostMapping("/login.do")
	public ModelAndView validateUserlogin(String password,String userid) {
		ModelAndView modelAndView = new ModelAndView();
		if (loginService.validateUser(userid,password)) {
			modelAndView.setViewName("home");
			return modelAndView;
		} else {
			modelAndView.setViewName("login");
			return modelAndView;
		}
	}

}
