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

import com.tns.entity.modules.College;
import com.tns.entity.services.College_Service;


@RestController
public class College_Controller {
 
    @Autowired
    private College_Service service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/college")
    public List<College> list() {
        return service.listAll();
    }
    
    //Retrieve specific data from database
    @GetMapping("/college/{id}")
    public ResponseEntity<College> get(@PathVariable Integer id) {
        try {
        	College college = service.get(id);
            return new ResponseEntity<College>(college, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Create operation
    @PostMapping("/college")
    public void add(@RequestBody College college) {
        service.save(college);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/college/{id}")
    public ResponseEntity<?> update(@RequestBody College college, @PathVariable Integer id) {
        try {
        
            service.save(college);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Delete operation
    @DeleteMapping("/college/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    
   
}
