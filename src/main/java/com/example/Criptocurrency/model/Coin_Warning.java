package com.example.Criptocurrency.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Coin_Warning")
public class Coin_Warning implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long id_warning;
	
	@MapsId
	@Transient
	private Warning warning;
	
	@JsonBackReference(value="coinWarningCoin")
	@ManyToOne
	@NotNull
	@JoinColumn(name="id_coin")
	private Coin coin;
	
	@JsonBackReference(value="coinWarningWarningType")
	@ManyToOne
	@NotNull
	@JoinColumn(name="warning_type")
	private Warning_Type warning_type;
	
	@NotNull
	private Double value;

	public Long getId_warning() {
		return id_warning;
	}

	public void setId_warning(Long id_warning) {
		this.id_warning = id_warning;
	}

	public Warning getWarning() {
		return warning;
	}

	public void setWarning(Warning warning) {
		this.warning = warning;
	}

	public Coin getCoin() {
		return coin;
	}

	public void setCoin(Coin coin) {
		this.coin = coin;
	}

	public Warning_Type getWarning_type() {
		return warning_type;
	}

	public void setWarning_type(Warning_Type warning_type) {
		this.warning_type = warning_type;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coin == null) ? 0 : coin.hashCode());
		result = prime * result + ((id_warning == null) ? 0 : id_warning.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		result = prime * result + ((warning == null) ? 0 : warning.hashCode());
		result = prime * result + ((warning_type == null) ? 0 : warning_type.hashCode());
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
		Coin_Warning other = (Coin_Warning) obj;
		if (coin == null) {
			if (other.coin != null)
				return false;
		} else if (!coin.equals(other.coin))
			return false;
		if (id_warning == null) {
			if (other.id_warning != null)
				return false;
		} else if (!id_warning.equals(other.id_warning))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		if (warning == null) {
			if (other.warning != null)
				return false;
		} else if (!warning.equals(other.warning))
			return false;
		if (warning_type == null) {
			if (other.warning_type != null)
				return false;
		} else if (!warning_type.equals(other.warning_type))
			return false;
		return true;
	}
	
	
	
}
