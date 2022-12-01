package mapping_one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadhar {
	@Id
	private int aadharId;
	private long aadharNumber;
	@OneToOne
	private Person person;    //creating refernce varibale of person class
	@Override
	public String toString() {
		return "Aadhar [aadharId=" + aadharId + ", aadharNumber=" + aadharNumber + ", person=" + person + "]";
	}
	public Aadhar() {
		
	}
	public Aadhar(int aadharId, long aadharNumber, Person person) {
		super();
		this.aadharId = aadharId;
		this.aadharNumber = aadharNumber;
		this.person = person;
	}
	public int getAadharId() {
		return aadharId;
	}
	public void setAadharId(int aadharId) {
		this.aadharId = aadharId;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
