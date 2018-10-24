/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.controller;

import com.example.Criptocurrency.model.Coin_Data;
import com.example.Criptocurrency.repositories.CoinDataRepo;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author sagomes
 */

@Controller
public class CoinDataController {
    @Autowired
    private CoinDataRepo coinDataRepo;
    
    @GetMapping("/coinsData")
    public String coinsData(Model model) {
        model.addAttribute("coinsData", coinDataRepo.findAll());
        return "coinsData";
    }
   
  
}
