package com.tns.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tns.entity.modules.User;
import com.tns.entity.repositories.User_Repository;
@Service
@Transactional
public class User_Service {
	
	@Autowired
	private User_Repository repo;
	
	public List<User> listAll() 
	{
		
		return repo.findAll();
	}

	public User get(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public void save(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}