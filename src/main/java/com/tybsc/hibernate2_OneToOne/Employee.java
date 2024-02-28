package com.tybsc.hibernate2_OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee
{
	@Id
	private int id;
	
	private String firstName;
	private String lastName;
	private int salary;
	
	@OneToOne
	private Address address;
	
	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String firstName, String lastName, int salary, Address address)
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", address=" + address + "]";
	}

	

}
