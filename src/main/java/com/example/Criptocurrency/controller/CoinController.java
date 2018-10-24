/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.controller;


import com.example.Criptocurrency.model.Coin;
import com.example.Criptocurrency.repositories.CoinRepo;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.stereotype.Controller;

/**
 *
 * @author sagomes
 */

@Controller
public class CoinController {
    
    @Autowired
    CoinRepo coinRepo;
    
    @GetMapping("/coin")
    public List<Coin> getAllCoins() {
        return coinRepo.findAll();
    }
   
    @PostMapping("/coin")
    public void createCoin(@Valid @RequestBody Coin coin){
         
        System.out.println(coin);
        coinRepo.save(coin);
    }
    
}
