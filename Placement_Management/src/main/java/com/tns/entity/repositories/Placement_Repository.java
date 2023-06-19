package com.tns.entity.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.entity.modules.Placement;


@Repository
public interface Placement_Repository extends JpaRepository<Placement, Integer> 
{
	
	 
}
