package autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class College {
	private String clgName;
	private String location;
	@Autowired
	private University university;
	
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	@Override
	public String toString() {
		return "College [clgName=" + clgName + ", location=" + location + ", university=" + university + "]";
	}
	public College(String clgName, String location, University university) {
		super();
		this.clgName = clgName;
		this.location = location;
		this.university = university;
	}
	public College() {
		super();
	}
	
	
}
