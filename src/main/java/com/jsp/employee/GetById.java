package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;

public class GetById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Employee employee = entityManager.find(Employee.class, 2);

		System.out.println(employee.getName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getCno());

	}

}
