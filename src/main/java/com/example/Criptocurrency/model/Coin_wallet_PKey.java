package com.example.Criptocurrency.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Coin_wallet_PKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Column(name = "coin_id")
	private Long coin_id;
	
	@Column(name = "wallet_id")
	private Long wallet_id;

	public Long getCoin_id() {
		return coin_id;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coin_id == null) ? 0 : coin_id.hashCode());
		result = prime * result + ((wallet_id == null) ? 0 : wallet_id.hashCode());
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
		Coin_wallet_PKey other = (Coin_wallet_PKey) obj;
		if (coin_id == null) {
			if (other.coin_id != null)
				return false;
		} else if (!coin_id.equals(other.coin_id))
			return false;
		if (wallet_id == null) {
			if (other.wallet_id != null)
				return false;
		} else if (!wallet_id.equals(other.wallet_id))
			return false;
		return true;
	}



	public void setCoin_id(Long coin_id) {
		this.coin_id = coin_id;
	}

	public Long getWallet_id() {
		return wallet_id;
	}

	public void setWallet_id(Long wallet_id) {
		this.wallet_id = wallet_id;
	}
	
	
	
}
