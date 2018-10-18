/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sagomes
 */
@Entity
@Table(name = "p101_crypto_coin")
public class Coin implements Serializable {
	
	
    
    public Coin() {
		super();
	}

	public Coin(Long id_coin, @NotBlank String name, @NotBlank String shortname, @NotBlank String logo,
			@NotNull double percentage_change_1h, @NotNull double percentage_change_24h,
			@NotNull double percentage_change_7d) {
		super();
		this.id_coin = id_coin;
		this.name = name;
		this.shortname = shortname;
		this.logo = logo;
		this.percentage_change_1h = percentage_change_1h;
		this.percentage_change_24h = percentage_change_24h;
		this.percentage_change_7d = percentage_change_7d;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_coin;
	
	@OneToMany(mappedBy="coin")
	private List<Coin_wallet> coin_wallet = new ArrayList<>();
	
	@OneToMany(mappedBy="PKey.coin")
	private List<Coin_Data> coin_data = new ArrayList<>();
    
    @NotBlank
    private String name;

    @NotBlank
    private String shortname;
    
    @NotBlank
    private String logo;
    
    @NotNull
    private double percentage_change_1h;
    
    @NotNull
    private double percentage_change_24h;
     
    @NotNull
    private double percentage_change_7d;
    
    
    
    public List<Coin_wallet> getCoin_wallet() {
		return coin_wallet;
	}

	public void setCoin_wallet(List<Coin_wallet> coin_wallet) {
		this.coin_wallet = coin_wallet;
	}

	public List<Coin_Data> getCoin_data() {
		return coin_data;
	}

	public void setCoin_data(List<Coin_Data> coin_data) {
		this.coin_data = coin_data;
	}

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
     * @return the percentage_change_7d
     */
    public double getPercentage_change_7d() {
        return percentage_change_7d;
    }

    public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setPercentage_change_7d(double percentage_change_7d) {
		this.percentage_change_7d = percentage_change_7d;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_coin == null) ? 0 : id_coin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coin other = (Coin) obj;
		if (id_coin == null) {
			if (other.id_coin != null)
				return false;
		} else if (!id_coin.equals(other.id_coin))
			return false;
		return true;
	}

	
    public String toString(){
        return this.name;
    }
    
   
}
