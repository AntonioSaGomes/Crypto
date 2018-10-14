/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author sagomes
 */
@Entity
@Table(name = "coin")

public class Coin implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_coin;
	
	@OneToMany(mappedBy="coin")
	private List<Coin_wallet> coin_wallet;
	
	@OneToMany(mappedBy="coin")
	private List<Coin_Data> coin_data;
    
    @NotBlank
    private String name;

    @NotBlank
    private String shortname;
    
    @NotBlank
    private String logo;
    
    @NotBlank
    private double percentage_change_1h;
    
    @NotBlank
    private double percentage_change_24h;
     
    @NotBlank
    private double percentage_change_7d;
    
    
    
    public List<Coin_wallet> getCoin_wallet() {
		return coin_wallet;
	}

	public void setCoin_wallet(List<Coin_wallet> coin_wallet) {
		this.coin_wallet = coin_wallet;
	}

	public List<Coin_Data> getCoin_data() {
		return coin_data;
	}

	public void setCoin_data(List<Coin_Data> coin_data) {
		this.coin_data = coin_data;
	}

	/**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the shortname
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * @param shortname the shortname to set
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    /**
     * @return the percentage_change_1h
     */
    public double getPercentage_change_1h() {
        return percentage_change_1h;
    }

    /**
     * @param percentage_change_1h the percentage_change_1h to set
     */
    public void setPercentage_change_1h(double percentage_change_1h) {
        this.percentage_change_1h = percentage_change_1h;
    }

    /**
     * @return the percentage_change_24h
     */
    public double getPercentage_change_24h() {
        return percentage_change_24h;
    }

    /**
     * @param percentage_change_24h the percentage_change_24h to set
     */
    public void setPercentage_change_24h(double percentage_change_24h) {
        this.percentage_change_24h = percentage_change_24h;
    }

    /**
     * @return the percentage_change_7d
     */
    public double getPercentage_change_7d() {
        return percentage_change_7d;
    }

    public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void setPercentage_change_7d(double percentage_change_7d) {
		this.percentage_change_7d = percentage_change_7d;
	}

	/**
     * @return the id_coin
     */
    public Long getId_coin() {
        return id_coin;
    }

    /**
     * @param id_coin the id_coin to set
     */
    public void setId_coin(Long id_coin) {
        this.id_coin = id_coin;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coin_data == null) ? 0 : coin_data.hashCode());
		result = prime * result + ((coin_wallet == null) ? 0 : coin_wallet.hashCode());
		result = prime * result + ((id_coin == null) ? 0 : id_coin.hashCode());
		result = prime * result + ((logo == null) ? 0 : logo.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(percentage_change_1h);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(percentage_change_24h);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(percentage_change_7d);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (coin_data == null) {
			if (other.coin_data != null)
				return false;
		} else if (!coin_data.equals(other.coin_data))
			return false;
		if (coin_wallet == null) {
			if (other.coin_wallet != null)
				return false;
		} else if (!coin_wallet.equals(other.coin_wallet))
			return false;
		if (id_coin == null) {
			if (other.id_coin != null)
				return false;
		} else if (!id_coin.equals(other.id_coin))
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
		if (Double.doubleToLongBits(percentage_change_1h) != Double.doubleToLongBits(other.percentage_change_1h))
			return false;
		if (Double.doubleToLongBits(percentage_change_24h) != Double.doubleToLongBits(other.percentage_change_24h))
			return false;
		if (Double.doubleToLongBits(percentage_change_7d) != Double.doubleToLongBits(other.percentage_change_7d))
			return false;
		if (shortname == null) {
			if (other.shortname != null)
				return false;
		} else if (!shortname.equals(other.shortname))
			return false;
		return true;
	}
    
    
   
}
