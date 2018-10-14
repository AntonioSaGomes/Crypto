/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.model;

import java.io.Serializable;
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

@Entity
@Table(name = "wallet")

public class Wallet implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@OneToOne
	@NotBlank
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy="wallet")
	private List<Coin_wallet> coin_wallet;
	
	@NotBlank
    private double value;
    
    @NotBlank
    private double percentage_change_1h;
    
    @NotBlank
    private double percentage_change_24h;
     
    @NotBlank
    private double percentage_change_7d;
    
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
		result = prime * result + ((coin_wallet == null) ? 0 : coin_wallet.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(percentage_change_1h);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(percentage_change_24h);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(percentage_change_7d);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (coin_wallet == null) {
			if (other.coin_wallet != null)
				return false;
		} else if (!coin_wallet.equals(other.coin_wallet))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(percentage_change_1h) != Double.doubleToLongBits(other.percentage_change_1h))
			return false;
		if (Double.doubleToLongBits(percentage_change_24h) != Double.doubleToLongBits(other.percentage_change_24h))
			return false;
		if (Double.doubleToLongBits(percentage_change_7d) != Double.doubleToLongBits(other.percentage_change_7d))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	} 
	
	
    
}
