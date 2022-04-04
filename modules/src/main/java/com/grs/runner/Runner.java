package com.grs.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grs.dao.RegisterDAOImpl;
import com.grs.model.User;

public class Runner {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context =  new ClassPathXmlApplicationContext("context.xml");
		
		User employee = new User();
		
		
		RegisterDAOImpl impl = context.getBean(RegisterDAOImpl.class);

	}
}
