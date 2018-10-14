package com.example.Criptocurrency.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Criptocurrency.model.Coin;

@Repository
public interface CoinRepo extends JpaRepository<Coin, Long> {

}
