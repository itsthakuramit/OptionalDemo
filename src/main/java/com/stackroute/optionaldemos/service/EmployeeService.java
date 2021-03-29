package com.stackroute.optionaldemos.service;

import java.util.List;

import com.stackroute.optionaldemos.model.Employee;
import com.stackroute.optionaldemos.repository.EmployeeRepository;

public class EmployeeService {

	EmployeeRepository emprepo = new EmployeeRepository();

	public List<Employee> getAllEmployees(){
		return emprepo.getAllEmployees();
	}
	
	public Employee getEmployeeById(String empid){
		return emprepo.getEmployeeById(empid);
	}
	
	public List<Employee> addEmployee(Employee emp){
		return emprepo.addEmployee(emp);
	}
	
	
}
