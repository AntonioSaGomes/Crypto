/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.controller;

import com.example.Criptocurrency.model.Coin;
import com.example.Criptocurrency.model.Wallet;
import com.example.Criptocurrency.repositories.WalletRepo;
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
public class WalletController {
    @Autowired
    private WalletRepo walletRepo;
    @GetMapping("/wallets")
    public List<Wallet> getAllWallets() {
        return walletRepo.findAll();
    }
   
    @PostMapping("/wallet")
    public void createWallet(@Valid @RequestBody Wallet wallet){
         
        System.out.println(wallet);
        walletRepo.save(wallet);
    }
}
