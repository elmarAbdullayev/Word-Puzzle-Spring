package com.hangmanspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class HangmanspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HangmanspringApplication.class, args);


    }
}
