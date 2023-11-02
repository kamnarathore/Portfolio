package com.crud.entity;

public class Student {
	String kodId;
	String name;
	String batch;
	@Override
	public String toString() {
		return "Student [kodId=" + kodId + ", name=" + name + ", batch=" + batch + "]";
	}
	public String getKodId() {
		return kodId;
	}
	public void setKodId(String kodId) {
		this.kodId = kodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public Student(String kodId, String name, String batch) {
		super();
		this.kodId = kodId;
		this.name = name;
		this.batch = batch;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
