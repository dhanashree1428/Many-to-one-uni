package com.jsp.person.account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EntityManagerFactory entityManagerFactory=
Persistence.createEntityManagerFactory("vikas");

EntityManager entityManager=entityManagerFactory.createEntityManager();

EntityTransaction  entityTransaction=entityManager.getTransaction();

Person person=new Person();
person.setName("Dhanashree");
person.setEmail("dhanashree@mail.com");
person.setCno(930704563l);

Account account1=new Account();
account1.setBank_name("BOI");
account1.setIfsc_code("BOI56646546");
account1.setAcc_no(1234567890);

Account account2=new Account();
account2.setBank_name("SBI");
account2.setIfsc_code("SBI12346546");
account2.setAcc_no(1234561234l);

account1.setPerson(person);
account2.setPerson(person);

entityTransaction.begin();
entityManager.persist(person);
entityManager.persist(account1);
entityManager.persist(account2);
entityTransaction.commit();
	}

}
