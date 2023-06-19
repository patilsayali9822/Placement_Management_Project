package com.tns.entity.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.entity.modules.College;
import com.tns.entity.repositories.College_Repository;


@Service
@Transactional
public class College_Service {
 
    @Autowired
    private College_Repository repo;
     
    public List<College> listAll() {
        return repo.findAll();
    }
     
    public void save(College college) {
        repo.save(college);
        System.out.println(college.getId());
    }
     
    public College get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
    
}