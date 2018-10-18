package com.example.Criptocurrency;

import ch.qos.logback.core.net.server.Client;
import com.example.Criptocurrency.model.Coin;
import com.example.Criptocurrency.repositories.CoinRepo;
import java.util.List;
import java.util.Optional;
import javafx.collections.transformation.FilteredList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CriptocurrencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriptocurrencyApplication.class, args);
                
                
	}
        
}
