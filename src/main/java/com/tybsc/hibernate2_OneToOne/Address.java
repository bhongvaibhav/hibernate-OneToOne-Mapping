package com.tybsc.hibernate2_OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address 
{
	@Id
	private int id;
	
	private String city;
	private String state;
	private String country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String city, String state, String country) {
		super();
		this.id=id;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
	

}
