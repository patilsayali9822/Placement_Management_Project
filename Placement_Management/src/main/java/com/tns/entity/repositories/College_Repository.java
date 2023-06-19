package com.tns.entity.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.entity.modules.College;


@Repository
public interface College_Repository extends JpaRepository<College, Integer>
{
	
	 
}
