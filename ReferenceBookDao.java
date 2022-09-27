package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.ReferenceBook;


public class ReferenceBookDao {
	public ReferenceBook saveReferenceBook(ReferenceBook referenceBook) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		if(referenceBook!=null) {
		entityTransaction.begin();
		entityManager.persist(referenceBook);
		entityTransaction.commit();
		return referenceBook;
		}
		else {
			System.out.println("Book Object Is Null");
			return null;
		}
	}
	
	public ReferenceBook findReferenceBook(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		ReferenceBook referenceBook=entityManager.find(ReferenceBook.class,id);
		return referenceBook;	
	}
	public boolean deleteReferenceBook(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		ReferenceBook referenceBook=entityManager.find(ReferenceBook.class, id);
		if(referenceBook!=null) {
		entityTransaction.begin();
		entityManager.remove(referenceBook);
		entityTransaction.commit();
		return true;
		}
		else {
			System.out.println("Book with input id not exist");
			return false;
		}
	}
	public ReferenceBook updateReferenceBook(ReferenceBook referenceBook) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
	
		entityTransaction.begin();
		entityManager.merge(referenceBook);
		entityTransaction.commit();
		return referenceBook;
	}
}
