package com.jsp.employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

//		 Here we are writting HQL query in String SQL Format i.e.Custom Query 
		String sql = "SELECT e  FROM Employee e";
		Query query = entityManager.createQuery(sql);

//		It returns a list 
		List<Employee> employees = query.getResultList();
		for (Employee e : employees) {
			System.out.println("================================");
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getCno());
			System.out.println("================================");
		}

	}

}
