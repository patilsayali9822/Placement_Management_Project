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

import com.tns.entity.modules.Placement;
import com.tns.entity.services.Placement_Service;


@RestController
public class Placement_Controller {
 
    @Autowired
    private Placement_Service service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/placement")
    public List<Placement> list() {
        return service.listAll();
    }
    //Retrieve specific data from database
    @GetMapping("/placement/{id}")
    public ResponseEntity<Placement> get(@PathVariable Integer id) {
        try {
        	Placement placement = service.get(id);
            return new ResponseEntity<Placement>(placement, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Create operation
    @PostMapping("/placement")
    public void add(@RequestBody Placement placement) {
    	service.save(placement);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/placement/{id}")
    public ResponseEntity<?> update(@RequestBody Placement placement, @PathVariable Integer id) {
        try {
        	Placement existStudent = service.get(id);
        	service.save(placement);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Delete operation
    @DeleteMapping("/placement/{id}")
    public void delete(@PathVariable Integer id) {
    	service.delete(id);
    }
    
   
}