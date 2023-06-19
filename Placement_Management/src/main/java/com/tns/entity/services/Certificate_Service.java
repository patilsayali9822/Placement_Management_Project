package com.tns.entity.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.entity.modules.Certificate;
import com.tns.entity.repositories.Certificate_Repository;
@Service
@Transactional
public class Certificate_Service {
	@Autowired
	public Certificate_Repository repo;
	
	public List<Certificate> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Certificate get(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public void save(Certificate certificate) {
		// TODO Auto-generated method stub
		repo.save(certificate);
		System.out.println(certificate.getId());
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	
	
}