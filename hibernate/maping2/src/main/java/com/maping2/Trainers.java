package com.maping2;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Trainers {
	@Id
	int tId;
	String tName;
	@ManyToMany
	List<Subjects>subjects;
	public Trainers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainers(int tId, String tName, List<Subjects> subjects) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.subjects = subjects;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public List<Subjects> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

}
