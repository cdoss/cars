package com.cdoss.cars.carsserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdoss.cars.carsserver.persistence.make.Make;
import com.cdoss.cars.carsserver.persistence.model.Model;
import com.cdoss.cars.carsserver.persistence.model.ModelRepository;

@Service
public class ModelServiceImpl implements ModelService {

	@Autowired
	private ModelRepository modelRepository;
	
	public List<Model> getAllModels() {
		return modelRepository.findAll();
	}
	
	public List<Model> getModelsByMake(Make make) {
		return modelRepository.findByMake(make);
	}
}
