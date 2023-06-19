package com.tns.entity.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.entity.modules.Student;
import com.tns.entity.services.Student_Service;
@RestController
public class Student_Controller 
{
	//private static final Student student = null;
	@Autowired
	private Student_Service service;
	
	//Retrieve All the data from the database 
	
	@GetMapping ("/student")

	public List <Student> list()
	{
		return service.listAll(); //The Method listAll() is undefined 
									//for the type Student_Service
	}
	
	//Retrieve specific data
	
	@GetMapping ("/student/{id}")
	public ResponseEntity <Student> get(@PathVariable Integer id)
	{
		try {
			Student student = service.get(id);
			return new ResponseEntity <Student> (student,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity <Student> (HttpStatus.NOT_FOUND);
		}
		
	}
	
	//Create Operation
	@PostMapping ("/student")
	public void add (@RequestBody Student student)
	{
		service.save(student);
	}
	
	//Update Operation
	@PutMapping ("/student/{id}")
	public ResponseEntity <?> update (@RequestBody Student student, @PathVariable Integer id)
	{
		try {
			service.save(student);
			return new ResponseEntity <> (HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity <> (HttpStatus.NOT_FOUND);
		}
		
	}
	
	//Delete Operation
	@DeleteMapping ("/student/{id}")
	public void delete (@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	
	
	
}