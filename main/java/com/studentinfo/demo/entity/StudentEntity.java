package com.studentinfo.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  //indicates entity class
@Table(name="Student") //used to specify table name
public class StudentEntity {
	
	
@Id  //unique keys
@GeneratedValue(strategy=GenerationType.IDENTITY) //used to insert data to DB
private int id;
private String name;
private String branch;
private int marks;
private long aadharno;

public void setId(int id) {
		this.id=id;
	}
public int getId() {
	return id;
    }

public void setName(String name) {
	this.name=name;
	}
public String getName() {
	return name;
   }

public void setBranch(String branch) {
	this.branch=branch;
   }
public String getBranch() {
		return branch;
   }
public void setMarks(int marks) {
		this.marks=marks;
	}
public int getMarks() {
		return marks;
	}

public void setAadharno(long aadharno) {
		this.aadharno=aadharno;
	}
	public long getAadharno() {
		return aadharno;
	}
}

