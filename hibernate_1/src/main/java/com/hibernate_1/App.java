package com.hibernate_1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
    	/*Student ob=new Student(1,2,"Kuldeep");
    	EntityManagerFactory factory=Persistence.createEntityManagerFactory("unit1");
        EntityManager manager=factory.createEntityManager();
        EntityTransaction transaction=manager.getTransaction();
        try
        {
        transaction.begin();
        manager.persist(ob);
        transaction.commit();
        }catch(Exception e)
        {
        	System.out.println("Duplicate record");
        }*/
    	
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter roll no");
    	int r=sc.nextInt();
    	EntityManagerFactory factory=Persistence.createEntityManagerFactory("unit1");
        EntityManager manager=factory.createEntityManager();
        Student s1=manager.find(Student.class, r);
        if(s1==null)
        {
        	System.out.println("Data doesn't Exits");
        }
        else
        {
        System.out.println(s1);
        }
    }
}
