package com.stackroute.optionaldemos;

import java.util.List;
import java.util.Optional;

import com.stackroute.optionaldemos.model.Employee;
import com.stackroute.optionaldemos.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class MainApp {
	
	
    public static void main( String[] args ) throws Exception{

    	String text = "Welcome";
    	
    	System.out.println(Optional.ofNullable(text).isEmpty());
    	System.out.println(Optional.of(text).isPresent());
    
    	text = null;
    	
    	System.out.println(Optional.ofNullable(text).isEmpty());
    	System.out.println(Optional.of(text).isEmpty());
    	System.out.println(Optional.of(text).isPresent());
    	
    
    	
    }
    
}
