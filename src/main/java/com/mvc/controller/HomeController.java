package com.mvc.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {
	@GetMapping
	public ResponseEntity<?> home() {
		return new ResponseEntity<>("Welcome to employee management system",HttpStatus.OK);
	}

}
