package com.example.Criptocurrency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Criptocurrency.model.Wallet;

@Repository
public interface WalletRepo extends JpaRepository<Wallet, Long> {

}
