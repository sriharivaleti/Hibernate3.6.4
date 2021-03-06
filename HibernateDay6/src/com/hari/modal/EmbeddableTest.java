package com.hari.modal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbeddableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		UserDetails user = new UserDetails();
		
		Address     userAdd = new Address();
		userAdd.setAddress1("Sri Srinivasam");
		userAdd.setAddress2("plotno7");
		userAdd.setAddress3("roadno3");
		
		user.setUsername("sreehari");
		user.setPhonenumber("9790802226");
		user.setAddress(userAdd);
		
		s.beginTransaction();
		s.save(user);
		s.getTransaction().commit();
		s.close();
		
		s = sf.openSession();		
		s.beginTransaction();		
		user = (UserDetails)s.get(UserDetails.class, 1);
		System.out.println(user);
		
	}

}
