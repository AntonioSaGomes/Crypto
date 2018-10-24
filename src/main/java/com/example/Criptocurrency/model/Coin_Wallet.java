package com.example.Criptocurrency.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@IdClass(Coin_Wallet_PKey.class)
@Table(name = "Coin_Wallet")
public class Coin_Wallet implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    private Long id_coin;
	
	@Id
    private Long id_wallet;
    
	@JsonManagedReference(value = "coinWalletCoin")
	@ManyToOne
	@MapsId("id_coin")
	@Transient
	private Coin coin;
    
	@JsonManagedReference(value="coinWalletWallet")
	@ManyToOne
    @MapsId("id_wallet")
	@Transient
    private Wallet wallet;

    @NotNull
    private Double quantity;

    private Double top_limit;

    private Double bottom_limit;

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

	public Coin getCoin() {
		return coin;
	}

	public void setCoin(Coin coin) {
		this.coin = coin;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTop_limit() {
		return top_limit;
	}

	public void setTop_limit(Double top_limit) {
		this.top_limit = top_limit;
	}

	public Double getBottom_limit() {
		return bottom_limit;
	}

	public void setBottom_limit(Double bottom_limit) {
		this.bottom_limit = bottom_limit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bottom_limit == null) ? 0 : bottom_limit.hashCode());
		result = prime * result + ((coin == null) ? 0 : coin.hashCode());
		result = prime * result + ((id_coin == null) ? 0 : id_coin.hashCode());
		result = prime * result + ((id_wallet == null) ? 0 : id_wallet.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((top_limit == null) ? 0 : top_limit.hashCode());
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
		Coin_Wallet other = (Coin_Wallet) obj;
		if (bottom_limit == null) {
			if (other.bottom_limit != null)
				return false;
		} else if (!bottom_limit.equals(other.bottom_limit))
			return false;
		if (coin == null) {
			if (other.coin != null)
				return false;
		} else if (!coin.equals(other.coin))
			return false;
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
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (top_limit == null) {
			if (other.top_limit != null)
				return false;
		} else if (!top_limit.equals(other.top_limit))
			return false;
		if (wallet == null) {
			if (other.wallet != null)
				return false;
		} else if (!wallet.equals(other.wallet))
			return false;
		return true;
	}

    
}
