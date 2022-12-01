package mapping_one_to_many;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class T {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Person Id : ");
	int id = sc.nextInt();
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
	EntityManager manager = factory.createEntityManager();
	Employee p1 = manager.find(Employee.class, id);
	Query q = manager.createQuery("from Laptop where employee = :idd");
		q.setParameter("idd", p1);
		List l = q.getResultList();
		
		for(Object p : l)
		{
			System.out.println(p);
		}
}
}
