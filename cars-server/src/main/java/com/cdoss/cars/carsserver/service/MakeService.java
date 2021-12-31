package com.cdoss.cars.carsserver.service;

import java.util.List;

import com.cdoss.cars.carsserver.persistence.make.Make;

public interface MakeService {
	public List<Make> getAllMakes();
	public Make getMakeByName(String name);
}
