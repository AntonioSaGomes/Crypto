/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.controller;

import ch.qos.logback.core.net.server.Client;
import com.example.Criptocurrency.exception.ResourceNotFoundException;
import com.example.Criptocurrency.model.Coin;
import com.example.Criptocurrency.repositories.CoinRepo;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import org.springframework.http.MediaType;

/**
 *
 * @author sagomes
 */

@RestController
@RequestMapping("/api")
public class CoinController {
    
    @Autowired
    CoinRepo coinRepo;
    
    @GetMapping("/coins")
    public List<Coin> getAllNotes() {
        return coinRepo.findAll();
    }
   
    @PostMapping("/coin")
    public void createCoin(@Valid @RequestBody Coin coin){
         
        System.out.println(coin);
        coinRepo.save(coin);
    }
    
}
