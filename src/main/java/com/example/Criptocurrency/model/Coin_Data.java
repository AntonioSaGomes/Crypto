/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author sagomes
 */
@Entity
@Table(name = "p101_crypto_coin_data")
public class Coin_Data implements Serializable {
	
	
        
    public Coin_Data() {
		super();
	}

	public Coin_Data(Coin_Data_PKey pKey, @NotBlank double price) {
		super();
		PKey = pKey;
		this.price = price;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
    private Coin_Data_PKey PKey;
    
    @NotBlank
    private double price;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((PKey == null) ? 0 : PKey.hashCode());
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
		Coin_Data other = (Coin_Data) obj;
		if (PKey == null) {
			if (other.PKey != null)
				return false;
		} else if (!PKey.equals(other.PKey))
			return false;
		return true;
	}

	public Coin_Data_PKey getPKey() {
		return PKey;
	}

	public void setPKey(Coin_Data_PKey pKey) {
		PKey = pKey;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
    
}
