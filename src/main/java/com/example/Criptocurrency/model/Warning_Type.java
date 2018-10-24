package com.example.Criptocurrency.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Warning_Type")
public class Warning_Type implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String description;
	
	@JsonBackReference(value="coinWarningWarningType")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="warning_type")
	@Transient
	private List<Coin_Warning> coin_warnings = new ArrayList<>();
	
	@JsonBackReference(value = "walletWarningWarningType")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="warning_type")
	@Transient
	private List<Wallet_Warning> wallet_warnings = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Coin_Warning> getCoin_warnings() {
		return coin_warnings;
	}

	public void setCoin_warnings(List<Coin_Warning> coin_warnings) {
		this.coin_warnings = coin_warnings;
	}

	public List<Wallet_Warning> getWallet_warnings() {
		return wallet_warnings;
	}

	public void setWallet_warnings(List<Wallet_Warning> wallet_warnings) {
		this.wallet_warnings = wallet_warnings;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coin_warnings == null) ? 0 : coin_warnings.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((wallet_warnings == null) ? 0 : wallet_warnings.hashCode());
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
		Warning_Type other = (Warning_Type) obj;
		if (coin_warnings == null) {
			if (other.coin_warnings != null)
				return false;
		} else if (!coin_warnings.equals(other.coin_warnings))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (wallet_warnings == null) {
			if (other.wallet_warnings != null)
				return false;
		} else if (!wallet_warnings.equals(other.wallet_warnings))
			return false;
		return true;
	}
	
	
}
