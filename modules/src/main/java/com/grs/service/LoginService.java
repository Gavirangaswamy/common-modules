package com.grs.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grs.dao.RegisterDAOImpl;
import com.grs.model.User;

@Service
public class LoginService {
	
	@Autowired
	RegisterDAOImpl daoImpl;

	public boolean validateUser(String userid, String password) {
		if (Objects.nonNull(userid) && !userid.isEmpty()) {
			User user = daoImpl.getUserByUserID(userid);
			if (user.getUserName().equals(userid) && user.getPassword().equals(password))
				return true;
		}
		return false;
	}

}
