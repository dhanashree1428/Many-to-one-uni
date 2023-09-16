package com.jsp.hospital.branch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospitalBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EntityManagerFactory entityManagerFactory=
Persistence.createEntityManagerFactory("vikas");

EntityManager entityManager=entityManagerFactory.createEntityManager();

EntityTransaction entityTransaction=entityManager.getTransaction();

Hospital hospital=new Hospital();
hospital.setName("KEM");
hospital.setEmail("kem@mail.com");
hospital.setLocation("Parel");

Branch branch1=new Branch();
branch1.setName("OPD");
branch1.setFloor("3th");

Branch branch2=new Branch();
branch2.setName("OT");
branch2.setFloor("5th");

Branch branch3=new Branch();
branch3.setName("IP");
branch3.setFloor("6th");

branch1.setHospital(hospital);
branch2.setHospital(hospital);
branch3.setHospital(hospital);

entityTransaction.begin();
entityManager.persist(hospital);
entityManager.persist(branch1);
entityManager.persist(branch2);
entityManager.persist(branch3);
entityTransaction.commit();
	}

}
