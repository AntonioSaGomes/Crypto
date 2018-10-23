package com.example.Criptocurrency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Criptocurrency.model.Warning;

@Repository
public interface WarningRepo extends JpaRepository<Warning, Long> {

}
