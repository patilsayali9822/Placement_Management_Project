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

import com.tns.entity.modules.Certificate;
import com.tns.entity.services.Certificate_Service;
@RestController
public class Certificate_Controller 
{
	@Autowired
	private Certificate_Service service;
	
	//Retrieve All the Data
	@GetMapping ("/certificate")
	public List<Certificate> list()
	{
		return service.listAll();
		
	}
	
	//Retrieve Specific Data
	@GetMapping ("/certificate/{id}")
	public ResponseEntity<Certificate> get (@PathVariable Integer id)
	{
		try {
			Certificate certificate = service.get(id);
			return new ResponseEntity <Certificate> (certificate, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity <Certificate> ( HttpStatus.NOT_FOUND);
		}
		
	}
	
	//Create Operation
	@PostMapping ("/certificate")
	public void add (@RequestBody Certificate certificate)
	{
		service.save(certificate);
	}
	
	//Update Operation
	@PutMapping ("/certificate/{id}")
	public ResponseEntity <?> update (@RequestBody Certificate certificate, @PathVariable Integer id)
	{
		try {
			service.save(certificate);
			return new ResponseEntity <> (HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity <> (HttpStatus.NOT_FOUND);
		}
		
	}
	
	//Delete Operation
	@DeleteMapping ("/certificate/{id}")
	public void delete (@PathVariable Integer id)
	{
		service.delete(id);
	}
	
}
