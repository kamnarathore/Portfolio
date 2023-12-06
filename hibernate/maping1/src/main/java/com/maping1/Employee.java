package com.maping1;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Employee {
	@Id
	int emp_id;
	String name;
	float salary;
	@OneToMany
	List<Laptop>laptop;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int emp_id, String name, float salary, List<Laptop> laptop) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.laptop = laptop;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}

}
