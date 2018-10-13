/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "coin_wallet")
@EntityListeners(AuditingEntityListener.class)

public class Coin_wallet {

    @Id
    @OneToOne
    @JoinColumn (name = "idWallet")
    private Wallet wallet;
    
    @Id 
    @OneToOne
    @JoinColumn (name = "id_coin")
    private Coin coin;
    
    
    @NotBlank
    private double quantity;
    
    @NotBlank
    private double price;

  
    /**
     * @return the quantity
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
