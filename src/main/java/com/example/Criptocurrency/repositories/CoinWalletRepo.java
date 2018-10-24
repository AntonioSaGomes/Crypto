package com.example.Criptocurrency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Criptocurrency.model.Coin_Wallet;
import com.example.Criptocurrency.model.Coin_Wallet_PKey;

@Repository
public interface CoinWalletRepo extends JpaRepository<Coin_Wallet, Coin_Wallet_PKey>{

}
