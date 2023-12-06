package com.creation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	int modelnum;
	String brand;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int modelnum, String brand) {
		super();
		this.modelnum = modelnum;
		this.brand = brand;
	}

}
