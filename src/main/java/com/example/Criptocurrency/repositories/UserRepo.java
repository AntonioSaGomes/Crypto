package com.example.Criptocurrency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Criptocurrency.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	
	

}
