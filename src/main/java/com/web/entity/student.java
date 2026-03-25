package com.web.entity;

public class student {

	private int id;
	private String name;
	private double marks;
	private int rollnum;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", marks=" + marks + ", rollnum=" + rollnum + "]";
	}
	
	
}
