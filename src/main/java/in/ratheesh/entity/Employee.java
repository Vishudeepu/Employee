package in.ratheesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String gender;
	private long contactNo;
	
	public Employee() {
		
	}
	
	public Integer getId() {
		return id;
		
	}
	public void setId(Integer id) {
		this.id =id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", contactNo=" + contactNo + "]";
	}

	public Employee(Integer id, String name, String gender, long contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.contactNo = contactNo;
	}
	
	
	
		}
	

