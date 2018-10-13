/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author sagomes
 */
@Entity
@Table(name = "coin_data")
@EntityListeners(AuditingEntityListener.class)
public class Coin_Data {
    
    
    
    
     @Id
    private Long timestamp;
     
    @OneToOne
    @JoinColumn(name="id_coin")
    private Coin coin;
    
     @NotBlank
     private double price;
}
