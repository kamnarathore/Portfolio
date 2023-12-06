package com.maping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Assest {
	@Id
	int assest_id;
	String assest_type;
	@OneToOne
	Employee emp;
	public Assest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Assest(int assest_id, String assest_type, Employee emp) {
		super();
		this.assest_id = assest_id;
		this.assest_type = assest_type;
		this.emp = emp;
	}
	

}
