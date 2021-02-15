package com.hari.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.hari.hibernate.dto.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee empobj = new Employee();
		
		empobj.setEmployeeid(003);
		empobj.setEmployeeName("sreehari");
		empobj.setDesignation("Prin.SoftwareEngineer");
		
		SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
		 Session openSession = buildSessionFactory.openSession();
		 openSession.beginTransaction();
		 openSession.save(empobj);
		 openSession.getTransaction().commit();
		 openSession.close();

		 openSession = buildSessionFactory.openSession();
		 openSession.beginTransaction();
		 Employee retrievedEmpObj = (Employee)openSession.get(Employee.class, 003);
		 
		 System.out.println(retrievedEmpObj);
		 retrievedEmpObj = (Employee)openSession.get(Employee.class, 003);
		 
		 System.out.println(retrievedEmpObj);
		 
	}

}
