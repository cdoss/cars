package com.cdoss.cars.carsserver.service;

import java.util.List;

import com.cdoss.cars.carsserver.persistence.make.Make;
import com.cdoss.cars.carsserver.persistence.model.Model;

public interface ModelService {
	public List<Model> getAllModels();
	public List<Model> getModelsByMake(Make make);
}
