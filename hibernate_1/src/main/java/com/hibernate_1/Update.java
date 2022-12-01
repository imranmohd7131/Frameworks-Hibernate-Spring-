package com.hibernate_1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println("Enter your salary:");
		double salary=sc.nextDouble();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("unit1");
	    EntityManager manager=factory.createEntityManager();
	    EntityTransaction transaction=manager.getTransaction();
	    Emp emp=manager.find(Emp.class,id);
	    emp.setSalary(salary);
	    try{
	    	 transaction.begin();
	         manager.persist(emp);
	         transaction.commit();
	         }catch(Exception e)
	         {
	        	 System.out.println(e.getMessage());
	         }
	}	
}
