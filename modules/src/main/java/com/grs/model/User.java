package com.grs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "user_details")
public class User {

	@Id
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_firstname")
	private String firstName;
	@Column(name = "user_lastname")
	private String lastName;
	@Column(name = "user_email")
	private String email;
	@Column(name = "user_mobile")
	private long mobile;
	@Column(name = "user_password")
	private String password;
}
