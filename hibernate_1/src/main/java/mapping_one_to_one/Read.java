package mapping_one_to_one;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Read {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Person Id:");
		int id=sc.nextInt();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("unit1");
	    EntityManager manager=factory.createEntityManager();
	    Person p1=manager.find(Person.class, id);
	    Query q = manager.createQuery("from Aadhar where person = :idd");
	    
	    q.setParameter("idd", p1);
	     
	    List li=q.getResultList();
	    for(Object a:li)
	    {
	    	System.out.println(a);
	    }
		
	}
}
