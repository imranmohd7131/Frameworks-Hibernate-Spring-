package com.hibernate_1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your id");
	int id=sc.nextInt();
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("unit1");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Emp emp1=manager.find(Emp.class, id);
	try{
		 transaction.begin();
	     manager.remove(emp1);
	     transaction.commit();
	   }catch(Exception e)
    	{
	    	 System.out.println("data not exist");
	    }
  }
}
