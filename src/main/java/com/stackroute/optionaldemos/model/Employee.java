package com.stackroute.optionaldemos.model;

public class Employee {

	private String empid;
	private String empname;
	private String designation;

	public Employee() {
		super();
	}

	
	public Employee(String empid, String empname, String designation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.designation = designation;
	}


	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", designation=" + designation + "]";
	}
	
	
	
}
