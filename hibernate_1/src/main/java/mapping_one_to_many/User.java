package mapping_one_to_many;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
public class User {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmployeeId(2);
		emp.setEmpName("Sumit");
		emp.setSalary(40000);
		
		Laptop lap1=new Laptop();
		lap1.setLaptopId(103);
		lap1.setBrand("HP");
		lap1.setPrice(60000);
		lap1.setEmployee(emp);
		
		Laptop lap2=new Laptop();
		lap2.setLaptopId(104);
		lap2.setBrand("Dell");
		lap2.setPrice(30000);
		lap2.setEmployee(emp);
		
		List<Laptop> laptops=new ArrayList<Laptop>();
		laptops.add(lap1);
		laptops.add(lap2);
		
		emp.setLaptops(laptops);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("unit1");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		//manager.persist(lap1);
		//manager.persist(lap2);
		manager.persist(emp);
		transaction.commit();
	
	}
}
