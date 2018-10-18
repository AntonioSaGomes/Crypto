/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.controller;

import com.example.Criptocurrency.model.Coin_Data;
import com.example.Criptocurrency.model.User;
import com.example.Criptocurrency.repositories.CoinDataRepo;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sagomes
 */

@RestController
@RequestMapping("/api")
public class CoinDataController {
    @Autowired
    private CoinDataRepo coinDataRepo;
    
    @GetMapping("/coinsData")
    public List<Coin_Data> getAllWallets() {
        return coinDataRepo.findAll();
    }
   
    @PostMapping("/coinData")
    public void createWallet(@Valid @RequestBody Coin_Data coinData){
        coinDataRepo.save(coinData);
    }
}
