package com.example.Criptocurrency.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Coin_Data_PKey implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id_coin;
	private String timestamp;
	
	
	public Coin_Data_PKey() {
		super();
	}

	public Coin_Data_PKey(Long id_coin, String timestamp) {
		super();
		this.id_coin = id_coin;
		this.timestamp = timestamp;
	}
	
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_coin == null) ? 0 : id_coin.hashCode());
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
		Coin_Data_PKey other = (Coin_Data_PKey) obj;
		if (id_coin == null) {
			if (other.id_coin != null)
				return false;
		} else if (!id_coin.equals(other.id_coin))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}
	
}
