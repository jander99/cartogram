package com.github.jander99.cartogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CartogramApplication {

    public static void main(String[] args) {
        SpringApplication.run(CartogramApplication.class, args);
    }

}
