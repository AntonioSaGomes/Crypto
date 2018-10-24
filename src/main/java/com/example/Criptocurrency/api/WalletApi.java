/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.api;

import com.example.Criptocurrency.model.Wallet;
import com.example.Criptocurrency.repositories.WalletRepo;
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
public class WalletApi {
    @Autowired
    private WalletRepo walletRepo;
    @GetMapping("/wallets")
    public List<Wallet> getAllWallets() {
        return walletRepo.findAll();
    }
}
