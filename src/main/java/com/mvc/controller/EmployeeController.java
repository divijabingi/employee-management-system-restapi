package com.mvc.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mvc.model.Employee;
import com.mvc.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	private EmployeeService service;
	
	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}
	@PostMapping()
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee){
		Employee emp = service.saveEmployee(employee);
		if(emp!=null) {
			return new ResponseEntity<>("Employee added successfully.....",HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>("Error in adding employee.....",HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@GetMapping("{id}")//path variable 
	public ResponseEntity<?> searchEmployee(@PathVariable int id){
		Employee obj = service.searchEmployee(id);
		if(obj.getId() != 0) {
			return new ResponseEntity<>(obj,HttpStatus.FOUND);
		}else {
			return new ResponseEntity<>("Employee not found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping
	public ResponseEntity<?> getAllEmployees(){
		List<Employee> empList = service.getAllEmployees();
		if(empList.size() > 0) {
		return new ResponseEntity<>(empList,HttpStatus.FOUND);
		}else {
			return new ResponseEntity<>("Sorry no employees found......",HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PutMapping
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee){
		Employee obj = service.searchEmployee(employee.getId());
		System.out.println(obj);
		if(obj.getId() == null) {
			return new ResponseEntity<>("Invalid employee id",HttpStatus.BAD_REQUEST);
		}else {
			service.saveEmployee(employee);
			return new ResponseEntity<>("Employee updated...",HttpStatus.OK);
		}
		
		
		
	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable Integer id){
		Employee obj = service.searchEmployee(id);
		System.out.println(obj);
		if(obj.getId() == null) {
			return new ResponseEntity<>("Invalid employee id",HttpStatus.BAD_REQUEST);
		}else {
			service.deleteEmployee(id);
			return new ResponseEntity<>("Employee deleted...",HttpStatus.OK);
		}
		
		
		
	}

	
	
	
	
	
	
}