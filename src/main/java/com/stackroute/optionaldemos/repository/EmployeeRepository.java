package com.stackroute.optionaldemos.repository;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.optionaldemos.model.Employee;

public class EmployeeRepository {

	List<Employee> emplist = new ArrayList<Employee>();
	
	public List<Employee> getAllEmployees(){
		return emplist;
	}
	
	public Employee getEmployeeById(String empid){
		for(Employee e1: emplist) {
			if(e1.getEmpid().equals(empid)){
				return e1;
			}
		}
		
		return null;
	}
	
	public List<Employee> addEmployee(Employee emp){
		emplist.add(emp);
		return emplist;
	}
	
	
}
