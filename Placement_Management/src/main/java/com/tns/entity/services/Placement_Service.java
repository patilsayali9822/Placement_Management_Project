package com.tns.entity.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.entity.modules.Placement;
import com.tns.entity.repositories.Placement_Repository;


@Service
@Transactional
public class Placement_Service {
 
    @Autowired
    private Placement_Repository repo;
     
    public List<Placement> listAll() {
        return repo.findAll();
    }
     
    public void save(Placement placement) {
    	repo.save(placement);
    	System.out.println(placement.getId());
    }
     
    public Placement get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
    	repo.deleteById(id);
    }
    
}