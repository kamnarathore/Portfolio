package com.maping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	int emp_id;
	String name ;
	float salary;
	@OneToOne
	Assest asset_id;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int emp_id, String name, float salary, Assest asset_id) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.asset_id = asset_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Assest getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(Assest asset_id) {
		this.asset_id = asset_id;
	}
	
		// TODO Auto-generated method stub
		
	
	

}
