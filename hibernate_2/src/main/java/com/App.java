package com;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        College clg=new College();
        clg.setCollegeId(31);
        clg.setCollegeName("pggc46");
        clg.setLocation("chd");
        
        Student st=new Student();
        st.setStudentRoll(11);
        st.setStudentName("Saurabh");
        st.setAge(21);
        st.setCollege(clg);
        
        Student st2=new Student();
        st2.setStudentRoll(12);
        st2.setStudentName("Kuldeep");
        st2.setAge(20);
        st2.setCollege(clg);
        
        List<Student> l=new ArrayList<Student>();
        l.add(st);
        l.add(st2);
        
        clg.setStudents(l);
        
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("unit1");
        EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		manager.persist(clg);
		transaction.commit();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
        
    }
}
