package com.stackroute.optionaldemos;

import java.util.List;
import java.util.Optional;

import com.stackroute.optionaldemos.model.Employee;
import com.stackroute.optionaldemos.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class MainApp2 {
	
    public static void main( String[] args ){

    	Employee newEmp1 = new Employee("e101","Amit","Software Engineer");
    	Employee newEmp2 = new Employee("e102","Vikas","Developer");
    	Employee newEmp3 = new Employee("e103","Bharat","Engineer");
    	
    	EmployeeService empService = new EmployeeService();
    	empService.addEmployee(newEmp1);
    	empService.addEmployee(newEmp2);
    	List<Employee> latestemplist = empService.addEmployee(newEmp3);
    	
    	for(Employee emp: latestemplist) {
    		System.out.println(emp);
    	}
    
    	Employee empData = empService.getEmployeeById("e101");
    	
    	Optional<Employee> opt = Optional.ofNullable(empData);
    	
    	// To check for Non-Null value
    	if(opt.isPresent()) {
    		System.out.println(opt.get());
    		
    	}else {
    		System.out.println("Emp Details not found");
    	}

    	Employee empData1 = empService.getEmployeeById("e001");
    	
    	opt = Optional.ofNullable(empData1);

    	// To check for null value
    	if(opt.isEmpty()) {
    		System.out.println("Emp Details not found");
    	}else {
    		System.out.println(opt.get());
    	}
    	
    	
    }
    
    
    
}
