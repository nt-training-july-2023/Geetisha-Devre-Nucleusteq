package com.crudassignment.insertapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudassignment.insertapi.model.Employee;
import com.crudassignment.insertapi.service.EmployeeService;

@RestController
@RequestMapping("/api/employeee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//get all record
	@GetMapping("/listEmployees")
	public List<Employee> getAllEmployee()
	{return employeeService.findAllEmployee();}
	
	@GetMapping("/listEmployees/{id}")
	public Employee getEmployee(@PathVariable("id") long id)
	{return employeeService.findById(id);}
	
	@PostMapping("/insertRecord")
	public String addEmployee(@RequestBody Employee emp)
	{
		if(emp!=null)
			{employeeService.insert(emp);
		return "employee added";}
		else
			return "request invalid";
		}
	@DeleteMapping("{id}")
	public String deleteEmployee(@PathVariable long id)
	{
		
		if(id>0)
		{if(employeeService.delete(id))
			return "deleted record";
		else
			return "invalid record request";}
		
		else
			return "invalid request";
	}
	
	@PutMapping("update/{id}")
	public String updateEmployee(@RequestBody Employee emp)
	{//insert or update only if the object contains a valid body in request
		if(emp!=null)
		{employeeService.update(emp);
		return "emplyee record updated";}
	else
		return "invalid request";}
	
}
		


