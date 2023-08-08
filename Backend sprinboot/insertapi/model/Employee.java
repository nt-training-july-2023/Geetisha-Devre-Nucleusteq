package com.crudassignment.insertapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//entity class(pojo) defines table to jpa using entity annotation
@Entity
@Table(name = "employeee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "empId")
	public Long id;

	@Column(name = "name")
	public String empName;

	@Column(name = "role")
	public String role;

	// constructor to initialize objects because when we provide parameterized
	// constructor
	// there's a need to explicitly define default constructor if you want the
	// default constructor to initialize your object
	public Employee() {
	}

	// assigns values passed in object
	public Employee(long id, String empName, String role) {
		this.id = id;
		this.empName = empName;
		this.role = role;
	}

	
	


}
