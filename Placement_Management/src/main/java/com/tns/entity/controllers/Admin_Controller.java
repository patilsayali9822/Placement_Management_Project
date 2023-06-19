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
import org.springframework.web.bind.annotation.RestController;

import com.tns.entity.modules.Admin;
import com.tns.entity.services.Admin_Service;
@RestController
public class Admin_Controller 
{
	@Autowired
	private Admin_Service service;
	
	//Retrieve All data
	@GetMapping ("/admin")
	public List <Admin> list()
	{
		return service.listAll();
		
	}
	
	//Retrieve Specific data
	@GetMapping ("/admin/{id}")
	public ResponseEntity <Admin> get(@PathVariable Integer id)
	{
		try {
			Admin admin = service.get(id);
			return new ResponseEntity <Admin> (admin, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity <Admin> (HttpStatus.NOT_FOUND);
		}
	}
	
	//Create Operation
	@PostMapping ("/admin")
	public void add (@RequestBody Admin admin)
	{
		service.save(admin);
	}
	
	//Update Operation
	@PutMapping ("/admin/{id}")
	public ResponseEntity <?> update (@RequestBody Admin admin, @PathVariable Integer id)
	{
		try {
			service.save(admin);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity <> (HttpStatus.NOT_FOUND);
		}
	}
	
	//Delete Operation
	
	@DeleteMapping ("/admin/{id}")
	public void delete (@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	
}
