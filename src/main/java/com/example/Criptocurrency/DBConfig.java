/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Criptocurrency;

import javax.activation.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author sagomes
 */
@Configuration
public class DBConfig{

       @Bean
       public DataSource dataSource(){
          DriverManagerDataSource dataSource = new DriverManagerDataSource();
          dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
          dataSource.setUrl("localhost:1527/crypto  ");
          dataSource.setUsername( "crypto" );
          dataSource.setPassword( "admin" );
          return (DataSource) dataSource;
       }

}