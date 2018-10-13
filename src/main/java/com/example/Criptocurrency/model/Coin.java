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

/**
 *
 * @author sagomes
 */
@Entity
@Table(name = "coin")
@EntityListeners(AuditingEntityListener.class)

public class Coin {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_coin;
    
     @NotBlank
    private String name;

    @NotBlank
    private String shortname;
    
    @NotBlank
    private double percentage_change_1h;
    
     @NotBlank
    private double percentage_change_24h;
     
      @NotBlank
    private double percentage_change_76h;
    
    
    

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the shortname
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * @param shortname the shortname to set
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    /**
     * @return the percentage_change_1h
     */
    public double getPercentage_change_1h() {
        return percentage_change_1h;
    }

    /**
     * @param percentage_change_1h the percentage_change_1h to set
     */
    public void setPercentage_change_1h(double percentage_change_1h) {
        this.percentage_change_1h = percentage_change_1h;
    }

    /**
     * @return the percentage_change_24h
     */
    public double getPercentage_change_24h() {
        return percentage_change_24h;
    }

    /**
     * @param percentage_change_24h the percentage_change_24h to set
     */
    public void setPercentage_change_24h(double percentage_change_24h) {
        this.percentage_change_24h = percentage_change_24h;
    }

    /**
     * @return the percentage_change_76h
     */
    public double getPercentage_change_76h() {
        return percentage_change_76h;
    }

    /**
     * @param percentage_change_76h the percentage_change_76h to set
     */
    public void setPercentage_change_76h(double percentage_change_76h) {
        this.percentage_change_76h = percentage_change_76h;
    }

    /**
     * @return the id_coin
     */
    public Long getId_coin() {
        return id_coin;
    }

    /**
     * @param id_coin the id_coin to set
     */
    public void setId_coin(Long id_coin) {
        this.id_coin = id_coin;
    }
    
   
}
