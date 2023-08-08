package com.crudassignment.insertapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudassignment.insertapi.model.Employee;
import com.crudassignment.insertapi.repository.EmployeeRepository;

@Service
public class ServiceImplement implements EmployeeService {
	
	
	@Autowired 
	 EmployeeRepository repo;

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>)repo.findAll();
	}

	@Override
	public Employee findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Employee> result=repo.findById(id);
		//if record is present return record
		if(result.isPresent())
			return result.get();
		//else return null if record is not present
		else
		return null;
	}

	@Override
	public Employee insert(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(id);
			return true;
		}
		catch(Exception e)
		{//returns the reason or behavior due to which the exception is thrown
			System.out.println(e.getMessage());}
		return false;
	}

	@Override
	public boolean update(Employee emp) {
		// TODO Auto-generated method stub
		try
		{repo.save(emp);
		return true;}
		catch(Exception e)
		{System.out.println(e.getMessage());
		return false;}
	}
	
	
	

}
