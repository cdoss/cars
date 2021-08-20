package com.cdoss.cars.carsserver.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cdoss.cars.carsserver.persistence.make.Make;

public interface MakeService {

	public List<Make> getAllMakes();
}
