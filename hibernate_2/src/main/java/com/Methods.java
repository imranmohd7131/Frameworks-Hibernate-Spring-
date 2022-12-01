package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Methods {
	Scanner sc=new Scanner(System.in);
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	public void add() {
		System.out.println("Enter college id:");
		int cId=sc.nextInt();
		System.out.println("Enter college name:");
		String cName=sc.next();
		System.out.println("Enter your college location");
		String cLoc=sc.next();
		
		System.out.println("Enter student roll no:");
		int sRoll=sc.nextInt();
		System.out.println("Enter student age:");
	    int sAge=sc.nextInt();
		System.out.println("Enter student name");
		String sName=sc.next();
		
		College cl=new College();
		cl.setCollegeId(cId);
		cl.setCollegeName(cName);
		cl.setLocation(cLoc);
		
		Student st=new Student();
		st.setStudentRoll(sRoll);
		st.setAge(sAge);
		st.setStudentName(sName);
		st.setCollege(cl);
		
		List<Student> li=new ArrayList<Student>();
		li.add(st);
		
		cl.setStudents(li);
		transaction.begin();
		manager.persist(cl);
		transaction.commit();
	}
	
	public void readStudent()
	{
		System.out.println("Enter College id:");
		int id=sc.nextInt();
		College cl=manager.find(College.class, id);
		Query q=manager.createQuery("from Student where college =:ph");
		q.setParameter("ph", cl);
		List li=q.getResultList();
		for(Object o:li)
		{
			System.out.println(o); 
		}
	}
	
	public void readCollege()
	{
		System.out.println("Enter College id:");
		int id=sc.nextInt();
		College cl=manager.find(College.class, id);
		Query q=manager.createQuery("from College where collegeId =:ph");
		q.setParameter("ph", cl);
		List li=q.getResultList();
		for(Object o:li)
		{
			System.out.println(o); 
		}
	}
}

