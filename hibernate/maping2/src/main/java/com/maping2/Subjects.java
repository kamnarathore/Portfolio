package com.maping2;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Subjects {
	@Id
	int sId;
	String sName;
	@ManyToMany
	List<Trainers>trainers;
	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subjects(int sId, String sName, List<Trainers> trainers) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.trainers = trainers;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public List<Trainers> getTrainers() {
		return trainers;
	}
	public void setTrainers(List<Trainers> trainers) {
		this.trainers = trainers;
	}

}
