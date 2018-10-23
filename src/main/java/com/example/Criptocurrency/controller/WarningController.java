 
package com.example.Criptocurrency.controller;

import com.example.Criptocurrency.exception.ResourceNotFoundException;
import com.example.Criptocurrency.model.Coin;
import com.example.Criptocurrency.model.Wallet;
import com.example.Criptocurrency.repositories.WalletRepo;
import com.example.Criptocurrency.repositories.WarningRepo;
import java.util.List;
import javax.validation.Valid;
import com.example.Criptocurrency.model.Warning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class WarningController {
    @Autowired
    private WarningRepo warningRepo;
    
    @GetMapping("/warnings")
    public List<Warning> getAllWallets() {
        return warningRepo.findAll();
    }
   
    @PostMapping("/warning")
    public void createWallet(@Valid @RequestBody Warning warning){
         
        System.out.println(warning);
        warningRepo.save(warning);
    }
}
    
    