package com.example.Criptocurrency.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "Wallet")
public class Wallet implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@JsonBackReference(value = "userWallet")
	@OneToOne
	@NotNull
	@JoinColumn(name="idUser")
	private User user;
	
	@NotNull
    private Double value;

	@NotNull
    private Double percentage_change_1h;

	@NotNull
    private Double percentage_change_24h;

	@NotNull
    private Double percentage_change_7d;

    private Double top_limit;

    private Double bottom_limit;

	@JsonBackReference(value="coinWalletWallet")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="wallet")
	@Transient
	private List<Coin_Wallet> coin_wallets = new ArrayList<>();

	@JsonBackReference(value = "walletWarning")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="wallet")
	@Transient
	private List<Warning> warnings = new ArrayList<>();
	
	

	public Wallet() {
		super();
	}   

	public Wallet(Long id, @NotNull User user, @NotNull Double value, @NotNull Double percentage_change_1h,
			@NotNull Double percentage_change_24h, @NotNull Double percentage_change_7d) {
		super();
		this.id = id;
		this.user = user;
		this.value = value;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
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

	public List<Coin_Wallet> getCoin_wallets() {
		return coin_wallets;
	}

	public void setCoin_wallets(List<Coin_Wallet> coin_wallets) {
		this.coin_wallets = coin_wallets;
	}

	public List<Warning> getWarnings() {
		return warnings;
	}

	public void setWarnings(List<Warning> warnings) {
		this.warnings = warnings;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bottom_limit == null) ? 0 : bottom_limit.hashCode());
		result = prime * result + ((coin_wallets == null) ? 0 : coin_wallets.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((percentage_change_1h == null) ? 0 : percentage_change_1h.hashCode());
		result = prime * result + ((percentage_change_24h == null) ? 0 : percentage_change_24h.hashCode());
		result = prime * result + ((percentage_change_7d == null) ? 0 : percentage_change_7d.hashCode());
		result = prime * result + ((top_limit == null) ? 0 : top_limit.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		result = prime * result + ((warnings == null) ? 0 : warnings.hashCode());
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
		Wallet other = (Wallet) obj;
		if (bottom_limit == null) {
			if (other.bottom_limit != null)
				return false;
		} else if (!bottom_limit.equals(other.bottom_limit))
			return false;
		if (coin_wallets == null) {
			if (other.coin_wallets != null)
				return false;
		} else if (!coin_wallets.equals(other.coin_wallets))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		if (top_limit == null) {
			if (other.top_limit != null)
				return false;
		} else if (!top_limit.equals(other.top_limit))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		if (warnings == null) {
			if (other.warnings != null)
				return false;
		} else if (!warnings.equals(other.warnings))
			return false;
		return true;
	}

	
}
