/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.controller;

import com.example.Criptocurrency.model.Message;
import com.example.Criptocurrency.repositories.MessageRepo;
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
public class MessageController {
    
     @Autowired
     private MessageRepo messageRepo;
    
     @GetMapping("/messages")
     public List<Message> getMessages(){
         return messageRepo.findAll();
     }
   
     @PostMapping("/message")
     public void createMessage(@Valid @RequestBody Message message){
        messageRepo.save(message);
     }
}
