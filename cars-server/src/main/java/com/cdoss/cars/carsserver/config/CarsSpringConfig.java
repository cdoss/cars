package com.cdoss.cars.carsserver.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarsSpringConfig {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
