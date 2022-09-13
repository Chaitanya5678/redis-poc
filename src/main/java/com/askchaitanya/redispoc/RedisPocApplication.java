package com.askchaitanya.redispoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableCaching
public class RedisPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisPocApplication.class, args);
	}

}
