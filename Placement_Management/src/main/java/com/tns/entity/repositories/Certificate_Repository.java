package com.tns.entity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.entity.modules.Certificate;
@Repository
public interface Certificate_Repository extends JpaRepository <Certificate, Integer>
{

}
