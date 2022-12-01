package mapping_one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int laptopId;
	private String brand;
	private double price;
	@ManyToOne
	private Employee employee;
	
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", brand=" + brand + ", price=" + price + ", employee=" + employee
				+ "]";
	}
	public Laptop(int laptopId, String brand, double price, Employee employee) {
		super();
		this.laptopId = laptopId;
		this.brand = brand;
		this.price = price;
		this.employee = employee;
	}
	public Laptop() {
		
	}
	
	
	
}
