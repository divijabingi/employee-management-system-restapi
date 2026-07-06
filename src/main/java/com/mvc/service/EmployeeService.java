package com.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvc.model.Employee;
import com.mvc.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	EmployeeRepository repository;

	public EmployeeService(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}

	public Employee saveEmployee(Employee employee) {
		
		return repository.save(employee);
	}

	public Employee searchEmployee(int id) {
		
		return repository.findById(id).orElse(new Employee());
	}

	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	public void deleteEmployee(Integer id) {
		repository.deleteById(id);
		
	}
	
	
	

}
