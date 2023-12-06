package com.hiber;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="My_FBike")
public class Bike {
	@Id
	@Column(name="platenum")
	int modelnum;
	@Column(name = "Company_name")
	String brand;
	@Column(name = "Price")
	int cost;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int modelnum, String brand, int cost) {
		super();
		this.modelnum = modelnum;
		this.brand = brand;
		this.cost = cost;
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [modelnum=" + modelnum + ", brand=" + brand + ", cost=" + cost + "]";
	}
	

}
