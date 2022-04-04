package com.grs.service;

import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class RegisterService {

	public boolean validateUser(String userid) {
		if (Objects.nonNull(userid) && !userid.isEmpty())
			return true;

		return false;
	}

	public boolean validatePassword(String password, String cnfPassword) {
		if (Objects.nonNull(password) && Objects.nonNull(cnfPassword) && !password.isEmpty()
				&& !cnfPassword.isEmpty()) {
			if (password.equals(cnfPassword)) {
				return true;
			}
		}
		return false;
	}

}
