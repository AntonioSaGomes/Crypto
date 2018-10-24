/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.controller;

import com.example.Criptocurrency.exception.ResourceNotFoundException;
import com.example.Criptocurrency.model.User;
import com.example.Criptocurrency.model.Wallet;
import com.example.Criptocurrency.repositories.UserRepo;
import com.example.Criptocurrency.repositories.WalletRepo;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sagomes
 */

@Controller
public class UserController {
   
    @Autowired
    private UserRepo userRepo;
    
    @GetMapping("/user")
    public String UserForm(Model model) {
        model.addAttribute("user", new User());
        return "user";
    }
   
    @PostMapping("/user")
    public String submitForm(@ModelAttribute User user){
        User user1 = userRepo.save(user);
        return "result";
    }
    

    
}