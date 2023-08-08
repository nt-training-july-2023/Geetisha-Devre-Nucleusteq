package com.crudassignment.insertapi.repository;

import org.springframework.stereotype.Repository;

import com.crudassignment.insertapi.model.Employee;

import org.springframework.data.repository.CrudRepository;


//extends crud repository as we only need to create api and sorting pagenation is not required the basic functional 
//queries are provided by the crudRepository
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
