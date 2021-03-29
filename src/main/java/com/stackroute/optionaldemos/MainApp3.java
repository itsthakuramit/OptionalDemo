package com.stackroute.optionaldemos;

import java.util.List;
import java.util.Optional;

import com.stackroute.optionaldemos.model.Employee;
import com.stackroute.optionaldemos.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class MainApp3 {
	
    public static void main( String[] args ){

    	Employee newEmp1 = new Employee("e101","Amit","Software Engineer");
    	Employee newEmp2 = new Employee("e102","Vikas","Developer");
    	Employee newEmp3 = new Employee("e103","Bharat","Engineer");
    	
    	Employee defaultData = new Employee("e000","default","default");
    	EmployeeService empService = new EmployeeService();
    	empService.addEmployee(newEmp1);
    	empService.addEmployee(newEmp2);
    	List<Employee> latestemplist = empService.addEmployee(newEmp3);
    	
    	for(Employee emp: latestemplist) {
    		System.out.println(emp);
    	}
    
    	Employee empData = empService.getEmployeeById("e101");
    	
    	Optional<Employee> opt = Optional.ofNullable(empData);
    
    	opt.ifPresent((emp1) -> System.out.println(emp1.getEmpname()));
    	
    	Employee empData1 = empService.getEmployeeById("e001");
    	Employee newemp = Optional.ofNullable(empData1).orElse(defaultData);
    	System.out.println(newemp);
    	
    	
    	
    
    	
    	
    	
    	
    }
    
}
