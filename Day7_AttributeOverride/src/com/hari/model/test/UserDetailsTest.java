package com.hari.model.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hari.model.Address;
import com.hari.model.UserDetails;

public class UserDetailsTest {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s         = sf.openSession();
		
		UserDetails user = new UserDetails();
		
		Address add1  = new Address();
		add1.setStreet("User1_Street");
		add1.setCity("User1_City");
		add1.setPincode("User1_Pincode");
		
		Address add2  = new Address();
		add2.setStreet("User2_Street");
		add2.setCity("User2_City");
		add2.setPincode("User2_Pincode");
		
		user.setUserName("sreeharivaleti");
		user.setHomeAddress(add1);
		user.setOfficeAddress(add2);
		
		Transaction beginTransaction = s.beginTransaction();
		s.save(user);
		beginTransaction.commit();
		s.close();
		
		s = sf.openSession();
		beginTransaction = s.beginTransaction();
		user =(UserDetails)s.get(UserDetails.class, 1);
		System.out.println(user);
		s.close();
		
		
	}

}
