package in.hcl.employeemanagementapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "Employee Name is required")
	@Column(name = "Employee_Name")
	private String name;
	@NotBlank(message = "Employee email_id is required")
	@Column(name = "Email_Id")
	private String email;
	@Column (name = "Salary")
	private String salary;
	private String address;
	@Column (name = "Mobile_Number")
	private String contact;
	private String designation;
	private String department;
	
	
	public Employee(@NotBlank(message = "Employee Name is required") String name,
			@NotBlank(message = "Employee email_id is required") String email, String salary, String address,
			String contact, String designation, String department) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.address = address;
		this.contact = contact;
		this.designation = designation;
		this.department = department;
	}
	
	public Employee() {
		super();
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}

	