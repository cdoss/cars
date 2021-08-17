package com.cdoss.cars.carsserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdoss.cars.carsserver.persistence.Manufacturer;
import com.cdoss.cars.carsserver.persistence.ManufacturerRepository;

@RestController
public class CarsController {

	@Autowired
	private ManufacturerRepository manufacturerRepository;
	
	@GetMapping("/manufacturers")
	public ResponseEntity<List<Manufacturer>> getManufacturers() {
		List<Manufacturer> manufacturers = manufacturerRepository.findAll();
		return new ResponseEntity<List<Manufacturer>>(manufacturers, HttpStatus.OK);
	}
}
