package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
//		Fetches All Info from persistence file
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

//		Performs Database Operations
		EntityManager entityManager = entityManagerFactory.createEntityManager();

//		It is the key to begin and close the connection
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employee = new Employee();

		employee.setName("ABC");
		employee.setEmail("abc@gmail.com");
		employee.setCno(123456789);

		entityTransaction.begin();
		entityManager.persist(employee); // this will accept entity type of obj i.e.@Entity obj
		entityTransaction.commit();

	}

}
