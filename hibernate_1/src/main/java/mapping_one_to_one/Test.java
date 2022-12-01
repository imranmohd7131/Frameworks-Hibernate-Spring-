package mapping_one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		Person p1=new Person(1,"Gopal",18);
		Aadhar a1=new Aadhar();
		a1.setAadharId(101);
		a1.setAadharNumber(987654321);
		a1.setPerson(p1);
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("unit1");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(p1);
		manager.persist(a1);
		transaction.commit();
	}
}
