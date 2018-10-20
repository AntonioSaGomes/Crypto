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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "p101_crypto_wallet")
public class Wallet implements Serializable {
	
	
	
	public Wallet() {
		super();
	}

	public Wallet(Long id, @NotNull User user, @NotNull double value, @NotNull double percentage_change_1h,
			@NotNull double percentage_change_24h, @NotNull double percentage_change_7d, double top_limit,
			double bottom_limit) {
		super();
		this.id = id;
		this.user = user;
		this.value = value;
		this.percentage_change_1h = percentage_change_1h;
		this.percentage_change_24h = percentage_change_24h;
		this.percentage_change_7d = percentage_change_7d;
		this.top_limit = top_limit;
		this.bottom_limit = bottom_limit;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@OneToOne
	@NotNull
	@JoinColumn(name="idUser")
	private User user;
	
	@OneToMany(mappedBy="wallet")
	private List<Coin_wallet> coin_wallet = new ArrayList<>();
	
	@NotNull
    private double value;
    
    @NotNull
    private double percentage_change_1h;
    
    @NotNull
    private double percentage_change_24h;
     
    @NotNull
    private double percentage_change_7d;
    
    private double top_limit;
    
    private double bottom_limit;
      
    
    public double getTop_limit() {
		return top_limit;
	}

	public void setTop_limit(double top_limit) {
		this.top_limit = top_limit;
	}

	public double getBottom_limit() {
		return bottom_limit;
	}

	public void setBottom_limit(double bottom_limit) {
		this.bottom_limit = bottom_limit;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Coin_wallet> getCoin_wallet() {
		return coin_wallet;
	}

	public void setCoin_wallet(List<Coin_wallet> coin_wallet) {
		this.coin_wallet = coin_wallet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getPercentage_change_1h() {
		return percentage_change_1h;
	}

	public void setPercentage_change_1h(double percentage_change_1h) {
		this.percentage_change_1h = percentage_change_1h;
	}

	public double getPercentage_change_24h() {
		return percentage_change_24h;
	}

	public void setPercentage_change_24h(double percentage_change_24h) {
		this.percentage_change_24h = percentage_change_24h;
	}

	public double getPercentage_change_7d() {
		return percentage_change_7d;
	}

	public void setPercentage_change_7d(double percentage_change_7d) {
		this.percentage_change_7d = percentage_change_7d;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Wallet other = (Wallet) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
    
}
