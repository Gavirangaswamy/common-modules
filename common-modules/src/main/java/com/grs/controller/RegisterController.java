package com.grs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grs.dao.RegisterDAOImpl;
import com.grs.model.User;

@Controller
public class RegisterController {

	@Autowired
	RegisterDAOImpl impl;

	@PostMapping("/save.do")
	public ModelAndView saveUserInfo(String firstname, String lastname, String password, long phone, String userid,
			String email) {
		User user = new User();
		user.setEmail(email);
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setMobile(phone);
		user.setUserName(userid);
		user.setPassword(password);
		impl.saveUser(user);
		ModelAndView modelAndView = new ModelAndView("registrationsuccess");
		modelAndView.addObject("lastname", lastname);
		return modelAndView;

	}

}
