package com.hibernate_1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Methods {
	public void insert()
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the employee id:");
		//int id=sc.nextInt();
		System.out.println("Enter the employee Name:");
		//sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter your designation :");
		String designation=sc.nextLine();
		System.out.println("Enter your salary:");
		double salary=sc.nextDouble();
		Emp e1=new Emp();
		//e1.setId(id);
		e1.setEmp_name(name);
		e1.setDesignation(designation);
		e1.setSalary(salary);
	
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("unit1");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transition=manager.getTransaction();
		try {
         transition.begin();
         manager.persist(e1);
         transition.commit();
         }
         catch(Exception e) {
       	  System.out.println(e.getMessage());
         }
	}
	
	public void update()
	{
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
	
	public void read()
	{
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your id ");
    	int id=sc.nextInt();    	
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("unit1");
        EntityManager manager=factory.createEntityManager();
        Emp s1=manager.find(Emp.class,id);
        if(s1==null)
        {
    	  System.out.println("no record found.");
        }
        else
        {
    	  System.out.println(s1);
        }
	}
	
	public void delete()
	{
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