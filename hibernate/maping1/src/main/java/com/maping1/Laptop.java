package com.maping1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Laptop {
	@Id
	int modelnum;
	String brand;
	@ManyToOne
	Employee emp;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int modelnum, String brand, Employee emp) {
		super();
		this.modelnum = modelnum;
		this.brand = brand;
		this.emp = emp;
	}
	public int getModelnum() {
		return modelnum;
	}
	public void setModelnum(int modelnum) {
		this.modelnum = modelnum;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	

}
