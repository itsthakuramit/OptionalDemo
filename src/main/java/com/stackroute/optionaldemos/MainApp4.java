package com.stackroute.optionaldemos;

import java.util.List;
import java.util.Optional;

import com.stackroute.optionaldemos.model.Employee;
import com.stackroute.optionaldemos.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class MainApp4 {
	
	
    public static void main( String[] args ) throws Exception{

    	String text = "Welcome";
    	
    	String defaultText = Optional.ofNullable(text)
    			.orElseThrow(NullPointerException::new);
    	
    
    	String temp = Optional.ofNullable(text).get();
    	
    	System.out.println(temp);
    	
    	System.out.println(Optional.ofNullable(text).isEmpty());
    
	    
    	Optional<String> de = Optional.of(text);
    	
    	System.out.println(de.isPresent());	
    	System.out.println(de.get());
    
    	
    }
    
}
