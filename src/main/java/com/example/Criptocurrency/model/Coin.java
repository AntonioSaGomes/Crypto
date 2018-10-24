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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Coin")
public class Coin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String name;

	@NotBlank
	private String shortname;

	@NotBlank
	private String logo;

	@NotNull
	private Double percentage_change_1h;

	@NotNull
	private Double percentage_change_24h;

	@NotNull
	private Double percentage_change_7d;

	@JsonBackReference(value = "coinWalletCoin")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="coin")
	@Transient
	private List<Coin_Wallet> coin_wallets = new ArrayList<>();

	@JsonBackReference(value = "coinDataCoin")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="coin")
	@Transient
	private List<Coin_Data> coin_datas = new ArrayList<>();

	@JsonBackReference(value="coinWarningCoin")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="coin")
	@Transient
	private List<Coin_Warning> coin_warnings = new ArrayList<>();
	

	public Coin() {
		super();
	}

	public Coin(Long id, @NotBlank String name, @NotBlank String shortname, @NotBlank String logo,
			@NotNull Double percentage_change_1h, @NotNull Double percentage_change_24h,
			@NotNull Double percentage_change_7d) {
		super();
		this.id = id;
		this.name = name;
		this.shortname = shortname;
		this.logo = logo;
		this.percentage_change_1h = percentage_change_1h;
		this.percentage_change_24h = percentage_change_24h;
		this.percentage_change_7d = percentage_change_7d;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Double getPercentage_change_1h() {
		return percentage_change_1h;
	}

	public void setPercentage_change_1h(Double percentage_change_1h) {
		this.percentage_change_1h = percentage_change_1h;
	}

	public Double getPercentage_change_24h() {
		return percentage_change_24h;
	}

	public void setPercentage_change_24h(Double percentage_change_24h) {
		this.percentage_change_24h = percentage_change_24h;
	}

	public Double getPercentage_change_7d() {
		return percentage_change_7d;
	}

	public void setPercentage_change_7d(Double percentage_change_7d) {
		this.percentage_change_7d = percentage_change_7d;
	}

	public List<Coin_Wallet> getCoin_wallets() {
		return coin_wallets;
	}

	public void setCoin_wallets(List<Coin_Wallet> coin_wallets) {
		this.coin_wallets = coin_wallets;
	}

	public List<Coin_Data> getCoin_datas() {
		return coin_datas;
	}

	public void setCoin_datas(List<Coin_Data> coin_datas) {
		this.coin_datas = coin_datas;
	}

	public List<Coin_Warning> getCoin_warnings() {
		return coin_warnings;
	}

	public void setCoin_warnings(List<Coin_Warning> coin_warnings) {
		this.coin_warnings = coin_warnings;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coin_datas == null) ? 0 : coin_datas.hashCode());
		result = prime * result + ((coin_wallets == null) ? 0 : coin_wallets.hashCode());
		result = prime * result + ((coin_warnings == null) ? 0 : coin_warnings.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((logo == null) ? 0 : logo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((percentage_change_1h == null) ? 0 : percentage_change_1h.hashCode());
		result = prime * result + ((percentage_change_24h == null) ? 0 : percentage_change_24h.hashCode());
		result = prime * result + ((percentage_change_7d == null) ? 0 : percentage_change_7d.hashCode());
		result = prime * result + ((shortname == null) ? 0 : shortname.hashCode());
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
		Coin other = (Coin) obj;
		if (coin_datas == null) {
			if (other.coin_datas != null)
				return false;
		} else if (!coin_datas.equals(other.coin_datas))
			return false;
		if (coin_wallets == null) {
			if (other.coin_wallets != null)
				return false;
		} else if (!coin_wallets.equals(other.coin_wallets))
			return false;
		if (coin_warnings == null) {
			if (other.coin_warnings != null)
				return false;
		} else if (!coin_warnings.equals(other.coin_warnings))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (logo == null) {
			if (other.logo != null)
				return false;
		} else if (!logo.equals(other.logo))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (percentage_change_1h == null) {
			if (other.percentage_change_1h != null)
				return false;
		} else if (!percentage_change_1h.equals(other.percentage_change_1h))
			return false;
		if (percentage_change_24h == null) {
			if (other.percentage_change_24h != null)
				return false;
		} else if (!percentage_change_24h.equals(other.percentage_change_24h))
			return false;
		if (percentage_change_7d == null) {
			if (other.percentage_change_7d != null)
				return false;
		} else if (!percentage_change_7d.equals(other.percentage_change_7d))
			return false;
		if (shortname == null) {
			if (other.shortname != null)
				return false;
		} else if (!shortname.equals(other.shortname))
			return false;
		return true;
	}

	
}
