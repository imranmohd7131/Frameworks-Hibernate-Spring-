package mapping_one_to_many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Employee_details")
public class Employee {

	@Id
	private int employeeId;
	private String empName;
	private double salary;
	
	@OneToMany( mappedBy ="employee",cascade =CascadeType.ALL)
	private List<Laptop> laptops;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName + ", salary=" + salary +  "]";
	}

	public Employee(int employeeId, String empName, double salary, List<Laptop> laptops) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.salary = salary;
		this.laptops = laptops;
	}

	public Employee() {
		
	}
	
}
