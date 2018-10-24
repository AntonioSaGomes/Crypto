/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.api;

import com.example.Criptocurrency.model.Coin;
import com.example.Criptocurrency.repositories.CoinRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sagomes
 */


@RestController
@RequestMapping("/api")
public class CoinApi {
    
    @Autowired
    private CoinRepo coinRepo;
    @GetMapping("/coins")
    public List<Coin> getAllCoins() {
        return coinRepo.findAll();
    }
   
 
}
