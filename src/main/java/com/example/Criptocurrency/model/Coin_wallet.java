/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author sagomes
 */

@Entity
@Table(name = "coin_wallet")

public class Coin_wallet implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@EmbeddedId
	private Coin_wallet_PKey id;
	
	
    @ManyToOne
    @MapsId("wallet_id")
    @JoinColumn (name = "idWallet")
    private Wallet wallet;
    
    @ManyToOne
    @MapsId("coin_id")
    @JoinColumn (name = "id_coin")
    private Coin coin;
    
    
    @NotBlank
    private double quantity;
    
    @NotBlank
    private double price;

    
  
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coin == null) ? 0 : coin.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quantity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((wallet == null) ? 0 : wallet.hashCode());
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
		Coin_wallet other = (Coin_wallet) obj;
		if (coin == null) {
			if (other.coin != null)
				return false;
		} else if (!coin.equals(other.coin))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(quantity) != Double.doubleToLongBits(other.quantity))
			return false;
		if (wallet == null) {
			if (other.wallet != null)
				return false;
		} else if (!wallet.equals(other.wallet))
			return false;
		return true;
	}

	public Coin_wallet_PKey getId() {
		return id;
	}

	public void setId(Coin_wallet_PKey id) {
		this.id = id;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public Coin getCoin() {
		return coin;
	}

	public void setCoin(Coin coin) {
		this.coin = coin;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

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
