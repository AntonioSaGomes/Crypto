package com.example.Criptocurrency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Criptocurrency.model.Coin_Data;
import com.example.Criptocurrency.model.Coin_Data_PKey;

@Repository
public interface CoinDataRepo extends JpaRepository<Coin_Data, Coin_Data_PKey>{

}
