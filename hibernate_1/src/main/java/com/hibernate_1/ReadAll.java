package com.hibernate_1;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ReadAll {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=sc.nextLine();
		System.out.println("Enter the id:");
		int id=sc.nextInt();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("unit1");
	    EntityManager manager=factory.createEntityManager();
	    //Query q=manager.createQuery("from Employee");
	    //Query q=manager.createQuery("from Employee where emp_name=:ename AND id=:eid");
	    Query q=manager.createQuery("from Employee where salary<5000");
	    //q.setParameter("ename",name);
	    //q.setParameter("eid",id);
	    List employees=q.getResultList();
	    int count=0;
	    if(employees.size()==0)    // OR use this  -> .isEmpty()
	    {
	    	System.out.println("no record found");
	    }
	    else
	    {
	    	for(Object a:employees)
	    	{
	    		System.out.println(a);
	    		count++;
	    	}
	    }System.out.println("tables has "+count+"record");
	}
}
