package com.example.Criptocurrency.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@IdClass(Coin_Data_PKey.class)
@Table(name = "Coin_Data")
public class Coin_Data implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id_coin;
	
	@Id
	private String timestamp;
	
	@JsonManagedReference(value = "coinDataCoin")
	@MapsId("id_coin")
	@Transient
	private Coin coin;

    @NotNull
    private Double price;

	public Long getId_coin() {
		return id_coin;
	}

	public void setId_coin(Long id_coin) {
		this.id_coin = id_coin;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Coin getCoin() {
		return coin;
	}

	public void setCoin(Coin coin) {
		this.coin = coin;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coin == null) ? 0 : coin.hashCode());
		result = prime * result + ((id_coin == null) ? 0 : id_coin.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
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
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}
    
    
}
