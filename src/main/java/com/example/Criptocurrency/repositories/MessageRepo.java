/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.repositories;

import com.example.Criptocurrency.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sagomes
 */

public interface MessageRepo extends JpaRepository<Message, Long>  {
    
}
