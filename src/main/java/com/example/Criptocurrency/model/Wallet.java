/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "wallet")
@EntityListeners(AuditingEntityListener.class)

public class Wallet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    private double value;
    
    @NotBlank
    private double percentage_change_1h;
    
    @NotBlank
    private double percentage_change_24h;
     
    @NotBlank
    private double percentage_change_76h;
    
    
    
    
}
