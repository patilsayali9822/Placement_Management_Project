package com.tns.entity.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.entity.modules.User;
@Repository
public interface User_Repository extends JpaRepository < User, Integer>
{

}
