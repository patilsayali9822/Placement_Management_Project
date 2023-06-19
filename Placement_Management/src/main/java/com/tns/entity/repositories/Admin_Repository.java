package com.tns.entity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.entity.modules.Admin;
@Repository
public interface Admin_Repository extends JpaRepository <Admin, Integer>
{

}
