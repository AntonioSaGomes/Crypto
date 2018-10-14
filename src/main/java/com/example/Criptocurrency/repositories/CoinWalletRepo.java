package com.example.Criptocurrency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Criptocurrency.model.Coin_wallet;
import com.example.Criptocurrency.model.Coin_wallet_PKey;

@Repository
public interface CoinWalletRepo extends JpaRepository<Coin_wallet, Coin_wallet_PKey>{

}
