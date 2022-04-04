package com.grs.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grs.model.User;

@Component
public class RegisterDAOImpl implements RegisterDAO {

	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public void saveUser(User user) {
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			session.getTransaction().begin();
			session.save(user);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		System.out.println("User saved");
	}



}
