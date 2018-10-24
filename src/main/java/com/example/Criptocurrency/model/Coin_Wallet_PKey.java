package com.example.Criptocurrency.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Coin_Wallet_PKey implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id_coin;
	private Long id_wallet;
	
	
	
	public Coin_Wallet_PKey() {
		super();
	}

	public Coin_Wallet_PKey(Long id_coin, Long id_wallet) {
		super();
		this.id_coin = id_coin;
		this.id_wallet = id_wallet;
	}
	
	public Long getId_coin() {
		return id_coin;
	}
	public void setId_coin(Long id_coin) {
		this.id_coin = id_coin;
	}
	public Long getId_wallet() {
		return id_wallet;
	}
	public void setId_wallet(Long id_wallet) {
		this.id_wallet = id_wallet;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_coin == null) ? 0 : id_coin.hashCode());
		result = prime * result + ((id_wallet == null) ? 0 : id_wallet.hashCode());
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
		Coin_Wallet_PKey other = (Coin_Wallet_PKey) obj;
		if (id_coin == null) {
			if (other.id_coin != null)
				return false;
		} else if (!id_coin.equals(other.id_coin))
			return false;
		if (id_wallet == null) {
			if (other.id_wallet != null)
				return false;
		} else if (!id_wallet.equals(other.id_wallet))
			return false;
		return true;
	}

	
}
