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
@Table(name = "p101_crypto_coin_wallet")
public class Coin_wallet implements Serializable {
	
	public Coin_wallet() {
		super();
	}

	public Coin_wallet(Coin_wallet_PKey id, Wallet wallet, Coin coin, @NotBlank double quantity, double top_limit,
			double bottom_limit) {
		super();
		this.id = id;
		this.wallet = wallet;
		this.coin = coin;
		this.quantity = quantity;
		this.top_limit = top_limit;
		this.bottom_limit = bottom_limit;
	}

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
    @JoinColumn (name = "idCoin")
    private Coin coin;
    
    
    @NotBlank
    private double quantity;
    
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
		Coin_wallet other = (Coin_wallet) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
