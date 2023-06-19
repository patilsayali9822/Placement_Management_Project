package com.tns.entity.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.entity.modules.Admin;
import com.tns.entity.repositories.Admin_Repository;
@Service
@Transactional
public class Admin_Service {
	@Autowired
	private Admin_Repository repo;
	
	public List<Admin> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Admin get(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public void save(Admin admin) {
		// TODO Auto-generated method stub
		repo.save(admin);
		System.out.println(admin.getId());
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
