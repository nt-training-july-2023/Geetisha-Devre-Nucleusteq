package com.crudassignment.insertapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crudassignment.insertapi.model.Employee;

@SpringBootApplication
public class InsertapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsertapiApplication.class, args);
		
		
		Employee emp=new Employee(123, "geet", "SE");
		System.out.println(emp);
	
	}

}
