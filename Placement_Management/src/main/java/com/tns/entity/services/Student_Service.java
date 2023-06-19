package com.tns.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tns.entity.modules.Student;
import com.tns.entity.repositories.Student_Repository;
@Service
@Transactional
public class Student_Service 
{
	@Autowired
	private Student_Repository repo;
	
	
	public List<Student> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll(); //The method findAll() is undefined 
								// for the type Student_Repository
	}


	public Student get(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}


	public void save(Student student) {
		// TODO Auto-generated method stub
		repo.save(student);
		System.out.println(student.getId());
	}


	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}