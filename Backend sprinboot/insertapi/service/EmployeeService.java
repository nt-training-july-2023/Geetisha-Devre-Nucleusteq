package com.crudassignment.insertapi.service;

import java.util.List;

import com.crudassignment.insertapi.model.Employee;


//service class can be merged in with controller however creating service adds up an extra layer to your project
public interface EmployeeService {
List<Employee>findAllEmployee();
Employee findById(Long id);
Employee insert(Employee emp);
boolean delete(Long id);
boolean update(Employee emp);
}
