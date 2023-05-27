package com.personagen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@EnableMongoRepositories
@SpringBootApplication
public class CrudUsuariosMongoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudUsuariosMongoRestApplication.class, args);
	}

	@Bean
	ValidatingMongoEventListener validatingMongoEventListener(final LocalValidatorFactoryBean factory) {
		return new ValidatingMongoEventListener(factory);
	}

}
