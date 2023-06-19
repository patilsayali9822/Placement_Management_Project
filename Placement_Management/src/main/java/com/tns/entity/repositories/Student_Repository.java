package com.tns.entity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.entity.modules.Student;
@Repository
public interface Student_Repository extends JpaRepository <Student, Integer>
{

}